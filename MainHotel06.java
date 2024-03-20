package jobsheet6;
import java.util.Scanner;

public class MainHotel06 {
    public static void main(String[]args){
        HotelService06 list = new HotelService06();
        Hotel06 m1 = new Hotel06("Nusa", "Malang", 250000, (byte)3);
        Hotel06 m2 = new Hotel06("Rara", "Surabaya", 350000, (byte) 2);
        Hotel06 m3 = new Hotel06("Billy", "Jogja", 125000, (byte) 4);
        Hotel06 m4 = new Hotel06("Annisa", "Bandung", 400000, (byte)1);
        Hotel06 m5 = new Hotel06("Nusa", "Jakarta", 500000, (byte)3);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Harga sebelum sorting = ");
        list.tampil();

        System.out.println("Data Harga setelah sorting menggunakan Bubble Sort = ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data Harga setelah sorting menggunakan Selection Sort  = ");
        list.selectionSort();
        list.tampil();

    }
}
