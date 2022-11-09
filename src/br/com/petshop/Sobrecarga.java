package br.com.petshop;

public class Sobrecarga {
    public static void main(String[] args) {

        int resultadoSoma2Numeros = somarNumeros(10, 20);
        double resultadoSoma3Numeros = somarNumeros(10, 20, 30);

        System.out.println("Somar 2 números = " + resultadoSoma2Numeros);
        System.out.println("Somar 3 números = " + resultadoSoma3Numeros);
    }
        private static int somarNumeros(int valor1, int valor2){
            return valor1 + valor2;
        }

        public static double somarNumeros(double valor1, double valor2, double valor3){
            return valor1 + valor2 + valor3;
        }
    }

