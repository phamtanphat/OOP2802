package khoapham.ptp.phamtanphat.oop;

import android.content.Context;
import android.widget.Toast;

public class Animal extends Person{
    public Integer sochan;

    public Animal(String ten , int tuoi ){
        super(ten,tuoi);
    }
    public void setTen(String ten , Context context){
        Toast.makeText(context, ten, Toast.LENGTH_SHORT).show();
    }

}
