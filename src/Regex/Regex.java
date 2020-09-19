package Regex;
import java.util.Scanner;
import java.util.regex.*;

public class Regex {
    public static void main(String[] arg){

/*
        Pattern pat = Pattern.compile("salam");
        Matcher mach= pat.matcher("sal");
        Boolean flag = mach.matches();
        System.out.println(flag);
*/

        Boolean res = Pattern.compile("rest").matcher("...t").matches();
        System.out.println(res);

        Scanner scan = new Scanner(System.in);

        System.out.println("enter text");
        Pattern pat = Pattern.compile(scan.nextLine());
        System.out.println("second ...");
        Matcher mach = pat.matcher(scan.nextLine());

        Boolean flag = mach.matches();
        if(flag) {
            System.out.println("found it (:"+mach.start() + " and "+mach.end());
        }else {
            System.out.println("not found");
        }
    }
}

