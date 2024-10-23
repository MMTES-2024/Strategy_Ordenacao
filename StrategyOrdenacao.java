/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ex01.strategyordenacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class StrategyOrdenacao {

    public static void main(String[] args) {
        ContextoOrdenacao contexto = new ContextoOrdenacao();
        Scanner scanner = new Scanner(System.in);

        // Exemplo de lista de números
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Insira números para ordenar, separados por espaço:");
        String[] entrada = scanner.nextLine().split(" ");
        for (String s : entrada) {
            numeros.add(Integer.valueOf(s));
        }

        // Escolha de estratégia
        while (true) {
            System.out.println("Escolha o algoritmo de ordenação:");
            System.out.println("1 - Bubble Sort");
            System.out.println("2 - Selection Sort");
            System.out.println("3 - Insertion Sort");
            System.out.println("0 - Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();  

            switch (escolha) {
                case 1 ->
                    contexto.setEstrategia(new OrdenacaoBubbleSort());
                case 2 ->
                    contexto.setEstrategia(new OrdenacaoSelectionSort());
                case 3 ->
                    contexto.setEstrategia(new OrdenacaoInsertionSort());
                case 0 -> {
                    System.out.println("Encerrando o programa...");
                    return;  
                }
                default -> {
                    System.out.println("Escolha inválida, retornando ao menu.");
                    continue; 
                }
            }

            System.out.println("Números originais: " + numeros);

            // Executa a ordenação e imprime o resultado
            List<Integer> ordenados = contexto.executarOrdenacao(new ArrayList<>(numeros)); // Clona a lista para não modificar a original
            System.out.println("Lista ordenada: " + ordenados);
            System.out.println("");
        }
    }
}
