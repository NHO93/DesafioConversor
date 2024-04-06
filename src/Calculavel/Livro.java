package Calculavel;

import Vendavel.Produto;

public class Livro extends Produto implements Calculavel {
    private String autor;

    public double calcularPrecoFinal() {
        double preco = super.calcularPrecoTotal(1);
        return preco * 0.9;
    }
}