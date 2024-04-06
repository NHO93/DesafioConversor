package Calculavel;

import Vendavel.Produto;

public class ProdutoFisico extends Produto implements Calculavel {
    public double calcularPrecoFinal() {
        // Implementação com taxas adicionais para produtos físicos
        double preco = super.calcularPrecoTotal(1);
        return preco * 1.05;
    }
}