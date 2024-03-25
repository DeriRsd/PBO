public class PersegiPanjangDemo {
    
    // Main method
    public static void main(String[] args){
        System.out.println("\nSebelum Membuat Objek");
        // Memanggil variabel static
        System.out.println("Jumlah objek = "+PersegiPanjang.jumlahObjek);

        // Membuat objek persegi panjang1
        PersegiPanjang persegiPanjang1 = new PersegiPanjang();
        System.out.println("\nSetelah membuat objek persegiPanjang1");

        // Memanggil variabel instance
        System.out.println("Panjang = "+persegiPanjang1.panjang+"\nLebar = "+persegiPanjang1.lebar);

        // Memanggil objek persegiPanjang2
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(8,5);
        System.out.println("\nSetelah membuat objek persegiPanjang2");

        // Memanggil variabel instance
        System.out.println("Panjang = "+persegiPanjang2.panjang + "\nLebar = "+persegiPanjang2.lebar);

        // Memanggi; variabel static
        System.out.println("Jumlah Objek = "+PersegiPanjang.jumlahObjek+"\n");

    }
    
}
