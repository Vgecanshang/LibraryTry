package test.cy.com.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by cy on 2018/5/23.
 */
public class LibraryToastUtil {
    public static void showToast(Context context , String str){
        Toast.makeText(context , str , Toast.LENGTH_LONG).show();
    }


    public static void showToast(Context context , String str , int duration){
        Toast.makeText(context , str , duration).show();
    }


}
