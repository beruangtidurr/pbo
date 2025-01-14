public class Tester {
    public static void main(String[] args) {
        Person p = new Person("Cappy");
        p.setTransportation(new Car());
        p.travel("BDG", "JKT");
        p.setTransportation(new Plane());
        p.travel("JKT", "SWISS");
    }
}
