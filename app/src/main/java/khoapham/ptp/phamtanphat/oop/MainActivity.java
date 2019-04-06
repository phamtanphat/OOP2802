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

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User.Builder builder = new User.Builder();
        builder.setTen("Nguyen Van A");
        Log.d("BBB",builder.getTen());

        RequestHttp requestHttp = RequestHttp.getInstance("zing.vn");
        RequestHttp requestHttp1 = RequestHttp.getInstance("xinchao");
        Log.d("BBB",requestHttp1.getUrl());
//
    }
//    tinhtoan(new Listen() {
//            @Override
//            public boolean ketqua(int i) {
//                if( Math.sqrt(i) % 1 == 0){
//                    return true;
//                }else{
//                    return false;
//                }
//
//            }
//        });
//    public void insochan(){
//        for (int i = 0 ; i <= 100; i++){
//           if(i % 2 == 0){
//               Log.d("BBB", i + "");
//           }
//        }
//    }
//    public void insole(){
//        for (int i = 0 ; i <= 100; i++){
//            if(i % 2 == 1){
//                Log.d("BBB", i + "");
//            }
//        }
//    }
//    public void insochia3du1(){
//        for (int i = 0 ; i <= 100; i++){
//            if(i % 3 == 1){
//                Log.d("BBB", i + "");
//            }
//        }
//    }
//    public void insochinhphuong(){
//        for (int i = 0 ; i <= 100; i++){
//            if(Math.sqrt(i) % 1 == 0){
//                Log.d("BBB", i + "");
//            }
//        }
//    }
//    public void tinhtoan(Listen listen){
//        for (int i = 0 ; i <= 100; i++){
//            boolean dk = listen.ketqua(i);
//            if(dk){
//                Log.d("BBB", i + "");
//            }
//        }
//    }
}
