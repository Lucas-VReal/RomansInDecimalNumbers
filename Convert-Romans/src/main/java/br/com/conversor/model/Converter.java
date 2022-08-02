package br.com.conversor.model;


public class Converter {

        public int romanToInt(String s) {

            int answer = 0;
            s = s.toUpperCase();
            char[] convert = s.toCharArray();

            for(int i = 0; i < s.length(); i++) {

                String letter = String.valueOf(convert[i]);
                String nextLetter = "";
                try {
                    nextLetter = String.valueOf(convert[i + 1]);
                } catch (Exception e) {

                } finally {

                        switch (letter) {
                            case "I":
                                if(nextLetter.equalsIgnoreCase("X")){
                                    i += 1;
                                    answer += 9;break;
                                } else if (nextLetter.equalsIgnoreCase("V")) {
                                    i += 1;
                                    answer += 4;break;
                                } else {
                                    answer += 1;break;
                                }
                            case "V":
                                answer += 5;break;
                            case "X":
                                if(nextLetter.equalsIgnoreCase("L")) {
                                    i =+ 1;
                                    answer += 40;break;
                                } else if (nextLetter.equalsIgnoreCase("C")) {
                                    i =+ 1;
                                    answer += 90;break;
                                } else {
                                    answer += 10;
                                    break;
                                }
                            case "L":
                                answer += 50;break;
                            case "C":
                                if(nextLetter.equalsIgnoreCase("M")){
                                    i += 1;
                                    answer += 900;break;
                                }else {
                                    answer += 100;break;
                                }
                            case "D":
                                answer += 500;break;
                            case "M":
                                answer += 1000;break;
                        }
                    }

                }

            return answer;

        }

    }