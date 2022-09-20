package br.com.dio.tipodados;

public class Variaveis {
    public static void main(String[] args) {
        //Case sensitive, é a mesma letra mas não é a mesma variavel
        int i;
        int I;

        //Não deve começar com número
//        int 1a;

        //Má prática começar com _ e $, apesar de não dá erro
        int _1a;
        int $aq;

        //Caracteres especiais são proibidos, ex: %
//        int asr2$jd%dsad_md = 10;

        //Váriaveis dentro de métodos sempre devem ser inicializadas
        i = 5;
        I = 10;
        _1a = 30;
        $aq = 7;

        //Variaveis final, constante, devem ter letras maiusculas e separados por _
        final int J = 10;
//        J = 15;
        final int NUMERO_TENTATIVAS = 5;

        //Primeira letra deve ser miniscula
        int quantidadeProduto = 50;
//        int QuantidadeProduto;
    }
}
