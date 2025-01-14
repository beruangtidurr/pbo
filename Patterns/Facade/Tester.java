public class Tester {
    public static void main(String[] args) {
        PropertyAgent agent = new PropertyAgent();

        agent.addApart("1", "Galcim 1", "Galcim", "101");
        agent.addApart("2", "Galcim 2", "Galcim", "103");
        agent.addHouse("3", "Lembang", "Jl Raya Lembang no.123");
        agent.rentApart("2");
        System.out.println(agent.showAllProperty());
    }
}
