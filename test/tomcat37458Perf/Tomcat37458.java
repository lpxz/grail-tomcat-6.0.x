package tomcat37458Perf;

import org.apache.catalina.loader.*;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.Permission;
import java.util.List;
import java.util.jar.JarFile;

import org.apache.naming.resources.FileDirContext;


public class Tomcat37458 {

	// 270
	public static void main(String[] args) throws Throwable
	{
		new Tomcat37458().testFindClassWithSecurityManager();

	}
	
	
    /**
     * Tests race condition in {@link WebappClassLoader#findClass()} method.
     * 
     * @see bug 37458
     */
    public  void testFindClassWithSecurityManager() throws Throwable {
        // Find, where the compiled classes are
        URL classesURL = ((URLClassLoader) WebappClassLoader.class
                .getClassLoader()).getURLs()[0];

        File classesPath = new File(classesURL.getPath());

        // The class that we will try loading is testCL.Sealed
        // from testCL.jar
//        final String className = "testCL.Sealed";

        // The testCL.jar is a resource that comes along with this class


        
        boolean smWasSet = false;
        SecurityManager oldSm = System.getSecurityManager();
        if (oldSm == null) {
            System.setSecurityManager(new SecurityManager() {

                @Override
                public void checkPermission(Permission perm, Object context) {
                }

                @Override
                public void checkPermission(Permission perm) {
                }

            });
            smWasSet = true;
        }

        boolean throwableWasCaught = false;
        try {

            // 904.  1098
        	// @WebappClassLoader.java

            int threadNo = 16;
            FindClassThread[] threads= new FindClassThread[threadNo];
            for(int i=0;i<threadNo; i++)
            {
            	WebappClassLoader loader = new WebappClassLoader();

                File testCLJarPath = new File(classesPath, this.getClass().getPackage()
                        .getName().replace('.', '/')
                        + "/testCL"+i+".jar");
                List<String> classesToLoad = PackageUtils.getClasseNamesInPackage(testCLJarPath.toString());
                
                FileDirContext ctx = new FileDirContext();
                ctx.setDocBase(testCLJarPath.getParent().toString());
                loader.setResources(ctx);

                loader.addJar("testCL"+i+".jar", new JarFile(testCLJarPath), testCLJarPath);

                loader.start();
                
            	threads[i] = new FindClassThread(loader,classesToLoad); 
            }
           

            long start = System.currentTimeMillis();
             for(int i=0;i<threadNo;i++)
             {
            	 threads[i].start();
             }
             for(int i=0;i<threadNo;i++)
             {
            	 threads[i].join();
             }
            
            long end = System.currentTimeMillis();
            System.out.println("duration: " + (end-start));
            


            //assertNotNull("Result 1 was null", th1.result);
            //assertNotNull("Result 2 was null", th2.result);
            //assertEquals(th1.result, th2.result);

        } catch (Throwable th) {
            throwableWasCaught = true;
            throw th;
        } finally {
            if (smWasSet) {
                try {
                    System.setSecurityManager(oldSm);
                } catch (RuntimeException ex) {
                    RuntimeException ex2 = new RuntimeException(
                            "Failed to restore SecurityManager", ex);
                    if (!throwableWasCaught) {
                        throw ex2;
                    }
                    // something more serious happened, let's just print out
                    //ex2.printStackTrace();
                }
            }
        }
    }
}
