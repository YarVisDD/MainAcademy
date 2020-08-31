package com.mylabsSE.lab162;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

public class User  {
    enum PermAction{USER_READ,USER_CHANGE}
    private String name;
    List<PermAction> permissions=new ArrayList<>(10);

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User name: "+name;
    }
    public void addPerm(PermAction permAction){
        permissions.add(permAction);

    }
    @MyAnnot(PermAction.USER_CHANGE)
    public List getPerm(){
        return permissions;
    }
}
