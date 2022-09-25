package br.com.dio.metodos;

public class Main {
    public static void main(String[] args) {
        //Calculadora
        Calculadora calculadora = new Calculadora();
        calculadora.soma(4, 8);
        calculadora.subtracao(4.7, 5);
        calculadora.multiplicacao(8.4, 5);
        calculadora.divisao(50, 4);

        //Saudação
        Saudacao.saudacao(12);
        Saudacao.saudacao(13);
        Saudacao.saudacao(18);
        Saudacao.saudacao(20);
        Saudacao.saudacao(2);
        Saudacao.saudacao(4);
        Saudacao.saudacao(5);
        Saudacao.saudacao(30);

        //Emprestimo
        Emprestimo.calcula(1000,2);
        Emprestimo.calcula(1000,3);
        Emprestimo.calcula(1000,4);

        //Sobrecarga
        Sobrecarga.area(15);
        Sobrecarga.area(15d, 2d);
        Sobrecarga.area(15f, 2f);
        Sobrecarga.area(15, 20, 4);

    }
}
