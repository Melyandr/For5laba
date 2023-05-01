package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args)  {

//   String str ="<!DOCTYPE html>\n" +
//        "<html>\n" +
//        "<head>\n" +
//        "  <title>Regex Testing Example</title>\n" +
//        "</head>\n" +
//        "<body>\n" +
//        "  <h1>Regex Testing Example</h1>\n" +
//        "  <table>\n" +
//        "    <tr>\n" +
//        "      <td><span>c a doiuhafds ia aiuh fipo</span></td>\n" +
//        "      <td><strong>aaa asdfiufadsioudsfh</strong></td>\n" +
//        "    </tr>\n" +
//        "    <tr>\n" +
//        "      <td><span>bbb</span></td>\n" +
//        "      <td><strong>z</strong></td>\n" +
//        "    </tr>\n" +
//        "  </table>\n" +
//        "  <span>aa af sdf </span>\n" +
//        "</body>\n" +
//        "</html>";
//
//        OutputTags myOut=new OutputTags();
//        myOut.out(str);


        Scanner scanner=new Scanner(System.in );
        System.out.println("write code html");
        String str=scanner.nextLine();
        StringBuilder inputString = new StringBuilder();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break; // Stop reading input if the user enters an empty line
            }
            inputString.append(line).append("\n");
        }

        scanner.close();

        System.out.println("\nnow you will see how it works");
        OutputTags myOut=new OutputTags();
        String outString=myOut.out(inputString.toString());
        System.out.println(outString);

}}