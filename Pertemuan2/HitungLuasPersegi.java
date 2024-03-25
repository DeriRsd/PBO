import java.util.Scanner;

public class HitungLuasPersegi {    
    public static void main(String[] args){
        // Buat Objek Scanner
        Scanner input = new Scanner(System.in);
        // Proses Input Sisi Persegi
        System.out.print("Masukkan Sisi Persegi : ");
        double sisi = input.nextDouble();

        // Tutup Inputan
        input.close();

        // Hitung Luas
        double luas = sisi * sisi;

        // Tampilkan Hasil
        System.out.print("Luas Persegi : "+luas);
    }
}
