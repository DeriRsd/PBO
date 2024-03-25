import java.util.Scanner;

public class HitungNilai {

        double nilaiUTS;    
        double nilaiTugas;    
        double nilaiUAS;    
        double pnilaiUTS;    
        double pnilaiTugas;    
        double pnilaiUAS;    
        double nilaiAkhir;    

        double hitungNilai(){
            // Buat Objek Scanner
            Scanner input = new Scanner(System.in);
            // Proses Input
            System.out.print("Masukkan Nilai UTS   : ");
            nilaiUTS = input.nextDouble();
            System.out.print("Masukkan Nilai Tugas : ");
            nilaiTugas = input.nextDouble();
            System.out.print("Masukkan Nilai UAS   : ");
            nilaiUAS = input.nextDouble();
            //Tutup Inputan
            input.close();
            pnilaiUTS   = nilaiUTS * 20/100; 
            pnilaiTugas = nilaiTugas * 35/100; 
            pnilaiUAS = nilaiUAS * 45/100; 
            nilaiAkhir = nilaiUTS + nilaiTugas + nilaiUAS;
            return nilaiAkhir;
        }
        void cetakNilai(){
            System.out.println("Nilai Tugas : " +nilaiTugas);
            System.out.print(": "  +pnilaiTugas);
            System.out.println("Nilai UTS   : " +nilaiUTS);
            System.out.print(": "  +pnilaiUTS);
            System.out.println("Nilai UAS   : " +nilaiUAS);
            System.out.print(": "  +pnilaiUAS);
            System.out.println("Nilai Akhir : " +nilaiAkhir);
            
        }

}
