package br.com.dio.metodos;

public class Sobrecarga {
    //É a capacidade de definir métodos para diferentes contextos, mas preservando seu nome
    //Crie uma aplicação que calcula a area do: quadrado, retangulo e trapezio
    public static void area(double lado){
        double resultado = lado * lado;
        System.out.println("Area do quadrado: " + resultado);
    }
    public static void area(double base, double altura){
        double resultado = base * altura;
        System.out.println("Area do retângulo: " + resultado);
    }
    public static void area(double baseMaior, double baseMenor, double altura){
        double resultado = ((baseMaior + baseMenor) * altura) / 2;
        System.out.println("Area do trapézio: " + resultado);
    }
    //Apesar de parecer com o retangulo, tem tipos diferentes, se fossem tipos iguais daria erro
    public static void area(float diagonal1, float diagonal2){
        double resultado = (diagonal1 * diagonal2)/2;
        System.out.println("Area do losangulo: " + resultado);
    }

}
