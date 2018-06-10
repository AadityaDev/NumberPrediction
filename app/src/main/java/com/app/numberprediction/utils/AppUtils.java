package com.app.numberprediction.utils;

import android.graphics.Color;
import android.text.InputFilter;
import android.text.InputType;
import android.util.Log;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.app.numberprediction.constant.AppConstant;
import com.app.numberprediction.fragments.tabs.TabAFragment;

public class AppUtils {

    public static void setTextViewProperty(TextView textView, String text){
        textView.setText(text);
        textView.setSingleLine(true);
        textView.setTextColor(Color.WHITE);
        textView.setGravity(Gravity.CENTER);
    }

    public static void setEditTextViewProperty(EditText editText, String text){
        editText.setText(text);
        editText.setSingleLine(true);
        editText.setFilters(new InputFilter[] { new InputFilter.LengthFilter(AppConstant.CHARACTERS_SIZE) });
        editText.setInputType(InputType.TYPE_CLASS_NUMBER);
        editText.setTextColor(Color.WHITE);
        editText.setGravity(Gravity.CENTER);
    }

    public static boolean isSAndDFilled(TableLayout tableLayout){
        if(tableLayout!=null) {
            int count=0;
            for (int index = 1; index < tableLayout.getChildCount(); index++) {
                TableRow tableRow = (TableRow) tableLayout.getChildAt(index);
                if (tableRow != null) {
                    EditText seditText = null,deditText = null;
                    if(tableRow.getChildAt(1) instanceof EditText){
                        seditText = (EditText) tableRow.getChildAt(1);
                        Log.d("ewssw", "s: " + seditText.getText().toString() +"");
                    }
                    if(tableRow.getChildAt(1) instanceof EditText) {
                        deditText = (EditText) tableRow.getChildAt(2);
                        Log.d("ewssw", "d: " + deditText.getText().toString() +"");
                    }
                    if (((seditText != null) && (seditText.getText() != null) && (!seditText.getText().toString().isEmpty())) &&
                            ((deditText != null) && (deditText.getText() != null) && (!deditText.getText().toString().isEmpty()))) {
                        count++;
                    }
                }
            }
            if(count==(tableLayout.getChildCount()-1)){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    public static boolean isNotNullOrEmpty(EditText editText){
        if((editText!=null)&&(editText.getText()!=null)&&(editText.getText().toString()!=null)&&
                (!editText.getText().toString().isEmpty())){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isNotNull(EditText editText){
        if((editText!=null)&&(editText.getText()!=null)&&(editText.getText().toString()!=null)){
            return true;
        }else {
            return false;
        }
    }

    public static void copyValue(EditText editTextSource,EditText editTextDestination){
        if(isNotNull(editTextSource)&&isNotNull(editTextDestination)){
            editTextDestination.setText(editTextSource.getText());
        }
    }

}
