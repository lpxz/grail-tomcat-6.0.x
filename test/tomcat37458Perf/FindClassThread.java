package tomcat37458Perf;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.loader.WebappClassLoader;

/**
 * A runnable thread that calls a method of WebappClassLoader.
 */
public class FindClassThread extends Thread {
    private WebappClassLoader loader;
    public Class<?> result;
    public Throwable exception;

    public List<String> classesList  = null;
    
    public FindClassThread(WebappClassLoader loader, List<String> classesarg) {
        this.loader = loader;
        classesList = classesarg;
    }

    @Override
    public void run() {
    	
        try {
        	while(true){
        	String toRemoveString = null;
        	synchronized (classesList) {
        		if(classesList.size()!=0)
        		toRemoveString=classesList.remove(0);
        		
			}
        	
        	if(toRemoveString!=null)
        	{
        		try {
        			result = loader.findClass(toRemoveString);
				} catch (Throwable e) {
//					e.printStackTrace();
				}
        		
        		
        	}
        	else {
				break;
			}
        	}
        } catch (Throwable th) {
        	"reCrash_with".equals(th);
            this.exception = th;
        }
    }
}
