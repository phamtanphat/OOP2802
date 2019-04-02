package khoapham.ptp.phamtanphat.oop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        final  int[] a = {1,2,3,4,5};
        //1 : Doi tuong
        //2 : thuoc tinh va hanh vi
//        Person nguyenvana = new Person("nguyen van A",15);
//        Person.tuoi //sai
//        nguyenvana.tuoi // dung
//        Person.kieuconnguoi // static
//        Person nguyenvanb = new Person("nguyen van b",20);

        //3 : non accessmodifier : static
//        a[0] = 6;
//        Log.d("BBB",a[0] + " ");

//        Animal concho = new Animal();
//        concho.ten = "con cho";
//        concho.tuoi = 4;
        //Tinh da hinh : overide(ghi de) overload(phuong thuc nap chong)

//        show("xin chao");
            Person conguoi = new Person("Nguyen Van A",25);
            conguoi.setTen("Nguyen van B");
            Animal concho = new Animal("Con cho",4);
            concho.setTen("Con meo" , this);
    }
    // phuong nap chong
//    public void show(String text){
//        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
//    }
//    public void show(int number){
//        Toast.makeText(this, number + "", Toast.LENGTH_SHORT).show();
//    }

}
