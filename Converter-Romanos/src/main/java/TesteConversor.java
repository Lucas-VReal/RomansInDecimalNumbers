import br.conversor.model.Conversor;

import java.util.Scanner;

public class TesteConversor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o númeral romano: ");
        String resposta = scan.nextLine();
        System.out.println("");

        Conversor cv = new Conversor();

        int numeral = cv.romanToInt(resposta);
        System.out.println("O valor do seu número é : " + numeral);

    }
}
