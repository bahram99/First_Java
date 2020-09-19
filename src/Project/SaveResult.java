package Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveResult {
    public static  File file = new File("C:\\Users\\bahra\\Desktop\\java\\result.txt");
    public static Scanner scan;


    public SaveResult() {
        save();
    }

    public static void save(){
        try {
            if(file.createNewFile()){
                System.out.println("new file added");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void write(String x){
         try {
             FileWriter fi = new FileWriter(file.getAbsoluteFile(),true);
             fi.write(x);
             System.out.println("write on text file");
             fi.close();
         }catch (IOException e){
             System.out.println(e.getMessage());
         }
    }

    public void reader(){
        try {
            scan = new Scanner(file);
            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
