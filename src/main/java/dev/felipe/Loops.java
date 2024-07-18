package dev.felipe;

public class Loops {

    public static void imprimirTablaMultiplicar(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static String[] obtenerTablaMultiplicar(int n) {
        String[] tabla = new String[10];
        for (int i = 1; i <= 10; i++) {
            tabla[i - 1] = n + " x " + i + " = " + (n * i);
        }
        return tabla;
    }

    public static void main(String[] args) {
        int n = 5;
        imprimirTablaMultiplicar(n);
    }
}
