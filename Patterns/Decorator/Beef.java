public class Beef extends BaseDecorator {
    public Beef(BurgerComponent component){
        super(component);
    }

    @Override 
    public void show(){
        super.show();
        System.out.println("Beef");
    }
}
