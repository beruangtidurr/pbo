class Bab{
    String judulBab;

    Bab(String judulBab){
        this.judulBab = judulBab;
    }
}

class Buku{
    String judul;
    Bab[] bab;

    Buku(String judul, Bab[] bab){
        this.judul = judul;
        this.bab = bab;
    }
}

public class CompositionEx {
    public static void main(String[] args) {
        Bab[] bab = { new Bab("Pendahuluan"), new Bab("Isi"), new Bab("Penutup") };
        Buku buku = new Buku("Belajar Java", bab);

        System.out.println("Buku: " + buku.judul);
        for (Bab b : buku.bab) {
            System.out.println("- Bab: " + b.judulBab);
        }
    }
}
