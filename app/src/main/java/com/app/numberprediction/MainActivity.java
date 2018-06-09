package com.app.numberprediction;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.app.numberprediction.constant.AppConstant;

public class MainActivity extends AppCompatActivity {

    private TableLayout stk;
    private BottomNavigationView navigation;
    //head
    private TableRow header;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_dashboard:
                    return true;
                case R.id.navigation_notifications:
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stk = (TableLayout) findViewById(R.id.table_main);

        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        init();
    }

    public void setTextViewProperty(TextView textView, String text){
        textView.setText(text);
        textView.setTextColor(Color.WHITE);
        textView.setGravity(Gravity.CENTER);

    }

    public void setEditTextViewProperty(EditText editText, String text){
        editText.setText(text);
        editText.setTextColor(Color.WHITE);
        editText.setGravity(Gravity.CENTER);
    }
    public void initalizeHeader(){
        header = new TableRow(this);
        TextView tv0 = new TextView(this);
        setTextViewProperty(tv0,AppConstant.INDEX);
        header.addView(tv0);
        TextView tv1 = new TextView(this);
        setTextViewProperty(tv1,AppConstant.S);
        header.addView(tv1);
        TextView tv2 = new TextView(this);
        setTextViewProperty(tv2,AppConstant.D);
        header.addView(tv2);
        TextView tv3 = new TextView(this);
        setTextViewProperty(tv3,AppConstant.A);
        header.addView(tv3);
        stk.addView(header);
    }

    public void init() {
        initalizeHeader();
        for (int i = 0; i < 25; i++) {
            TableRow tbrow = new TableRow(this);
            TextView t1v = new TextView(this);
            setTextViewProperty(t1v,"" + i);
            tbrow.addView(t1v);
            EditText t2v = new EditText(this);
            setEditTextViewProperty(t2v," " + i);
            tbrow.addView(t2v);
            EditText t3v = new EditText(this);
            setEditTextViewProperty(t3v,"Rs." + i);
            tbrow.addView(t3v);
            EditText t4v = new EditText(this);
            setEditTextViewProperty(t4v,"" + i * 15 / 32 * 10);
            tbrow.addView(t4v);
            stk.addView(tbrow);
        }

    }

}
