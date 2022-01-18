

import java.io.File;
import java.io.IOException;

public class FileHandalingMechanism {
		public static void main(String[] args) {
		File f1 = new File("D:\\File1.txt"); // create a file
		if(f1.exists()==false) // to check files is already present or not
		{
		 
		try {
			f1.createNewFile(); //create the file 
			System.out.println("file created");
			
		}
		 
		catch (IOException e){ 
			e.printStackTrace();
		}
	}
		 
		else
		{
		System.out.println("folder is already exists");
		}
	}
}

