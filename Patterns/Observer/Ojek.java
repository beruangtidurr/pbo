import java.util.List;

public class Ojek implements Observer {
    private String nama;
    private Gojek gojek;

    public Ojek(String nama, Gojek gojek){
        this.nama = nama;
        this.gojek = gojek;
    }

    public void update(){
        List<String> orders = this.gojek.getOrder();
        for(String order: orders){
            System.out.println(this.nama + " get order: " + order);
        }
    }
}
