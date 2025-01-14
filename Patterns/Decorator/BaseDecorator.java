public abstract class BaseDecorator implements BurgerComponent{
    private BurgerComponent component;

    public BaseDecorator(BurgerComponent component){
        this.component = component;
    }

    @Override 
    public void show(){
        component.show();
    }
}
