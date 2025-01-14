class Ruangan {
    String nomorRuangan;

    Ruangan(String nomorRuangan){
        this.nomorRuangan = nomorRuangan;
    }
}

class Gedung{
    String namaGedung;
    Ruangan[] ruangan;

    Gedung(String namaGedung, Ruangan[] ruangan){
        this.namaGedung = namaGedung;
        this.ruangan = ruangan;
    }
}

public class AggregationEx {
    public static void main(String[] args) {
        Ruangan[] ruangan = { new Ruangan("101"), new Ruangan("102") };
        Gedung gedung = new Gedung("Gedung A", ruangan);

        System.out.println("Gedung " + gedung.namaGedung + " memiliki ruangan:");
        for (Ruangan r : gedung.ruangan) {
            System.out.println("- Ruangan " + r.nomorRuangan);
        }
    }
}
