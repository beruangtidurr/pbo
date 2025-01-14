public class Tester {
    public static void main(String[] args) {
        BurgerComponent beefCheeseBurger = new Beef(new Cheese(new Bun()));

        BurgerComponent tripleBeefBurger = new Beef(new Beef( new Beef(new Bun())));

        beefCheeseBurger.show();
        tripleBeefBurger.show();
    }
}
