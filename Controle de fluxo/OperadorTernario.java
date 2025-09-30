/* public class Main {
    public static void main(String[] args) {
        int numero = 10;
        String resultado;
 
        if (numero % 2 == 0) {
            resultado = "Par";
        } else {
            resultado = "Ímpar";
        }
 
        System.out.println("O número é: " + resultado);
    }
} 
*/



//Usando o Operador Ternário:

public class OperadorTernario {
    public static void main(String[] args) {
        int numero = 10;
        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
 
        System.out.println("O número é: " + resultado);
    }
}