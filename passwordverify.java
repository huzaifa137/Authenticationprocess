package excellent;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
public class passwordverify {
	
	public static void main(String args[]) throws Exception
	{
		
		//we ask the password from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your password");
		String demo =scan.nextLine();	
		
		
		FileReader t1 = new FileReader("G:\\tedd.txt");
		BufferedReader d1 = new BufferedReader(t1);


		//The process to allow the user to write a separate file.		
		FileWriter t2 = new FileWriter("G:\\new.txt");
		BufferedWriter d2 = new BufferedWriter(t2);
		String i=null;
		

		//The logic being used whether the user is authenticated or not.  
		do
		{
			if(demo.equalsIgnoreCase(i))
			{
				System.out.println("\nAccess Granted");
				
				System.out.println("Enter Data in the File");
				String word=scan.nextLine();
				
				d2.write(word);
				System.out.println("\nThe process is completed");
				break;
			}
			
		}
		while((i=d1.readLine())!=null);
		
	d1.close();
	d2.close();
	scan.close();
	}

}