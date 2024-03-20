package jobsheet6;
import java.util.Scanner;

public class Main06 {
    public static void main(String[]args){
        DaftarMahasiswaBerprestasi06 list = new DaftarMahasiswaBerprestasi06();
        Mahasiswa06 m1 = new Mahasiswa06("Nusa", 2017, 25, 3);
        Mahasiswa06 m2 = new Mahasiswa06("Rara", 2012, 19, 4);
        Mahasiswa06 m3 = new Mahasiswa06("Dompu", 2018, 19, 3.5);
        Mahasiswa06 m4 = new Mahasiswa06("Abdul", 2017, 23, 2);
        Mahasiswa06 m5 = new Mahasiswa06("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan ipk = ");
        list.bubbleSort();
        list.tampil();
    }
}
