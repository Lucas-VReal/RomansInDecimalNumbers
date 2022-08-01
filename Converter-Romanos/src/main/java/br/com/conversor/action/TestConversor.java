package br.com.conversor.action;

import br.com.conversor.model.Converter;

import java.util.Scanner;

public class TestConversor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insert the romans number here: ");
        String resposta = scan.nextLine();
        System.out.println("");

        Converter cv = new Converter();

        int number = cv.romanToInt(resposta);
        System.out.println("The value of your number is: " + number);

    }
}
