package com.app.numberprediction.fragments.nestedb;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
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

public class BFragment extends Fragment {

    private TableLayout tableLayout;
    private TableRow header;
    private TextView indexColumn;
    private TextView sColumn;
    private TextView dColumn;

    public BFragment() {
        // Required empty public constructor
    }

    public static BFragment newInstance(int position) {
        BFragment fragment = new BFragment();
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
        View view = inflater.inflate(R.layout.fragment_b, container, false);
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

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    public void initalizeHeader(Context context){
        header = new TableRow(context);
        indexColumn = new TextView(context);
        AppUtils.setTextViewProperty(indexColumn, AppConstant.INDEX);
        header.addView(indexColumn);
        sColumn = new TextView(context);
        AppUtils.setTextViewProperty(sColumn,AppConstant.S);
        header.addView(sColumn);
        dColumn = new TextView(context);
        AppUtils.setTextViewProperty(dColumn,AppConstant.D);
        header.addView(dColumn);
        //0 to 9 elements declared
        for(int index=0;index<AppConstant.NUMS_INDEX.length;index++){
            TextView textView = new TextView(context);
            AppUtils.setTextViewProperty(textView,"A"+AppConstant.NUMS_INDEX[index]);
            header.addView(textView);
        }
        tableLayout.addView(header);
    }

    public void init(Context context) {
        initalizeHeader(context);
        for (int i = 0; i < AppConstant.TEN_SIZE; i++) {
            TableRow tbrow = new TableRow(context);
            TextView t1v = new TextView(context);
            AppUtils.setTextViewProperty(t1v,"" + i);
            tbrow.addView(t1v);
            EditText t2v = new EditText(context);
            AppUtils.setEditTextViewProperty(t2v," ");
            tbrow.addView(t2v);
            EditText t3v = new EditText(context);
            AppUtils.setEditTextViewProperty(t3v,"");
            tbrow.addView(t3v);
            for(int index = 0; index< AppConstant.NUMS_INDEX.length; index++){
                EditText editText = new EditText(context);
                AppUtils.setEditTextViewProperty(editText,"");
                tbrow.addView(editText);
            }
            tableLayout.addView(tbrow);
        }
    }
}
