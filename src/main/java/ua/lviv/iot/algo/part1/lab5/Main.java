//package  ua.lviv.iot.algo.part1.lab5;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args)  {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write code html");
//        StringBuilder inputString = new StringBuilder();
//
//        while (scanner.hasNextLine()) {
//            String line = scanner.nextLine();
//            if (line.isEmpty()) {
//                break; // Stop read input if the user enters an empty line
//            }
//            inputString.append(line).append("\n");
//        }
//
//        scanner.close();
//
//        System.out.println("\nNow you will see how it works");
//        OutputTags myOut = new OutputTags();
//        String outString = myOut.out(inputString.toString());
//        System.out.println(outString);
//    }
// }