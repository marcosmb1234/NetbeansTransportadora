/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro_transportadora.model;

/**
 *
 * @author marco
 */
public class DadosTeste {
    public static final String[][] dadosFicVec = {
        {"201", "TransBike", "ABC-1234", "CargoMax 500", "Caminhão Baú", "2.8", "2.5", "7.0", "15000", "Veículo utilizado para transporte de cargas secas em longas distâncias. Motor revisado."},
        {"202", "CargaLeve", "XYZ-5678", "MiniTruck 200", "Van", "2.0", "1.8", "4.5", "3000", "Ideal para entregas urbanas. Compacto e econômico."},
        {"203", "Expresso Norte", "DEF-9101", "SpeedVan X", "Furgão", "2.2", "2.0", "5.0", "5000", "Alta performance em estradas. Baixo consumo."},
        {"204", "LogMax", "GHI-1122", "TruckMaster 3000", "Caminhão Toco", "3.0", "2.7", "8.5", "18000", "Alta capacidade de carga. Ideal para transporte interestadual."},
        {"205", "DistribuiJá", "JKL-3344", "RapidVan", "Van", "2.1", "1.9", "4.8", "3500", "Van com divisórias internas para cargas variadas."},
        {"206", "CargaFácil", "MNO-5566", "MegaCargo X", "Carreta", "3.2", "3.0", "13.5", "25000", "Carreta para transporte de grandes volumes. Pneus reforçados."},
        {"207", "FrotaSul", "PQR-7788", "EcoTruck S", "Caminhão Baú", "2.9", "2.6", "7.5", "16000", "Modelo ecológico com motor híbrido."},
        {"208", "RápidoLux", "STU-9900", "SprintVan Turbo", "Furgão", "2.3", "2.1", "5.2", "5200", "Ideal para entregas expressas com refrigeração."},
        {"209", "ViaTrans", "VWX-1111", "MaxiCargo T", "Bitrem", "3.4", "3.2", "15.0", "32000", "Bitrem articulado para longas distâncias e grande carga."},
        {"210", "CargaSul", "YZA-2222", "CompactMover", "Van", "2.0", "1.7", "4.2", "2800", "Van compacta para centros urbanos movimentados."},
        {"211", "RodoLog", "BCD-3333", "FlexTruck A", "Caminhão Leve", "2.5", "2.2", "6.0", "8000", "Versátil para entregas mistas em médio porte."},
        {"212", "ExpedLog", "EFG-4444", "SteelVan", "Furgão", "2.4", "2.0", "5.3", "4800", "Estrutura reforçada, ideal para materiais de construção."},
        {"213", "CargaNorte", "HIJ-5555", "GigaMover", "Carreta", "3.5", "3.3", "14.0", "27000", "Transporta containers e cargas pesadas."},
        {"214", "UltraCarga", "KLM-6666", "UrbanTruck", "Caminhão Baú", "2.7", "2.4", "7.2", "14500", "Bom desempenho e baixo consumo."},
        {"215", "EntregasRio", "NOP-7777", "MiniExpress", "Van", "1.9", "1.6", "4.0", "2600", "Van leve com acesso fácil a áreas restritas."}

    };

    public static final String[][] dadosFicProd = {
       {"301", "Produto A", "Caixa com componentes eletrônicos", "Eletrônico", "Produto Acabado", "5001", "30.5", "20.0", "40.0", "2.5", "Muito Frágil", "Produto de tamanho médio, ideal para transporte de itens de peso médio."},
       {"302", "Produto B", "Alimento embalado a vácuo", "Alimento", "Mercadoria para revenda", "5002", "10.0", "5.0", "15.0", "0.2", "Sensível à Temperatura", "Produto leve, usado para embalagens menores e mais rápidas."},
       {"303", "Produto C", "Máquina de cortar madeira", "Material de Construção", "Produto Acabado", "5003", "50.0", "40.0", "60.0", "10.0", "Moderadamente Frágil", "Produto robusto, ideal para transporte de cargas pesadas."},
       {"304", "Produto D", "Medicamento em caixa térmica", "Medicamento", "Produto em Processo", "5004", "40.0", "35.0", "60.0", "8.0", "Sensível à Temperatura", "Embalagem destinada ao transporte de produtos sensíveis à temperatura."},
       {"305", "Produto E", "CONTAINER de roupas dobradas", "Roupa", "Outros Insumos", "5005", "30.0", "50.0", "10.0", "1.0", "Pouco Frágil", "Saco flexível para transporte de roupas e tecidos."},
       {"306", "Produto F", "Conjunto de cosméticos", "Cosmético", "Serviços", "5006", "25.0", "20.0", "30.0", "3.0", "Frágil", "Produtos de beleza em embalagem decorativa."},
       {"307", "Produto G", "Cadeira desmontável", "Mobília", "Produto Acabado", "5007", "60.0", "50.0", "90.0", "12.0", "Resistente", "Cadeira compacta ideal para transporte modular."},
       {"308", "Produto H", "Sabão em pó industrial", "Limpeza", "Materia Prima", "5008", "20.0", "15.0", "25.0", "4.5", "Altamente Resistente", "Produto de limpeza em grande volume para distribuição."},
       {"309", "Produto I", "Sensor de vibração", "Eletrônico", "Produto Acabado", "5009", "12.0", "8.0", "10.0", "0.6", "Sensível à Vibração", "Equipamento técnico delicado para aplicações industriais."},
       {"310", "Produto J", "Frutas frescas embaladas", "Alimento", "Mercadoria para revenda", "5010", "15.0", "10.0", "20.0", "2.0", "Sensível à Umidade", "Frutas frescas embaladas para supermercados."}
    };
    public static final String[][] dadosFicEmb = {
        {"CAIXA", "30.5", "20.0", "40.0", "2.5", "true", "Embalagem de papelão resistente."},
        {"CONTAINER", "15.0", "10.0", "5.0", "0.8", "false", "CONTAINER pequeno para produtos leves."},
        {"TAMBOR", "50.0", "80.0", "50.0", "15.0", "false", "Tambor metálico para líquidos."},
        {"SACO", "25.0", "60.0", "10.0", "1.2", "true", "Saco plástico flexível."},
        {"PAlETE", "33.0", "25.0", "1.0", "0.3", "false", "PAlETE almofadado para documentos e mídias."},
        {"CAIXA", "60.0", "40.0", "70.0", "10.0", "true", "Caixa grande para volumes médios e pesados."},
        {"CONTAINER", "10.0", "5.0", "8.0", "0.4", "false", "CONTAINER compacto para acessórios pequenos."},
        {"TAMBOR", "70.0", "100.0", "70.0", "25.0", "false", "Tambor reforçado para produtos químicos."},
        {"SACO", "40.0", "90.0", "20.0", "2.0", "true", "Saco resistente com alças."},
        {"PAlETE", "22.0", "15.0", "0.5", "0.2", "false", "PAlETE pequeno para envio leve."},
        {"CAIXA", "45.0", "35.0", "60.0", "5.5", "true", "Caixa dobrável reutilizável."},
        {"CAIXA", "100.0", "50.0", "80.0", "20.0", "false", "Caixa paletizável de madeira."},
        {"TAMBOR", "55.0", "85.0", "55.0", "18.0", "false", "Tambor plástico azul padrão industrial."},
        {"SACO", "30.0", "50.0", "15.0", "1.0", "true", "Saco de ráfia costurado para grãos."},
        {"CONTAINER", "20.0", "10.0", "12.0", "0.9", "false", "CONTAINER com plástico bolha interno."}
    };
    
}
