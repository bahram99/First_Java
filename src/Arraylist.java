import java.util.ArrayList;

public class Arraylist {
    private ArrayList<String> arr = new ArrayList<String>();

    public void add(String item) {
        arr.add(item);
    }

    public void printall() {
        System.out.println("You have " + arr.size() + " item in your List ...");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println((i + 1) + ". " + arr.get(i));
        }
    }

    public void printitem(int i){
        System.out.println("result : "+arr.get(i-1));
    }

    public void edit(int i , String item){
        arr.set(i-1,item);
        System.out.println("the edit item is ==> "+arr.get(i-1));
    }
    public void remove(int i){
        arr.remove(i);
    }
    public int search(String item){
       return arr.indexOf(item);
    }
}
