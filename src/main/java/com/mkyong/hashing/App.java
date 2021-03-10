package com.mkyong.hashing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) {

        double eredmeny = 0.0;
        try {


            String text = new BufferedReader(
                    new InputStreamReader(System.in, StandardCharsets.UTF_8))
                    .lines()
                    .collect(Collectors.joining("\n"));

            String[] parts = text.split( regex: "");
            String operand1 = parts[0];
            double operand1 = double.parseDouble(operand1S);
            String operator = parts[1];
            String operand2 = parts[2];
            double operand2 = double.parseDouble(operand2S);


            if ("+".equals(operator)) {//operator.equals("+")
                eredmeny = operand1 + operand2;
            }


            System.out.println(eredmeny);


        } catch (Exception ex) {
            System.out.println("-");
        }
    }
}
