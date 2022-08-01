package br.conversor.model;


public class Conversor {

        public int romanToInt(String s) {

            int resposta = 0;
            s = s.toUpperCase();
            char[] convert = s.toCharArray();

            for(int i = 0; i < s.length(); i++) {

                String letra = String.valueOf(convert[i]);
                String proximaLetra = "";
                try {
                    proximaLetra = String.valueOf(convert[i + 1]);
                } catch (Exception e) {

                } finally {


                    if (letra.equalsIgnoreCase("I") & proximaLetra.equalsIgnoreCase("X") | proximaLetra.equalsIgnoreCase("V")) {
                        if (proximaLetra.equalsIgnoreCase("X")) {
                            i += 1;
                            resposta += 9;
                        } else if (proximaLetra.equalsIgnoreCase("V")) {
                            i += 1;
                            resposta += 4;
                        }
                    } else if (letra.equalsIgnoreCase("X") & proximaLetra.equalsIgnoreCase("L")) {
                        i += 1;
                        resposta += 40;
                    } else {
                        switch (letra) {
                            case "I":
                                resposta += 1;break;
                            case "V":
                                resposta += 5;break;
                            case "X":
                                resposta += 10;break;
                            case "L":
                                resposta += 50;break;
                            case "C":
                                resposta += 100;break;
                            case "D":
                                resposta += 500;break;
                            case "M":
                                resposta += 1000;break;
                        }
                    }

                }
            }

            return resposta;

        }

    }

/*
        tamanho máximo 4
        substituir letras por números e converter pra inteiro


        contador = 0;

        loop pegando próxima casa decimal (cont +=1){
            if ("I" verificar se o proximo contém "X" ou "V"){
                se ("x"){
                cont += 1;
                resultado += 9;
                else if ("V"){
                cont += 1;
                resultado += 4;
         if ( "X" verificar se o proximo contém "L"){
            cont += 1
            resultado += 40
         }

            convertendo letras em números
        }

        s posição 1 contem I então result += 1

}
*/