package model;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Produto> produtos;

    public CarrinhoDeCompras(){
        produtos = new ArrayList<>();
    }

    public void adiciona(Produto p){
        produtos.add(p);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
