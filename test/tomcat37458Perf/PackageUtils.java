package tomcat37458Perf;
import java.util.jar.*;
import java.util.*;
import java.io.*;

public class PackageUtils {

	 private static boolean debug = true;

	 public static List getClasseNamesInPackage
	     (String jarName){
	   ArrayList classes = new ArrayList ();

	   try{
	     JarInputStream jarFile = new JarInputStream
	        (new FileInputStream (jarName));
	     JarEntry jarEntry;

	     while(true) {
	       jarEntry=jarFile.getNextJarEntry ();
	       if(jarEntry == null){
	         break;
	       }
	       if(
	            (jarEntry.getName ().endsWith (".class")) ) {
		         String classnameString =jarEntry.getName().replaceAll("/", "\\.");
		         int index = classnameString.lastIndexOf("class");
		         String realClasString =classnameString.substring(0, index-1);
		         
	         if (debug) System.out.println 
	           ("Found " + realClasString);

	         classes.add (realClasString);
	         
	       }
	     }
	   }
	   catch( Exception e){
	     e.printStackTrace ();
	   }
	   return classes;
	}
	 
	 
	 public static void main (String[] args){
		   List list =  PackageUtils.getClasseNamesInPackage
		        ("/home/lpxz/eclipse/workspacegrail/tomcat-6.0.x/test/tomcat37458Perf/sealed.jar");
		   System.out.println(list);

		  }
	 
}