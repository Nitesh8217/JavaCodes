package learnJava;

import java.io.*;

public class Creating_csv_file 
{

	public static void main(String[] args) 
	
	{
		try
		{
			PrintWriter PrintWriterobject = new PrintWriter(new File("D:\\Nitesh\\create.csv"));
			StringBuilder StringBuilderobject = new StringBuilder();
			
			StringBuilderobject.append("sl_no");
			StringBuilderobject.append(",");
			StringBuilderobject.append("book_name");
			StringBuilderobject.append(",");
			StringBuilderobject.append("category");
			StringBuilderobject.append("\n");
			
			StringBuilderobject.append("1");
			StringBuilderobject.append(",");
			StringBuilderobject.append("book_name 1");
			StringBuilderobject.append(",");
			StringBuilderobject.append("category 1");
			StringBuilderobject.append("\n");
			
			StringBuilderobject.append("2");
			StringBuilderobject.append(",");
			StringBuilderobject.append("book_name 2");
			StringBuilderobject.append(",");
			StringBuilderobject.append("category 2");
			StringBuilderobject.append("\n");
			
			PrintWriterobject.write(StringBuilderobject.toString());
			PrintWriterobject.close();
			System.out.println("FINISHED");
			
		}
		catch(Exception e)
		{  
			e.getCause();
			
		}
	}
}

