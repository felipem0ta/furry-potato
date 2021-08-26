package one.innovation.digital.tipos.primitivos;

public class Primitivos {
    public static void main(String[] args) {
        //INTEIROS

        // byte nullByte = null; // TIPOS PRIMITIVOS NÃO PODEM SER NULOS
        byte b; //8 bits
        byte b1 = 127;
        byte b2 = -128;
        // byte b3 = 129; // TO LARGE
        char c; // 16 bits
        char c1 = 'A';
        char c2 = 15;
        // char c3 = 'AA'; //NOK
        // char c4 = -1; //NOK
        short s; // 16 bits
        short s1 = 32767;
        short s2 = -32768;
        // short s3 = 32768; // TO LONG
        int i = 2147483647; // 32 bits
        int i1 = -2147483648;
        // int i2 = 1.2; // NOK
        long l= 9223372036854775807l; // 64 bits (l ou L no final)
        long l1= -9223372036854775808l; // 64 bits (l ou L no final)

        //FLUTUANTES

        float f = 65f; // 32 bits
        double d = 1024.99;

        //BOOLEANOS

        boolean bo = true;
        boolean bo1 = false;



    }
}
