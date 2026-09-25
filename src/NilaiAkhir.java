import java.util.Scanner;

public class NilaiAkhir {


    static final double BOBOT_PRAKTIKUM = 0.30;
    static final double BOBOT_TUGAS = 0.20;
    static final double BOBOT_MID = 0.20;
    static final double BOBOT_FINAL = 0.30;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Nilai praktikum : ");
        double praktikum = input.nextDouble();

        System.out.print("Nilai tugas     : ");
        double tugas = input.nextDouble();





        /*
         * Menghitung nilai akhir dalam satu ekspresi.
         * Tidak menggunakan tanda kurung karena operator * memiliki
         * precedence lebih tinggi daripada operator +.
         */
        double akhir = praktikum * BOBOT_PRAKTIKUM
                + tugas * BOBOT_TUGAS;



        /*
         * Contoh augmented assignment:
         * komponen nilai final ditambahkan menggunakan operator +=.
         */

        akhir +=  BOBOT_FINAL;

        /*
         * Percobaan versi bilangan bulat:
         *
         * int hasilInt = praktikum * 30 / 100
         *              + tugas * 20 / 100
         *              + mid * 20 / 100
         *              + finalNilai * 30 / 100;
         *
         * Hasilnya 78, bukan 79.1, karena perhitungan menggunakan int.
         * Pembagian bilangan bulat memotong bagian desimal.
         */


        int dipotong = (int) akhir;


        long dibulatkan = Math.round(akhir);


        double selisih = akhir - dibulatkan;


        boolean lulus = akhir >= 60;


        System.out.println();
        System.out.println("===== NILAI AKHIR =====");

        System.out.printf("Praktikum : %.1f (30%%)%n", praktikum);
        System.out.printf("Tugas     : %.1f (20%%)%n", tugas);



        System.out.println();

        System.out.printf("Nilai akhir        : %.1f%n", akhir);
        System.out.println("Dipotong (int)     : " + dipotong);
        System.out.println("Dibulatkan (round) : " + dibulatkan);
        System.out.println("Selisih            : " + selisih);
        System.out.println("Lulus (>=60)       : " + lulus);

        input.close();
    }
}