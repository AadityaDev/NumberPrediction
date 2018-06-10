package com.app.numberprediction.model;

import com.app.numberprediction.constant.AppConstant;

import java.util.HashMap;

public class SubTab {

    private String index;
    private String s;
    private String d;
    private String[] number=new String[AppConstant.NUMS_INDEX.length];
    private HashMap<String,String> rowData=new HashMap<>();

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String[] getNumber() {
        return number;
    }

    public void setNumber(String[] number) {
        this.number = number;
    }

    public HashMap<String, String> getRowData() {
        return rowData;
    }

    public void setRowData(HashMap<String, String> rowData) {
        this.rowData = rowData;
    }
}
