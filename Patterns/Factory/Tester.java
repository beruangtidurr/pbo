public class Tester {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "4GB", "1TB", "Ryzen 7");
        Computer server = ComputerFactory.getComputer("server", "32GB", "8TB", "Intel Xeon");

        System.out.println(pc);
        System.out.println(server);
    }
}
