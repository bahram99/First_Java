package javaIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Filetest {
    public static void main(String[] arg) throws IOException {
/*
        File fo = new File("C:\\Users\\bahra\\Desktop\\java\\testfile.txt");
        try {
            if (fo.createNewFile()) {
                System.out.println("the file name is :" + fo.getName());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        FileWriter write = new FileWriter("testfile.txt");
        write.write("Successfully wrote to the file.");
        write.close();
*/
        show(); 
    }

    public static void show() throws FileNotFoundException {
     try {
         File myfile = new File("C:\\Users\\bahra\\Desktop\\java\\testfile.txt");
         Scanner scan = new Scanner(myfile);
         while (scan.hasNext()){
             String res = scan.nextLine();
             System.out.println(res);
         }
         scan.close();
     }catch (FileNotFoundException e){
         System.out.println(e.getMessage());
     }
    }
}
