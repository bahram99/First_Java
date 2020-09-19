package DataBase;

import java.util.*;

public class Concurrent {
    public int a;
    public int b;

    public Concurrent(int a , int b){
        this.a=a;
        this.b=b;
    }

    Integer[] arr = new Integer[10];


    public TreeSet<Integer> getTree() {
        return tree;
    }
    public void setTree(int  item) {
        this.tree.add(item);
    }

    TreeSet<Integer> tree = new TreeSet<>();

    List<String> list = new ArrayList<>();

    public List<String> getList() {
        Collections.shuffle(list);
        return list;
    }
    public void setlisttwo(){
        Collections.addAll(list,"a","b","d","f","c");
    }
    public void setList(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            if (str.startsWith("ali")) {
                it.remove();
            }
        }
    }

    public Integer[] getArr() {
        return arr;
    }

    public void setArr(int id) {
        Arrays.fill(arr,id);
    }

    public void show() {
        System.out.println(list);
        System.out.println("hello");
    }

    public int compare(){
        return (Integer.compare(this.a, this.b));
    }


}
