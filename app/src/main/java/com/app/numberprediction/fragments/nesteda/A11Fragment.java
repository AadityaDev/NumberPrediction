package com.app.numberprediction.fragments.nesteda;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.app.numberprediction.R;
import com.app.numberprediction.constant.AppConstant;
import com.app.numberprediction.utils.AppUtils;

public class A11Fragment extends Fragment {

    private static final String TAG = A11Fragment.class.getName();
    public TableLayout tableLayout;
    private TableRow header;
    private TextView indexColumn;
    private TextView sColumn;
    private TextView dColumn;
    private static A11Fragment[] a11Fragments = new A11Fragment[AppConstant.INTABS_INDEX.length];

    public A11Fragment() {
        // Required empty public constructor
    }

    public static TableLayout getTable(int position) {
        return a11Fragments[position].tableLayout;
    }

    public static A11Fragment newInstance(int position) {
        a11Fragments[position] = new A11Fragment();
        Bundle args = new Bundle();
        a11Fragments[position].setArguments(args);
        return a11Fragments[position];
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
        tableLayout = (TableLayout) view.findViewById(R.id.table_main);
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

    public void initalizeHeader(Context context) {
        header = new TableRow(context);
        indexColumn = new TextView(context);
        AppUtils.setTextViewProperty(indexColumn, AppConstant.INDEX);
        header.addView(indexColumn);
        sColumn = new TextView(context);
        AppUtils.setTextViewProperty(sColumn, AppConstant.S);
        header.addView(sColumn);
        dColumn = new TextView(context);
        AppUtils.setTextViewProperty(dColumn, AppConstant.D);
        header.addView(dColumn);
        //0 to 9 elements declared
        for (int index = 0; index < AppConstant.NUMS_INDEX.length; index++) {
            TextView textView = new TextView(context);
            AppUtils.setTextViewProperty(textView, "A" + AppConstant.NUMS_INDEX[index]);
            header.addView(textView);
        }
        tableLayout.addView(header);
    }

    public void init(Context context) {
        initalizeHeader(context);
        Log.d(TAG, "size: " + tableLayout.getChildCount());
        for (int i = 0; i < AppConstant.TEN_SIZE; i++) {
            TableRow tbrow = new TableRow(context);
            TextView indexText = new TextView(context);
            AppUtils.setTextViewProperty(indexText, "" + i);
            tbrow.addView(indexText);
            EditText sEditText = new EditText(context);
            sEditText.setTag(AppConstant.S);
            AppUtils.setEditTextViewProperty(sEditText, " " + i);
            tbrow.addView(sEditText);
            EditText dEditText = new EditText(context);
            AppUtils.setEditTextViewProperty(dEditText, "" + i);
            tbrow.addView(dEditText);
            for (int index = 0; index < AppConstant.NUMS_INDEX.length; index++) {
                EditText rowEditText = new EditText(context);
                AppUtils.setEditTextViewProperty(rowEditText, "");
                tbrow.addView(rowEditText);
            }
            tableLayout.addView(tbrow);
        }
        Log.d(TAG, "size: " + tableLayout.getChildCount());
        showData();
    }

    public void showData() {
        for (int index = 1; index < AppConstant.TEN_SIZE + 1; index++) {
//            fillRowData(index);
        }
    }

    public void fillRowData(int index, int sValue, int dValue) {
        TableRow tableRow = (TableRow) tableLayout.getChildAt(index);
        if (tableRow != null && tableRow.getChildAt(0) instanceof TextView) {
            TextView tv = (TextView) tableRow.getChildAt(0);
            Log.d(TAG, tv.getText().toString());
        }
    }

    public void fillRowDataNum(int index) {
        TableRow tableRow = (TableRow) tableLayout.getChildAt(index);
        if (tableRow != null && tableRow.getChildAt(0) instanceof TextView) {
            TextView tv = (TextView) tableRow.getChildAt(0);
            Log.d(TAG, tv.getText().toString());
        }
    }

    public void fillRowDataSAndD(int sValue, int dValue) {
        for (int index = 1; index < AppConstant.INTABS_INDEX.length; index++) {

        }
    }

    public void fillRowDataInEachTab(int sValue, int dValue) {
        TableRow tableRowFirst = (TableRow) tableLayout.getChildAt(0);
        EditText sourceZeroIndex = null;
        EditText sourceFirstIndex = null;
        EditText sourceSecondIndex = null;
        EditText sourceThirdIndex = null;
        EditText sourceFourthIndex = null;
        EditText sourceFifthIndex = null;
        EditText sourceSixthIndex = null;
        EditText sourceSeventIndex = null;
        EditText sourceEighthIndex = null;
        EditText sourceNinthIndex = null;
        if(tableRowFirst!=null) {
            sourceZeroIndex = (EditText) tableRowFirst.getChildAt(3);
            sourceFirstIndex = (EditText) tableRowFirst.getChildAt(4);
            sourceSecondIndex = (EditText) tableRowFirst.getChildAt(5);
            sourceThirdIndex = (EditText) tableRowFirst.getChildAt(6);
            sourceFourthIndex = (EditText) tableRowFirst.getChildAt(7);
            sourceFifthIndex = (EditText) tableRowFirst.getChildAt(8);
            sourceSixthIndex = (EditText) tableRowFirst.getChildAt(9);
            sourceSeventIndex = (EditText) tableRowFirst.getChildAt(10);
            sourceEighthIndex = (EditText) tableRowFirst.getChildAt(11);
            sourceNinthIndex = (EditText) tableRowFirst.getChildAt(12);
        }
        for(int index=1;index<AppConstant.NUMS_INDEX.length;index++){
            TableRow tableRow = (TableRow) tableLayout.getChildAt(index);
            if(tableRow!=null) {
                EditText zeroIndex = (EditText) tableRow.getChildAt(3);
                EditText firstIndex = (EditText) tableRow.getChildAt(4);
                EditText secondIndex = (EditText) tableRow.getChildAt(5);
                EditText thirdIndex = (EditText) tableRow.getChildAt(6);
                EditText fourthIndex = (EditText) tableRow.getChildAt(7);
                EditText fifthIndex = (EditText) tableRow.getChildAt(8);
                EditText sixthIndex = (EditText) tableRow.getChildAt(9);
                EditText seventIndex = (EditText) tableRow.getChildAt(10);
                EditText eighthIndex = (EditText) tableRow.getChildAt(11);
                EditText ninthIndex = (EditText) tableRow.getChildAt(12);

                AppUtils.copyValue(sourceZeroIndex,zeroIndex);
                AppUtils.copyValue(sourceFirstIndex,firstIndex);
                AppUtils.copyValue(sourceSecondIndex,secondIndex);
                AppUtils.copyValue(sourceThirdIndex,thirdIndex);
                AppUtils.copyValue(sourceFourthIndex,fourthIndex);
                AppUtils.copyValue(sourceFifthIndex,fifthIndex);
                AppUtils.copyValue(sourceSixthIndex,sixthIndex);
                AppUtils.copyValue(sourceSeventIndex,seventIndex);
                AppUtils.copyValue(sourceEighthIndex,eighthIndex);
                AppUtils.copyValue(sourceNinthIndex,ninthIndex);
            }
        }
    }

}