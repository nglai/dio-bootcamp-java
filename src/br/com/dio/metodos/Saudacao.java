package br.com.dio.metodos;

public class Saudacao {
    public static void saudacao(int horario) {
        if (horario >= 5 & horario <= 12) {
            System.out.println("Bom dia!");
        } else if (horario > 12 & horario <= 18) {
            System.out.println("Boa tarde!");
        } else if (horario > 18 & horario <= 24) {
            System.out.println("Boa noite");
        } else if (horario >=1 & horario <= 4) {
            System.out.println("Boa noite");
        } else {
            System.out.println("Horário não existe");
        }
    }
}