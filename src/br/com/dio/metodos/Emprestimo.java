package br.com.dio.metodos;

public class Emprestimo {
    public static void calcula(double valor, int parcelas){
        if(parcelas == 2){
            double valorFinal = valor * 1.3;
            System.out.println("Dividindo em " + parcelas + " parcelas, o valor final fica: " + valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valor * 1.45;
            System.out.println("Dividindo em " + parcelas + " parcelas, o valor final fica: " + valorFinal);
        } else if (parcelas != 2 | parcelas!= 3){
            System.out.println("Escolha uma parcela válida");
        }
    }
}
