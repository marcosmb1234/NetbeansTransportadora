/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro_transportadora.model;

public class TesteCadastro {
    public static void main(String[] args) {
        BancoDeDadosFake banco = new BancoDeDadosFake();

        // Criar e cadastrar veículo
        Veiculo veiculo = new Veiculo();
        veiculo.setId(1);
        veiculo.setNome("Caminhão Ford");
        veiculo.setPlaca("ABC-1234");
        veiculo.setModelo("F-4000");
        veiculo.setTipo("Caminhão Baú");
        veiculo.setAlturaInterna(2.5);
        veiculo.setLarguraInterna(2.0);
        veiculo.setComprimentoInterno(6.0);
        veiculo.setCapacidadePeso(3000);
        veiculo.setObservacoes("Veículo novo");

        banco.addVeiculo(veiculo);

        // Criar e cadastrar produto
        Produto produto = new Produto();
        produto.setId(1);
        produto.setNome("Geladeira");
        produto.setDescricao("Geladeira inox 500L");
        produto.setFamilia("Eletrodoméstico");
        produto.setTipo("Eletrônico");
        produto.setLote("L123");
        produto.setAltura(1.8);
        produto.setLargura(0.7);
        produto.setComprimento(0.8);
        produto.setPeso(90);
        produto.setGrauFragilidade("Alta");
        produto.setObservacoes("Manusear com cuidado");

        banco.addProduto(produto);

        // Criar e cadastrar embalagem
        Embalagem embalagem = new Embalagem();
        embalagem.setProdutoAssociado(produto);
        embalagem.setTipo("Caixa");
        embalagem.setAltura(2.0);
        embalagem.setLargura(1.0);
        embalagem.setComprimento(1.2);
        embalagem.setPeso(5);
        embalagem.setEmpilhavel(true);
        embalagem.setObservacoes("Caixa de papelão reforçada");

        banco.addEmbalagem(embalagem);

        // Mostrar resultados
        System.out.println("Veículos cadastrados:");
        for (Veiculo v : BancoDeDadosFake.getVeiculos()) {
            System.out.println("- " + v.getNome() + " (" + v.getPlaca() + ")");
        }

        System.out.println("\nProdutos cadastrados:");
        for (Produto p : BancoDeDadosFake.getProdutos()) {
            System.out.println("- " + p.getNome() + " (" + p.getDescricao() + ")");
        }

        System.out.println("\nEmbalagens cadastradas:");
        for (Embalagem e : BancoDeDadosFake.getEmbalagens()) {
            System.out.println("- Produto: " + e.getProdutoAssociado().getNome() + ", Tipo: " + e.getTipo());
        }
    }
}
