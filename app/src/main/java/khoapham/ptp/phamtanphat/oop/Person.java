package khoapham.ptp.phamtanphat.oop;

public class Person {

    public String ten;
    public int tuoi;

//    static String kieuconnguoi = "Con nguoi";

    //constructor ròng mac dinh deu co
    public Person(String ten, int tuoi){
        this.ten = ten;
        this.tuoi = tuoi;

    }
    // hanh vi
    // to hop phim nhanh alt + insert
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
