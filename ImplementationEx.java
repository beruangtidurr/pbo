interface Mengemudi{
    void mulai();
}

class Sepeda implements Mengemudi{
    @Override 
    public void mulai(){
        System.out.println("Sepeda mulai bergerak.");
    }
}

public class ImplementationEx {
    public static void main(String[] args) {
        Sepeda sepeda = new Sepeda();

        sepeda.mulai();
    }
}
