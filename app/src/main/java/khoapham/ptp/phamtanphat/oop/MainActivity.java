package khoapham.ptp.phamtanphat.oop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1 : Doi tuong
        //2 : thuoc tinh va hanh vi
        Person nguyenvana = new Person();
//        Person.tuoi //sai
//        nguyenvana.tuoi // dung
//        Person.kieuconnguoi // static

        Person nguyenvanb = new Person();
    }
}
