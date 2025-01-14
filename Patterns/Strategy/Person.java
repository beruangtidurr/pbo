public class Person {
    private Transportation transportation;
    private String name;    

    public Person(String name){
        this.name = name;
    }

    public void setTransportation(Transportation transportation){
        this.transportation = transportation;
    }

    public void travel(String source, String destination){
        System.out.printf("%s travel from %s to %s %s%n", this.name, source, destination, this.transportation.getVehicle());
    }
}
