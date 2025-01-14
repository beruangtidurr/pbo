import java.util.LinkedList;
import java.util.List;

public class ApartmentSystem {
    private List<Apart> list;

    public ApartmentSystem(){
        this.list = new LinkedList<>();
    }

    public void addApart(String id, String name, String building, String room){
        this.list.add(new Apart(id, name, building, room));
    }

    public void rent(String id){
        for(Apart apart : list){
            if(apart.getId().equals(id)){
                apart.rent();
            }
        }
    }

    public String showAll(){
        String str = "";
        for(Apart apart : list){
            str += apart.getId() + " : " + apart.getName() + "\n";
        }

        return str;
    }

}
