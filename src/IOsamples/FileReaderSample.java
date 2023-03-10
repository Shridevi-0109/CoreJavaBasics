package IOsamples;

import java.io.FileReader;

public class FileReaderSample {

	public static void main(String[] args) {	
		//creates an array of character
		char[] array = new char [100];
		
		try {
			//creates a reader using the FileReader
			FileReader input = new FileReader("input.txt");
			
			//Reads characters
			input.read(array);
			
			System.out.println("Data in the file: ");
			
			System.out.println(array);
			
			//closes the reader
			input.close();
		}
        catch(Exception e)
		{
        	e.getStackTrace();
        	//System.out.println(e.toString());
		}
	}

}
