public class PersegiPanjang {

    // Panjang dan Lebar persegi panjang
    public int panjang;
    public int lebar;
    public static int jumlahObjek = 0;

    // Constructor dari objek PersegiPanjang
    public PersegiPanjang(){
        jumlahObjek++;
    }

    // Constructor dari objek PersegiPanjang
    public PersegiPanjang(int panjangBaru, int lebarBaru){
        panjang = panjangBaru;
        lebar = lebarBaru;
        jumlahObjek++;
    }

    // Mengembalikkan nilai luas persegi panjang
    public int getLuas(){
        return panjang*lebar;
    }

    // Mengembalikan nilai keliling persegi panjang
    public int getKeliling(){
        return 2*(panjang*lebar);
    }

}
