class Kendaraan{
    void bergerak(){
        System.out.println("Kendaraan bergerak.");
    }
}

class Mobil extends Kendaraan{
    void nyalakanMesin(){
        System.out.println("Mesin mobil dinyalakan");
    }
}

public class InheritanceEx {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.bergerak();  // memanggil method dari parent class 
        mobil.nyalakanMesin(); // memanggil method dari subclass
    }
}
