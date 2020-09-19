package Abstract;

abstract class Animal implements Ianimal{
    public void dog() {
        System.out.println("dog");
    }

    public abstract void zebra();
    public void sleep(){
        System.out.println("Zzzz...");
    }
}
