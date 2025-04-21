package cadastro_transportadora.model;

import java.util.ArrayList;

public class BancoDeDadosFake {
    private static ArrayList<Veiculo> veiculos = new ArrayList<>();
    private static ArrayList<Produto> produtos = new ArrayList<>();
    private static ArrayList<Embalagem> embalagens = new ArrayList<>();

    public boolean addVeiculo(Veiculo veiculo) {
        if (veiculo.getId() > 0) {
            veiculos.add(veiculo);
            return true;
        }
        return false;
    }

    public boolean addProduto(Produto produto) {
        if (produto.getId() > 0) {
            produtos.add(produto);
            return true;
        }
        return false;
    }

    public boolean addEmbalagem(Embalagem embalagem) {
        if (embalagem != null) {
            embalagens.add(embalagem);
            return true;
        }
        return false;
    }

    public static ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public static ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public static ArrayList<Embalagem> getEmbalagens() {
        return embalagens;
    }
}
