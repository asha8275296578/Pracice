

/*import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class fidemo 
{
	public static void main(String []args)
	{
		boolean success=false;
		Scanner s=new Scanner(System.in);
        System.out.println("Enter path of directory to create");
        String dir = s.nextLine();

        // Creating new directory in Java, if it doesn't exists
        File directory = new File(dir);
        if (directory.exists())
        {
            System.out.println("Directory already exists ...");

        }
        else
        {
            System.out.println("Directory not exists, creating now");

            success = directory.mkdir();
            
            if (success)
            {
                System.out.printf("Successfully created new directory : %s%n", dir);
            }
            else
            {
                System.out.printf("Failed to create new directory: %s%n", dir);
            }
        }
        // Creating new file in Java, only if not exists
        System.out.println("Enter file name to be created ");
        String filename = s.nextLine();

        File f = new File(filename);
        if (f.exists()) 
        {
            System.out.println("File already exists");

        } 
        else 
        {
            System.out.println("No such file exists, creating now");
            try {
				success = f.createNewFile();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
            if (success)
            {
                System.out.printf("Successfully created new file: %s%n", f);
            } 
            else
            {
                System.out.printf("Failed to create new file: %s%n", f);
            }
        }

        // close Scanner to prevent resource leak
        s.close();

    }
}
*/
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
class fidemo
{
	public static void main(String []args)
	{
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter the path");
		String path=s.nextLine();
		File folder=new File(path);

		
		if(folder.isDirectory())
		{
			File[]filelist=folder.listFiles();
			System.out.println("the total no of items present in directory:"+filelist.length);
			
			// Arrays.sort(filelist);
			 for(File file:filelist)
             {
                 System.out.println(file.getName());
             }
			
		}
		else
		{
			System.out.println("directory does not exists to the specified path");
		}
			
	}
}
	


