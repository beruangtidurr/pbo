public class House {
    private String id;
    private String name;
    private String address;
    private boolean rentStatus;

    public House(String id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
        this.rentStatus = false;
    }

    public void rent(){
        this.rentStatus = true;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public boolean isRentStatus() {
        return rentStatus;
    }

    
}
