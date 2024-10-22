package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class VetoresExemplo {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("Elementos do vetor:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println("Soma dos elementos: " + soma);
    }
}
