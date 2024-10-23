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
public class OrdenacaoInsertionSort implements Ordenacao{
    @Override
    public List<Integer> ordenar(List<Integer> numeros) {
        int n = numeros.size();
        for (int i = 1; i < n; i++) {
            int chave = numeros.get(i);
            int j = i - 1;

            // Move os elementos maiores que a chave para frente
            while (j >= 0 && numeros.get(j) > chave) {
                numeros.set(j + 1, numeros.get(j));
                j--;
            }
            numeros.set(j + 1, chave);
        }
        return numeros;
    }
}
