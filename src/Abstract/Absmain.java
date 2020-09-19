package Abstract;
import java.time.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Absmain {
    public static void main(String[] arg){
        Animal an = new ShowAnimal();
        an.cat();
        an.dog();
        an.zebra();
        var f = new inheritance();

        var date = LocalTime.now();
        System.out.println(date);

        HashMap<Integer, String> hash = new HashMap<Integer, String>();
        hash.put(1,"one");
        hash.put(2,"two");
        for (String i: hash.values()){ //or keyset()
            System.out.println(i);
        }

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("ali");
        hashSet.add("amir");
        hashSet.add("saman");
        hashSet.add("ali");

        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        Pattern pat = Pattern.compile("asd");
        Matcher mat = pat.matcher("salam hello bahram");
        boolean flag = mat.find();

        String res = (flag) ? "ok" : "err";
        System.out.println(res);

        var thread = new Thread();
        thread.start();
        while (thread.isAlive()){
            System.out.println("waite...");
        }
        System.out.println("pay is "+thread.pay);
        thread.pay++;
        System.out.println("pay is the :"+thread.pay);

    }
}
