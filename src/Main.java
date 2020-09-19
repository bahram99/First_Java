import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static Arraylist arrlist = new Arraylist();

    public static void main(String[] args) {
        int choice = 0;
        boolean quit = false;

        while (!quit) {
            System.out.println("Enter your choice :");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    printindex();
                    break;
                case 4:
                    edititem();
                    break;
                case 5:
                    removeitem();
                    break;
                case 6:
                    searchitem();
                    break;
            }
        }

        Myname nam = new Myname();
        nam.full();
    }

    public static void printInstructions() {
        System.out.println("\nPress number ");
    }

    public static void printList() {
        arrlist.printall();
    }

    public static void addItem() {
        System.out.println("Enter Your item :");
        arrlist.add(scan.nextLine());
    }

    public static void printindex(){
        System.out.println("please enter your index :");
        int i = scan.nextInt();
        arrlist.printitem(i);
    }
    public static void edititem(){
        System.out.println("enter your index for edit");
        int ed = scan.nextInt();
        scan.nextLine();
        System.out.println("enter your item for edit");
        String item = scan.nextLine();
        arrlist.edit(ed,item);
    }
    public static void removeitem(){
        System.out.println("item for remove");
        int i = scan.nextInt();
        arrlist.remove(i);
    }
    public static void searchitem(){
        System.out.println("enter for search :");
        String item = scan.nextLine();
        if(arrlist.search(item) < 0){
            System.out.println("not found!!!");
        }else {
            System.out.println("thats right");
        }
    }
}
