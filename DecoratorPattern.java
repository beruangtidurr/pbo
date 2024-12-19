interface Coffee{
    String getDescription();
    double getCost();
}

class SimpleCoffee implements Coffee{
    public String getDescription(){
        return "Simple Coffee";
    }

    public double getCost(){
        return 5.0;
    }
}

class MilkDecorator implements Coffee{
    private Coffee coffee;

    public MilkDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    public String getDescription(){
        return coffee.getDescription() + " with Milk";
    }

    public double getCost(){
        return coffee.getCost() + 2.0;
    }
}

class SugarDecorator implements Coffee{
    private Coffee coffee;

    public SugarDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    public String getDescription(){
        return coffee.getDescription() + " with Sugar";
    }

    public double getCost(){
        return coffee.getCost() + 1.5;
    }
}



public class DecoratorPattern{
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println("Order type : " + coffee.getDescription());
        System.out.println("Cost : " + coffee.getCost());
    }
}