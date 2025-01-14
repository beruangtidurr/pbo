public class Visibility{
    String name;

    public void sayHello(){
        System.out.println("Hello, Public");
    }

    private void sayHelloPrivate(){
        System.out.println("Hello, Private");
    }

    protected void sayHelloProtect(){
        System.out.println("Hello, Protected");
    }

    protected void setName(String name){
        this.name = name;
    }

    protected String getName(){
        return this.name;
    }
}