package br.com.dio.metodos;

public class Calculadora {

    public void soma(double num1, double num2) {
        double resultado = num1 + num2;
        System.out.println("Soma: " + resultado);
    }

    public void subtracao(double num1, double num2) {
        double resultado = num1 - num2;
        System.out.println("Subtracao: " + resultado);
    }

    public void multiplicacao(double num1, double num2) {
        double resultado = num1 * num2;
        System.out.println("Multiplicação: " + resultado);
    }

    public void divisao(double num1, double num2) {
        double resultado = num1 / num2;
        System.out.println("Divisão: " + resultado);
    }

}
