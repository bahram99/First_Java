package Phonebook;

import java.lang.ref.SoftReference;
import java.util.*;

public class Mainbook {
    public static void main(String[] args) {
       /* var db = new Database();
        db.Open();

        var personRepository = new PersonRepository(db.getConnection());
        var list = personRepository.GetPeople();
        System.out.println("Count Of Person in People table is :" + list.size());

        System.out.println("enter id to get name");
        Scanner scan = new Scanner(System.in);
        personRepository.join(scan.nextInt());

        db.Close();*/

        Random rand = new Random();

        List<String> arr = new ArrayList<String>();
        arr.add("A");
        arr.add("b");
        arr.add("c");
        arr.add("d");
        arr.add("e");

        System.out.println(arr.get(rand.nextInt(5)));

        /*for (String i: arr) {
            System.out.println("the res is "+i.charAt(2));
        }*/
        System.out.println(arr.indexOf("A"));
        HashMap<Integer, String> hash = new HashMap<Integer, String>();
        hash.put(1, "one");
        hash.put(2, "two");

        String res = hash.get(1);

        System.out.println(res);

        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);

        Object[] newnum = num.toArray();

        for (Object obj : newnum) {
            Integer item = (Integer) obj;
            System.out.println(item);
        }
        System.out.println(num.contains(2));

        Map<Integer, String> mhas = new HashMap<Integer, String>();

        mhas.putAll(hash);

        System.out.println(mhas.size());
        Collection<String> val = hash.values();
        for (String z : val) {
            System.out.println(z);
        }

        Set<Integer> key = hash.keySet();
        for(Integer i : num){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}
