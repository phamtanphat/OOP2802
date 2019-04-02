package khoapham.ptp.phamtanphat.oop;

public class Animal extends Person{
    public Integer sochan;

    public Animal(String ten , int tuoi , int sochan){
        super(ten,tuoi);
        this.sochan = sochan;
    }

}
