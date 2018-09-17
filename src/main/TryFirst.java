package main;

import java.util.ArrayList;
import java.util.List;
import static main.examples.Boolean.dividesSelf;
import static main.examples.Boolean.hasOne;
import static main.examples.Boolean.wordsFront;


public class TryFirst {
    public static List<String> noX() {
        List<String> strings = new ArrayList <String> ();
       strings.add("1");
        strings.add("2");
        strings.add("3");
        System.out.println("Old string is "+strings);
        strings.removeIf(n->((n.length()<=1)));
        System.out.println( "New string is "+strings);
        strings.removeIf(n->(n.substring(0,2).equals("yy")));
        System.out.println( "New string 2  is "+strings);
        strings.replaceAll(n->(n+"y"));
        System.out.println( "New string 3  is "+strings);
        return strings;


    }
    public static String frontTimes() {
        String str = "Chocolate";
        int n=3;
        String result="";
        for (int i=0; i<n; i++) {
            if(str.length()>=3){
            result = str.substring(0,3);
            result = result + result;}
            else result= result+str;
        }
        System.out.println("New result "+result);
        return result;


    }

    public static void main(String args[]) {
        frontTimes();
        dividesSelf(128);
        hasOne(300);
       wordsFront(["a", "b", "c", "d"], 1);
    }
}