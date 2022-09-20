package br.com.dio.tipodados;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Número inteiros (tipo | tamanho | faixa | valor padrão)
            //byte | 8 bits | -128 a 127 | 0
            byte b1 = 10;
            //short | 16 bits | -32.768 a 32.767 | 0
            short s1 = 20000;
//            short s2 = 40000;
            //int | 32 bits | -2^31 a 2^31 – 1 | 0
//            int i1 = -100000000000;
            int i2 = 28500;
            //long | 64 bits | -2^63 a 2^63 -1 | 0L
            long l1 = 1000000000000000000L;
            long l2 = 2004005000500055000L;

        //Número de ponto flutuante (tipo | tamanho | faixa | valor padrão)
            //float | 32 | IEEE 754 ±1,40129846432481707e-45 a 3,40282346638528860e+38 | 0.0f
//          float f1 = 4.5; Se não especificar, infere que é double
            float f2 = 10.68f;
            //double | 64 | IEEE 754 ±4,94065645841246544e-324 a 1,79769313486231570e+308 | 0.0d
            double d1 = 85.69;
            double d2 = 99.04d;

         //Caracteres
            // char | 16 bits | valor mínimo: ‘\u0000’ (ou 0), valor máximo: ‘\uffff’ (ou 65535)
            char c1 = 'a';
//            char c2 = 'sn';
            char c3 = '\u0057';
           //String  - tipo de dado composto
            String st1 =  "Fulano";

         //Boolean
            boolean bo1 = true;
            boolean bo2 = false;
    }
}
