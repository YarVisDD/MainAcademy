package com.mylabs.lab2156;

public class Main {
    public static void main(String[] args) {
        MyTranslator myTranslator= new MyTranslator();
        myTranslator.addNewWord("Cat","Кот");
        myTranslator.addNewWord("mouse","мышь");
        myTranslator.addNewWord("caught","поймал");
        myTranslator.translate("Cat");

    }
}
