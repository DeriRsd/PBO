import java.util.Scanner;

public class MahasiswaEnkapsulasiDemo {
    
    public static void main(String[] args) {

        MahasiswaEnkapsulasi mahasiswa = new MahasiswaEnkapsulasi();

        Scanner input = new Scanner(System.in);

        System.out.print("\nMasukkan Nama   : ");
        mahasiswa.setNama(input.nextLine());
        System.out.print("Masukkan Alamat : ");
        mahasiswa.setAlamat(input.nextLine());
        System.out.print("Masukkan NIM    : ");
        mahasiswa.setNim(input.nextLine());
        System.out.print("Masukkan IPK    : ");
        mahasiswa.setIpk(input.nextDouble());
        
        input.close();

        // Maaf pak, bingung letak method cetaknya berada di main atau class jadi buat 2 output method

        System.out.println("\nOutput Cetak Berada di main");
        System.out.println("Nama     : "+mahasiswa.getNama());
        System.out.println("Alamat   : "+mahasiswa.getAlamat());
        System.out.println("NIM      : "+mahasiswa.getNim());
        System.out.println("IPK      : "+mahasiswa.getIpk());
        System.out.println("Predikat : "+mahasiswa.predikat(mahasiswa.getIpk()));

        mahasiswa.cetak();

    }

}
