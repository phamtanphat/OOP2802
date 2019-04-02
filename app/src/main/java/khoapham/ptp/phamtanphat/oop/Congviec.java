package khoapham.ptp.phamtanphat.oop;

import android.content.Context;
import android.widget.Toast;

public abstract class Congviec {
    abstract void diemdanh();
    public void bangiao(Context context, String congviecbangiao){
        Toast.makeText(context, congviecbangiao, Toast.LENGTH_SHORT).show();
    }
}
