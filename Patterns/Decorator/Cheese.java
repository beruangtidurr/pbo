public class Cheese extends BaseDecorator {
    public Cheese(BurgerComponent component){
        super(component);
    }

    @Override 
    public void show(){
        super.show();
        System.out.println("Cheese");
    }
}
