public class Apart {
    private String id;
    private String name;
    private String building;
    private String room;
    private boolean rentStatus;

    public Apart(String id, String name, String building, String room){
        this.id = id;
        this.name = name;
        this.building = building;
        this.room = room;
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

    public String getBuilding() {
        return building;
    }

    public String getRoom() {
        return room;
    }

    public boolean isRentStatus() {
        return rentStatus;
    }

    
}
