package noonesaroundtohelp;

import java.io.*;

public class Tester {

	public static void main(String args[]) {
		File image1 = null;
		BufferedReader copy = null;
		
		
		try {
			image1 = new File("C:\\Users\\josem\\Documents\\Artwork i liked\\5c7.jpg");
			copy =  new BufferedReader(new FileReader(image1));
			
			
			
		}catch(IOException ioe){
			System.out.println("Is anybody there? \n >" + ioe.getMessage());
			
		}
		                        

	}

}
