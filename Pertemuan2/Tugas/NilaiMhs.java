import java.util.Scanner;
public class NilaiMhs {
    public static void main(String[] args){
        // Buat Objek Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        String nim = input.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        input.close();
        HitungNilai nilaiku = new HitungNilai();
        nilaiku.hitungNilai();
        nilaiku.cetakNilai();
    }
}
