package cadastro_transportadora.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
    public static Map<String, Integer> getVeiculosPorTipo() {
        Map<String, Integer> mapa = new HashMap<>();
        for (Veiculo v : veiculos) {
            String tipo = v.getTipo(); 
            mapa.put(tipo, mapa.getOrDefault(tipo, 0) + 1);
        }
        return mapa;
    }

    public static int getTotalVeiculos() {
        return veiculos.size();
    }


    public static Map<String, Integer> getProdutosPorTipo() {
        Map<String, Integer> mapa = new HashMap<>();
        for (Produto p : produtos) {
            String tipo = p.getTipo();
            mapa.put(tipo, mapa.getOrDefault(tipo, 0) + 1);
        }
        return mapa;
    }

    public static int getTotalProdutos() {
        return produtos.size();
    }

 
    public static int getTotalFamilias() {
        Set<String> familias = new HashSet<>();
        for (Produto p : produtos) {
            familias.add(p.getFamilia()); 
        }
        return familias.size();
    }

   
    public static int getTotalTiposProduto() {
        Set<String> tipos = new HashSet<>();
        for (Produto p : produtos) {
            tipos.add(p.getTipo());
        }
        return tipos.size();
    }


    public static int getTotalLotes() {
        Set<String> lotes = new HashSet<>();
        for (Produto p : produtos) {
            lotes.add(p.getLote()); 
        }
        return lotes.size();
    }

 
    public static Map<String, Integer> getEmbalagensPorTipo() {
        Map<String, Integer> mapa = new HashMap<>();
        for (Embalagem e : embalagens) {
            String tipo = e.getTipo(); 
            mapa.put(tipo, mapa.getOrDefault(tipo, 0) + 1);
        }
        return mapa;
    }

    public static int getTotalEmbalagens() {
        return embalagens.size();
    }
}
