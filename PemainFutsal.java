package tugasSepuluh;

public class PemainFutsal {

    //mendeklarasi atribut pemain futsal dengan private mencegah manipulasi data yang tidak diinginkan 
    private int tinggi;
    private int berat;
    private String tim;

    //menginisialisasi objek pemain futsal dengan tinggi badan, berat badan, dan nama tim
    public PemainFutsal(int tinggi, int berat, String tim){
        this.tinggi = tinggi;
        this.berat = berat;
        this.tim = tim;
    }

    //getter method untuk mengakses nilai-nilai private dari luar kelas.
    public int getTinggi(){
        return tinggi;
    }

    public int getBerat(){
        return berat;
    }

    public String getTim(){
        return tim;
    }

    //agar dapat mencetak informasi pemain dengan format yang lebih deskriptif
    @Override
    public String toString(){
        return "Tinggi: " + tinggi + " cm, Berat: " + berat + " kg, Tim: " + tim; 
    }
}
