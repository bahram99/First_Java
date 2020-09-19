package Abstract;

public class ShowAnimal extends Animal{
    public void cat(){
        System.out.println("cat");
    }

    @Override
    public final void zebra() {
        System.out.println("zebra");
    }
}
