package Ejercicio_Base10;

public class EjercicoBase10 {

    //Creamos la funcion para converir un numero n en base 10
    public static String convertirBase(int n, int base) {
        if (n == 0) {
            return "0"; // Caso base: el número es cero
        } else if (n < 0) {
            return "-" + convertirBase(-n, base); // Tratamos números negativos
        } else {
            if (n < base) {
                return convertirCaracter(n);
            } else {
                int residuo = n % base;
                int cociente = n / base;
                return convertirBase(cociente, base) + convertirCaracter(residuo);
            }
        }
    }

    public static String convertirCaracter(int numero) {
        if (numero < 10) {
            return Integer.toString(numero);
        } else {
            char letra = (char) ('A' + (numero - 10));
            return Character.toString(letra);
        }
    }

    public static void main(String[] args) {
        int numero = 110;
        int base = 9;

        if (base < 2 || base > 16) {

        } else {
            String resultado = convertirBase(numero, base);
            System.out.println("El número " + numero + " en base " + base + " es: " + resultado);
        }
    }
}





