package Exception;

public class Testexception {
    public static void main(String[] arg) throws Exception {
        try {
            int date = 1 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("number a");
        System.out.println(Runtime.getRuntime().maxMemory());
        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println(Runtime.getRuntime().freeMemory());

        try {
            System.out.println("first try");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("start finally");
        }

        showthrow(55);
        System.gc();
    }

    public static void showthrow(int a) throws Exception {
        if(a > 10){
            throw new Exception("number is big");
        }else {
            System.out.println("all right (: ");
        }
    }
}
