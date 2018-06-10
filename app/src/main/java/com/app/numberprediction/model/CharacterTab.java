package com.app.numberprediction.model;

import com.app.numberprediction.constant.AppConstant;

import java.util.ArrayList;
import java.util.List;

public class CharacterTab {

    private List<String> subTabTitles = new ArrayList<>(AppConstant.INTABS_INDEX.length);
    private List<SubTab> subTabs = new ArrayList<>(AppConstant.INTABS_INDEX.length);

    public List<String> getSubTabTitles() {
        return subTabTitles;
    }

    public void setSubTabTitles() {
        List<String> subTabTitles = new ArrayList<>();
        for(String indexName:AppConstant.INTABS_INDEX){
            subTabTitles.add(indexName);
        }
        this.subTabTitles = subTabTitles;
    }

    public List<SubTab> getSubTabs() {
        return subTabs;
    }

    public void setSubTabs(List<SubTab> subTabs) {
        this.subTabs = subTabs;
    }
}
