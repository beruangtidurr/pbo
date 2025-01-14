import java.util.LinkedList;
import java.util.List;

public class HouseSystem {
    private List<House> list;

    public HouseSystem(){
        this.list = new LinkedList<>();
    }

    public void addHouse(String id, String name, String address){
        this.list.add(new House(id, name, address));
    }

    public void rent(String id){
        for(House house : list){
            if(house.getId().equals(id)){
                house.rent();
            }
        }
    }

    public String showAll(){
        String str = "";
        for(House house : list){
            str += house.getId() + " : " + house.getName() + "\n";
        }

        return str;
    }

}
