 class Pesanan{
    public void tambahItem(){
        System.out.println("Item ditambahkan ke pesanan.");
    }
}

 class Pemesan{
    public void buatPesanan( Pesanan pesanan){
        System.out.println("Pesanan dibuat.");

        pesanan.tambahItem();
    }
}

public class DependencyEx {
    public static void main(String[] args) {
        Pesanan pesanan = new Pesanan();
        Pemesan pemesan = new Pemesan();

        pemesan.buatPesanan(pesanan);
    }
}
