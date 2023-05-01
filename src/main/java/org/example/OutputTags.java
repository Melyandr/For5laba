package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OutputTags {
    public String out(String string){
        ArrayList<String>myArray= new ArrayList<>();
        Pattern pattern1 = Pattern.compile("<((span|strong|table)[^>]*?)>(.*?)<\\/\\1>");
        Matcher matcher= pattern1.matcher(string);
        while (matcher.find()) {
            String match = matcher.group(3);
            myArray.add(match);
    }
        Collections.sort(myArray);
//        for (String a : myArray) {
//            System.out.println(a);
//        }
       return String.join("\n",myArray);

    }}
