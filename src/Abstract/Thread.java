package Abstract;

public class Thread extends java.lang.Thread {
    public int pay = 0;
    public void run(){
        pay++;
        System.out.println("this is thread !!!");
    }
}
