package com.app.numberprediction.fragments.nesteda;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.app.numberprediction.R;
import com.app.numberprediction.constant.AppConstant;

public class A11Fragment extends Fragment {

    private TableLayout stk;
    private TableRow header;
    private TextView indexColumn;
    private TextView sColumn;
    private TextView dColumn;

    public A11Fragment() {
        // Required empty public constructor
    }

    public static A11Fragment newInstance(int position) {
        A11Fragment fragment = new A11Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a11, container, false);
        stk = (TableLayout) view.findViewById(R.id.table_main);
        init(getContext());
        return view;
    }

    public void onButtonPressed(Uri uri) {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
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
    public void initalizeHeader(Context context){
        header = new TableRow(context);
        indexColumn = new TextView(context);
        setTextViewProperty(indexColumn,AppConstant.INDEX);
        header.addView(indexColumn);
        sColumn = new TextView(context);
        setTextViewProperty(sColumn,AppConstant.S);
        header.addView(sColumn);
        dColumn = new TextView(context);
        setTextViewProperty(dColumn,AppConstant.D);
        header.addView(dColumn);
        //
//        characterTabs[0]=new CharacterTab();
//        characterTabs[0].setSubTabTitles();
//        List<SubTab> subTabs=new ArrayList<>();
//        for(int index=0;index<AppConstant.INTABS_INDEX.length;index++){
//            SubTab subTab=new SubTab();
//            subTab.setIndex(AppConstant.INDEX);
//            subTab.setS(AppConstant.S);
//            subTab.setD(AppConstant.D);
//            subTab.setRowData(A11Data);
//            subTabs.add(subTab);
//        }
//        characterTabs[0].setSubTabs(subTabs);
        //0 to 9 elements declared
        for(int index=0;index<AppConstant.NUMS_INDEX.length;index++){
            TextView textView = new TextView(context);
            setTextViewProperty(textView,"A"+AppConstant.NUMS_INDEX[index]);
            header.addView(textView);
        }
        stk.addView(header);
    }

    public void init(Context context) {
        initalizeHeader(context);
        for (int i = 0; i < AppConstant.FIFTY_SIZE; i++) {
            TableRow tbrow = new TableRow(context);
            TextView t1v = new TextView(context);
            setTextViewProperty(t1v,"" + i);
            tbrow.addView(t1v);
            EditText t2v = new EditText(context);
            setEditTextViewProperty(t2v," " + i);
            tbrow.addView(t2v);
            EditText t3v = new EditText(context);
            setEditTextViewProperty(t3v,"" + i);
            tbrow.addView(t3v);
            for(int index = 0; index< AppConstant.NUMS_INDEX.length; index++){
                EditText editText = new EditText(context);
                setEditTextViewProperty(editText,index+"");
                tbrow.addView(editText);
            }
            stk.addView(tbrow);
        }

    }


}
