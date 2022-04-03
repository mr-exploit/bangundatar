
public class pratikum7 {
        public static void main(String[] args) {

                // Bangun datar
                System.out.println("Bangun datar");
                System.out.println("");

                // persegi
                System.out.println("hitung Persegi ");
                bangundatar bd1 = new bangundatar();
                bd1.setsisi(7);
                System.out.println("luas persegi adalah : " + bd1.luaspersegi());

                bangundatar bd4 = new bangundatar();
                bd4.setsisi(7);
                System.out.println("Keliling persegi adalah : " + bd4.kelilingpersegi());
                System.out.println("");

                // persegipanjang
                System.out.println("hitung PersegiPanjang ");
                bangundatar bd2 = new bangundatar();
                bd2.setpanjang(7);
                bd2.setlebar(10);
                System.out.println("luas persegi panjang adalah : " + bd2.luaspersegipanjang());

                bangundatar bd5 = new bangundatar();
                bd5.setpanjang(5);
                bd5.setlebar(10);
                System.out.println("keliling persegi panjang adalah : " + bd5.kelilingpersegipanjang());
                System.out.println("");

                // lingkaran
                System.out.println("hitung lingkaran ");
                bangundatar bd3 = new bangundatar();
                bd3.setjari(7);
                System.out.println("luas Lingkaran adalah : " + bd3.luaslingkaran());

                bangundatar bd6 = new bangundatar();
                bd6.setjari(7);
                System.out.println("luas Lingkaran adalah : " + bd6.kelilinglingkaran());
                System.out.println("");
                // segitiga
                System.out.println("hitung Segitiga ");
                bangundatar bd7 = new bangundatar();
                bd7.setalas(10);
                bd7.settinggi(3);
                System.out.println("luas segitiga adalah : " + bd7.luassegitiga());

                bangundatar bd8 = new bangundatar();
                bd8.setsisi(4);
                System.out.println("keliling segitiga adalah : " + bd8.kelilingsegitiga());
                System.out.println("");
        }
}
