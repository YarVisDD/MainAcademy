package com.mylabs.lab2156;

import java.util.HashMap;

public class MyTranslator {
   public HashMap<String,String> dictionary;
    public void addNewWord(String en,String ru){
        dictionary.put(en,ru);
    }
    public String translate(String en){
      String ru=dictionary.get(en);
        return ru;
    }

}
