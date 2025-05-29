package tugasSepuluh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TimFutsal {

    public static void main(String[] args) {

    //membuat data awal dua tim futsal berupa daftar objek pemain
    List<Pemain> timA = Arrays.asList(
        new Pemain(168, 50, "A"),
        new Pemain(170, 60, "A"),
        new Pemain(165, 56, "A"),
        new Pemain(168, 55, "A"),
        new Pemain(172, 60, "A"),
        new Pemain(170, 70, "A"),
        new Pemain(169, 66, "A"),
        new Pemain(165, 56, "A"),
        new Pemain(171, 72, "A"),
        new Pemain(166, 56, "A")
    );

    List<Pemain> timB = Arrays.asList(
        new Pemain(170, 66, "B"),
        new Pemain(167, 60, "B"),
        new Pemain(165, 59, "B"),
        new Pemain(166, 58, "B"),
        new Pemain(168, 58, "B"),
        new Pemain(175, 71, "B"),
        new Pemain(172, 68, "B"),
        new Pemain(171, 68, "B"),
        new Pemain(168, 65, "B"),
        new Pemain(169, 60, "B")
    ); 
        
        System.out.println("\n1a. Urutan berdasarkan tinggi badan: ");

        //menggabungkan semua pemain tim a dan tim b ke dalam satu list baru bernama semuaPemain
        List<Pemain> semuaPemain = new ArrayList<>();
        semuaPemain.addAll(timA);
        semuaPemain.addAll(timB);

        //mengurutkan semua daftar pemain berdasarkan tinggii badan secara ascending dan mencetak hasilnya 
        Collections.sort(semuaPemain, Comparator.comparingInt(Pemain::getTinggi));
        System.out.println("\nAscending:");
        semuaPemain.forEach(System.out::println);

        //mengurutkan list semuaPemain berdasarkan tinggi badan secara descending lalu mencetak hasilnya
        Collections.sort(semuaPemain, Comparator.comparingInt(Pemain::getTinggi).reversed());
        System.out.println("\nDescending:");
        semuaPemain.forEach(System.out::println);

        //mengurutkan semua daftar pemain berdasarkan berat badan secara ascending dan memberikan label di output
        System.out.println("\n1b. Urutan berdasarkan berat badan: ");
        Collections.sort(semuaPemain, Comparator.comparingInt(Pemain::getBerat));
        System.out.println("\nAscending");
        semuaPemain.forEach(System.out::println);

        //mengurutkan semua daftar pemain berdasarkan berat badan secara descending dan memberikan label di output
        Collections.sort(semuaPemain, Comparator.comparingInt(Pemain::getBerat).reversed());
        System.out.println("\nDescending");
        semuaPemain.forEach(System.out::println);


        //menentukan dan menampilkan nilai maksimum dan minimum dari atribut tinggi badan dan berat badan pemain tim A
        System.out.println("\n1c. Nilai maksimum dan minumum ");
        Pemain maxTingggiA = Collections.max(timA, Comparator.comparingInt(Pemain::getTinggi));
        Pemain minTingggiA = Collections.min(timA, Comparator.comparingInt(Pemain::getTinggi));
        Pemain maxBeratA = Collections.max(timA, Comparator.comparingInt(Pemain::getBerat));
        Pemain minBeratA = Collections.min(timA, Comparator.comparingInt(Pemain::getBerat));

        //mencetak hasil nilai maksimum dan minimum tim A
        System.out.println("\nTim A:");
        System.out.println("Tinggi maksimum: " + maxTingggiA);
        System.out.println("Tinggi minimum: " + minTingggiA);
        System.out.println("Berat maksimum: " + maxBeratA);
        System.out.println("Berat minimum: " + minBeratA);

        //menentukan dan menampilkan nilai maksimum dan minimum dari atribut tinggi badan dan berat badan pemain tim A
        Pemain maxTingggiB = Collections.max(timB, Comparator.comparingInt(Pemain::getTinggi));
        Pemain minTingggiB = Collections.min(timB, Comparator.comparingInt(Pemain::getTinggi));
        Pemain maxBeratB = Collections.max(timB, Comparator.comparingInt(Pemain::getBerat));
        Pemain minBeratB = Collections.min(timB, Comparator.comparingInt(Pemain::getBerat));

        //mencetak hasil nilai maksimum dan minimum dari tim B 
        System.out.println("\nTim B:");
        System.out.println("Tinggi maksimum: " + maxTingggiB);
        System.out.println("Tinggi minimum: " + minTingggiB);
        System.out.println("Berat maksimum: " + maxBeratB);
        System.out.println("Berat minimum: " + minBeratB);

        //membuat salinan dari tim B ke dalam tim baru bernama tim C, dan menampilkan jumlah pemain dan detail data dari pemain di tim C 
        System.out.println("\nCopy seluruh anggota pemain Tim B ke Tim C: ");
        List<Pemain> timC = new ArrayList<>(timB);
        System.out.println("Jumlah pemain tim C: " + timC.size());
        System.out.println("Data Tim C: ");
        timC.forEach(System.out::println);
    }

}
