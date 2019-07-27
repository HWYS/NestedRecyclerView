package com.hwys.nestedrecyclerview.model;

import java.util.List;

public class ParentModel {
    private String title;
    private List<ChildModel> childModelList;

    public ParentModel(String title, List<ChildModel> childModelList) {
        this.title = title;
        this.childModelList = childModelList;
    }

    public String getTitle() {
        return title;
    }

    public List<ChildModel> getChildModelList() {
        return childModelList;
    }
}
