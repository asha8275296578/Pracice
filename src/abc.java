import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

    public class abc {

        public void userInput()
        {
            Scanner scanner = new Scanner( System.in );
            System.out.println("Enter the file path: ");
            String dirPath = scanner.nextLine(); // Takes the directory path as the user input

            File folder = new File(dirPath);
            if(folder.isDirectory())
            {
                File[] fileList = folder.listFiles();

                Arrays.sort(fileList);

                System.out.println("\nTotal number of items present in the directory: " + fileList.length );


               // Lists only files since we have applied file filter
                for(File file:fileList)
                {
                    System.out.println(file.getName());
                }
            }
        }
    }
