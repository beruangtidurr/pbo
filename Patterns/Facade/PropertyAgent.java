public class PropertyAgent{
    private ApartmentSystem apartSys;
    private HouseSystem houSys;

    public PropertyAgent(){
        this.apartSys = new ApartmentSystem();
        this.houSys = new HouseSystem();
    }


    public String showAllProperty(){
        return this.apartSys.showAll() + this.houSys.showAll();
    }

    public void addApart(String id, String name, String building, String room){
        this.apartSys.addApart(id, name, building, room);
    }

    public void addHouse(String id, String name, String address){
        this.houSys.addHouse(id, name, address);
    }

    public void rentHouse(String id){
        this.houSys.rent(id);
    }
    
    public void rentApart(String id){
        this.apartSys.rent(id);
    }
}