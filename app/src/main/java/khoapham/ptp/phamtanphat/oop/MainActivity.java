package khoapham.ptp.phamtanphat.oop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements Listenvalue{

    TextView  txtView;
    Button btn1;
    Listenvalue listenvalue;
    int a = 10;
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

//        Animal concho = new Animal("Con cho",4);
//        concho.setTen("Con meo" , this);
//        Person conguoi = new Person("Nguyen Van A",25,concho);
//        conguoi.setTen("Nguyen van B");
//        conguoi.animal.getTen();
        listenvalue = this;
        txtView = findViewById(R.id.textviewa);
        btn1 = findViewById(R.id.buttonSetvalue);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                listenvalue.setvalue(a++ + "");
            }
        });
    }

    @Override
    public void setvalue(String ten) {
        txtView.setText(ten);
    }
    // phuong nap chong
//    public void show(String text){
//        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
//    }
//    public void show(int number){
//        Toast.makeText(this, number + "", Toast.LENGTH_SHORT).show();
//    }

}
