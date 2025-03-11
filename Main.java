import java.util.ArrayList;

public class Main {

//Modele e implemente um método recursivo que calcule o fatorial de um número n passado como parâmetro.


    public static int factorial(int n) {
        return n == 1 ? 1 : n * factorial(n - 1);
    }

    //Modele e implemente um método recursivo que calcule o somatório de um número n (passado como parâmetro) até 0.

    public static int soma(int n) {
        return n == 1 ? 1 : n + soma(n - 1);
    }

    //Modele e implemente um método recursivo que calcule o n-ésimo número da sequência de fibonacci.
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //Modele e implemente um método recursivo que calcule o somatório dos números inteiros entre os números k e j, passados como parâmetro.

    public static int somaEntre(int a, int b) {
        if (a == b) {
            return 0;
        }
        return b+ somaEntre(a, b - 1);
    }

    //Modele e implemente um método recursivo que recebe um String em retorna true se este String for um palíndrome, false caso contrário.

    public static boolean isPalindromo(String s, int inicio, int fim) {
        if (inicio >= fim) return true;
        if (s.charAt(inicio) != s.charAt(fim)) return false;
        return isPalindromo(s, inicio +1,fim-1);
    }
    //Modele e implemente um método recursivo que recebe um inteiro zero ou positivo e retorna um String com o número em binário.

    public static String Convbase2(int n) {

        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        return Convbase2(n / 2) + (n % 2);
    }
    //Modele e implemente um método recursivo que calcule o somatório dos números contidos em um ArrayList de inteiros, passado como parâmetro.
    public static int calcularSomatorio(ArrayList<Integer> numeros, int indice) {
        if (indice < 0) {
            return 0;
        }
        return numeros.get(indice) + calcularSomatorio(numeros, indice - 1);
    }

    //Modele e implemente um método recursivo para encontrar o maior elemento de um ArrayList.
        public static int encontrarMaiorElemento(ArrayList<Integer> numeros, int indice) {
            if (indice == 0) {
                return numeros.get(0);
            }
            int maiorRestante = encontrarMaiorElemento(numeros, indice - 1);
            return Math.max(numeros.get(indice), maiorRestante);
        }

        //Implemente um método recursivo para determinar se um string ocorre dentro de outro.
        public static boolean contemString(String texto, String padrao, int indiceTexto) {
            if (indiceTexto > texto.length() - padrao.length()) {
                return false;
            }
            if (texto.substring(indiceTexto, indiceTexto + padrao.length()).equals(padrao)) {
                return true;
            }
            return contemString(texto, padrao, indiceTexto + 1);
        }

    public static int contarDigitos(int numero) {
        if (numero < 10) {
            return 1;
        }
        return 1 + contarDigitos(numero / 10);
    }

    public static ArrayList<String> permutar(String str) {
        ArrayList<String> resultado = new ArrayList<>();
        if (str.length() == 0) {
            resultado.add("");
            return resultado;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String restante = str.substring(0, i) + str.substring(i + 1);
            for (String perm : permutar(restante)) {
                resultado.add(c + perm);
            }
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int c = factorial(a);
        System.out.println(c);
    }


}