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
public class OrdenacaoSelectionSort implements Ordenacao {

    @Override
    public List<Integer> ordenar(List<Integer> numeros) {
        int n = numeros.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numeros.get(j) < numeros.get(minIndex)) {
                    minIndex = j;
                }
            }
            // Swap
            int temp = numeros.get(minIndex);
            numeros.set(minIndex, numeros.get(i));
            numeros.set(i, temp);
        }
        return numeros;
    }
}
