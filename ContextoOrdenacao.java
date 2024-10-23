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
public class ContextoOrdenacao {
    private Ordenacao estrategia;

    // Define qual estratégia será utilizada
    public void setEstrategia(Ordenacao estrategia) {
        this.estrategia = estrategia;
    }

    // Executa a ordenação usando a estratégia definida
    public List<Integer> executarOrdenacao(List<Integer> numeros) {
        return estrategia.ordenar(numeros);
    }
}
