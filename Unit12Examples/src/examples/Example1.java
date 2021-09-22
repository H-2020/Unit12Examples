package examples;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String input=scanner.next();

        Integer number1=Integer.valueOf(input);
        Integer number2=number1+10;
        System.out.println("String is: "+ number1);
        System.out.println("Number 2 is: "+ number2);

        System.out.println(Integer.bitCount(number2));
        System.out.println(Integer.highestOneBit(number2));



    }
}
