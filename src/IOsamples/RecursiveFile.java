package IOsamples;

import java.io.File;

public class RecursiveFile {

public static void checkdir (File files) {
	if (files.isDirectory()) {
		
		File newdir[]=files.listFiles();
		for (int i=0;i<newdir.length;i++)
		{
			checkdir(newdir[i]);
		}
	}
	else {
		System.out.println(files.getName());
	}
}


	public static void main(String[] args) {
		File dir=new File("E:\\workspace");
		checkdir(dir);
		// TODO Auto-generated method stub
	}

}
