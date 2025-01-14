class Pelanggan{
    String nama;

    Pelanggan(String nama){
        this.nama = nama;
    }
}

class Pesanan{
    int nomorPesanan;

    Pesanan(int nomorPesanan){
        this.nomorPesanan = nomorPesanan;
    }
}

public class AssociationEx {
    public static void main(String[] args) {
        Pelanggan pelanggan = new Pelanggan("John");
        Pesanan pesanan = new Pesanan(1);

        System.out.println("Pelanggan : " + pelanggan.nama + " dengan no. antrian : " + pesanan.nomorPesanan);
    }
}
