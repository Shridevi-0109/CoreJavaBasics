package IOsamples;

import java.io.File;

public class CreateFileSample {

	public static void main(String[] args) {		
    //File dir = new File("new file directory");
    File dir = new File("D:\\SDET training WS");
    File Files[]=dir.listFiles();
    for(int i=0; i<Files.length; i++)
    {
    	System.out.println(Files[i].isDirectory());
    }
    boolean value = false;
    try {
    	boolean isDir = dir.mkdir();
    	System.out.println(dir.getAbsolutePath());
    	System.out.println(dir.getPath());
    	System.out.println(dir.exists());   	
    	if(isDir) {
    		File file = new File(dir.getAbsolutePath()+"\\newFile.txt");
    		value = file.createNewFile();		
    	}
    	
    	if(value) {
    		System.out.println(" new file is created");
    	}
    }
    	catch(Exception e) {
    		e.getStackTrace();
    		
    	}
	}

}
