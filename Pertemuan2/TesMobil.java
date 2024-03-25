public class TesMobil {
    public static void main(String[] args){
        //Contoh Akses langsung tanpa create obj jika menggunakan static
        Mobil.maju();
        System.out.println("Mesin (Static) : "+Mobil.mesin);

        //Create Obj
        Mobil avanza=new Mobil();//Instance Class Obj
        avanza.maju();
        avanza.mundur();
        avanza.belok();
        System.out.println("Roda  : "+avanza.roda);
        System.out.println("Mesin : "+avanza.mesin);
    }
}
