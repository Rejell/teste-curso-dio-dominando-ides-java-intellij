package tipos;

public class tiposDados {
    public static void main(String[] args) {

        // Byte: inteiro (-128 até 127)
        byte b1 = 10;
        byte b2 = 20;

        // Short: inteiro (-31.768 até 32.767)
        short s1 = 20000;
        // short s2 = 40000;

        // Int: inteiro - 32 bits (-2.147.483.648 até 2.147.483.647)
        // int i1 = -10000000000;
        int i2 = 28500;

        // Long: inteiro - 64 bits (-9.223.372.036.854.775.808 até 9.223.372.036.854.775.807)
        long l1 = 1000000000000000000L;
        long l2 = 2004005000500055000L;

        // Float: real - 32 bits (+/- 3,40282347E+38F)
        // float f1 = 4.5;
        float f2 = 10.68f;

        // Double = real - 64 bits (+/- 1,79769313486231570E308)
        double d1 = 85.69;
        double d2 = 99.84d;

        // Char: um caracter - 16 bits (char c = '\u0084' = 'T')
        char c1 = 'W';
        // char c2 = 'Tw';
        char c3 = '\u0057';

        // String: caracteres - um tipo especial (string s = "T")
        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "ag dgb se et t KNBJBJBB &*''&%& 75894389";

        // String dt1 = "09/02/1981";

        // Boolean: true or false (boolean b = false)
        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);

    }
}
