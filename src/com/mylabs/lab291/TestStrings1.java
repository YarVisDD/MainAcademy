package com.mylabs.lab291;

public class TestStrings1 {
public static String ReverseStr(String x){
    String reverse = "";
    for(int i = x. length() - 1; i >= 0; i--) {
        reverse = reverse + x.charAt(i); }
    return reverse;
}
    public static void main(String[] args) {

        String myStr="abracadabra";
        int i1=myStr.indexOf("ra");
        int i2=myStr.lastIndexOf("ra");
        System.out.println("First ra in string:"+i1);
        System.out.println("Last ra in string:"+i2);
        String substr1=myStr.substring(3,7);
        System.out.println(substr1);
        System.out.println(ReverseStr(myStr));
    }
}
