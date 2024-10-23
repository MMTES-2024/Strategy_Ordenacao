/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.strategyordenacao;

import java.util.List;

/**
 *
 * @author rafaelamoreira
 */
public class OrdenacaoBubbleSort implements Ordenacao {

    @Override
    public List<Integer> ordenar(List<Integer> numeros) {
        int n = numeros.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numeros.get(j) > numeros.get(j + 1)) {
                    // Swap
                    int temp = numeros.get(j);
                    numeros.set(j, numeros.get(j + 1));
                    numeros.set(j + 1, temp);
                }
            }
        }
        return numeros;
    }
}
