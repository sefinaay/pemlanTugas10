package tugasSepuluh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BinarySearch {

    public static void main(String[] args) {

        //daftar list yang berisi pemain tim a dan b, menggunakan arrays.asList() untuk membuat list dari array dengan cara yang ringkas 
        List<PemainFutsal> timA = Arrays.asList(
            new PemainFutsal(168, 50, "A"),
            new PemainFutsal(170, 60, "A"),
            new PemainFutsal(165, 56, "A"),
            new PemainFutsal(168, 55, "A"),
            new PemainFutsal(172, 60, "A"),
            new PemainFutsal(170, 70, "A"),
            new PemainFutsal(169, 66, "A"),
            new PemainFutsal(165, 56, "A"),
            new PemainFutsal(171, 72, "A"),
            new PemainFutsal(166, 56, "A")
        );

        List<PemainFutsal> timB = Arrays.asList(
            new PemainFutsal(170, 66, "B"),
            new PemainFutsal(167, 60, "B"),
            new PemainFutsal(165, 59, "B"),
            new PemainFutsal(166, 58, "B"),
            new PemainFutsal(168, 58, "B"),
            new PemainFutsal(175, 71, "B"),
            new PemainFutsal(172, 68, "B"),
            new PemainFutsal(171, 68, "B"),
            new PemainFutsal(168, 65, "B"),
            new PemainFutsal(169, 60, "B")
        );

        //menyalin isi list ke dalam ArrayList
        ArrayList<PemainFutsal> arrTimA = new ArrayList<>(timA);
        ArrayList<PemainFutsal> arrTimB = new ArrayList<>(timB);

        //mengurutkan daftar pemain dari tinggi badan menggunakan Comparator
        Collections.sort(arrTimA, Comparator.comparingInt(PemainFutsal::getTinggi));
        Collections.sort(arrTimB, Comparator.comparingInt(PemainFutsal::getTinggi));

        //Stream API digunakan untuk membuat list tinggi badan
        System.out.println("\n2b. Jumlah pemain tim B dengan tinggi 168 cm dan 160 cm: ");
        int tinggi168 = Collections.frequency(arrTimB.stream().map(PemainFutsal::getTinggi).toList(), 168);
        int tinggi160 = Collections.frequency(arrTimB.stream().map(PemainFutsal::getTinggi).toList(), 160);

        //menampilkan jumlah pemain tim B yang memiliki tinggi 168 cm dan 160 cm
        System.out.println("Jumlah pemain dengan tinggi 168 cm: " + tinggi168 + " pemain");
        System.out.println("Jumlah pemain dengan tinggi 160 cm: " + tinggi160 + " pemain");

        //mengurutkan daftar pemain dari berat badan menggunakan Comparator
        System.out.println("\n2c. Jumlah pemain timA dengan berat badan 56 kg dan 53 kg: ");
        int berat56 = Collections.frequency(arrTimA.stream().map(PemainFutsal::getBerat).toList(), 56);
        int berat53 = Collections.frequency(arrTimA.stream().map(PemainFutsal::getBerat).toList(), 53);

        //menampilkan jumlah pemain tim A yang memiliki berat 56 kg dan 53 kg
        System.out.println("Jumlah pemain dengan berat 56 kg: " + berat56 + " pemain");
        System.out.println("Jumlah pemain dengan berat 53 kg " + berat53 + " pemain");

        System.out.println("\nPemain dengan tinggi/berat yang sama antara tim A dan tim B: ");
        
        //menyimpan semua nilai unik dari tinggi masing-masing tim
        Set<Integer> tinggiA = new HashSet<>();
        Set<Integer> tinggiB = new HashSet<>();
        
        //mengisi dua buah set<Integer> bernama tinggiA dan tinggiB dengan data tinggi badan deri pemain tim A dan tim B 
        arrTimA.forEach(p -> tinggiA.add(p.getTinggi()));
        arrTimB.forEach(p -> tinggiB.add(p.getTinggi()));
        
        //mengecek apakah dua tim memiliki elemen yang sama 
        boolean adaTinggiSama = !Collections.disjoint(tinggiA, tinggiB);
        System.out.println("Terdapat pemain tim A dan tim B yang memiliki tinggi yang sama: " + (adaTinggiSama ? "Ada" : "Tidak ada"));

        //menyimpan semua nilai unik dari berat masing-masing tim
        Set<Integer> beratA = new HashSet<>();
        Set<Integer> beratB = new HashSet<>();
        
         //mengisi dua buah set<Integer> bernama beratA dan beratB dengan data berat badan deri pemain tim A dan tim B tanpa duplikasi 
        arrTimA.forEach(p -> beratA.add(p.getBerat()));
        arrTimB.forEach(p -> beratB.add(p.getBerat()));
        
        //mengecek dan mencetak apakah ada tim A dan tim B yang memiliki berat badan yang sama 
        boolean adaBeratSama = !Collections.disjoint(beratA, beratB);
        System.out.println("Terdapat pemain tim A dan tim B yang memiliki berat yang sama: " + (adaBeratSama ? "Ada" : "Tidak ada"));
    }

}
