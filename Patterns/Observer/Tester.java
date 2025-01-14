public class Tester {
    public static void main(String[] args) {
        Gojek gojek = new Gojek();

        // Observer
        Ojek rider1 = new Ojek("Gojo", gojek);
        Ojek rider2 = new Ojek("Itadori", gojek);
        Ojek rider3 = new Ojek("Fushiguro", gojek);

        gojek.attach(rider1);
        gojek.attach(rider2);
        gojek.attach(rider3);

        gojek.addOrder("Pesanan baru 1");
        gojek.addOrder("Pesanan baru 2");
    }
}
