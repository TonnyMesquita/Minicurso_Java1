package com.youtube.tonny_mesquita.logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EstruturaDeDecisao {
    public static void main(String[] args) throws ParseException {
        numeroPar();
        stringIgual();
        stringInicia();
        data();
    }

    private static void numeroPar() {
        Integer numero = 3;

        if (numero % 2 == 0) {
            // executo codigo daqui quando verdadeiro
            System.out.println("par");

        } else {
            // executo aqui quando falso
            System.out.println("ímpar");
        }
    }

    private static void stringIgual() {
        String frase = "Hoje é sábado";

        if (frase.contains("segunda-feira")) {
            if (frase.contains("hora de alegria")) {
                // executo codigo daqui quando verdadeiro
                System.out.println("tristeza");
            } else {
                System.out.println("tristeza");
            }
        } else if (frase.contains("sexta-feira")
                ||
                frase.contains("sábado")
                ||
                frase.contains("domingo")
        ) {
            // executo aqui quando falso

            System.out.println("dia de alegria");
        } else {
            // executo aqui quando falso
            System.out.println("dia normal");
        }
    }

    private static void stringInicia() {
        String palavra = "anábola";

        if ((palavra.startsWith("a"))) {
            System.out.println("palavra iniciada em a");
        }else{
            System.out.println("palavra iniciada com outra letra");
        }
    }
    private static void data() throws ParseException {
        Date data = new SimpleDateFormat("dd/MM/yyyy").parse("21/05/2103");

        if (data.before((new Date()))){
            System.out.println("esse dia já passou");
        }else{
            System.out.println("esse dia está por vir");
        }
    }
}

