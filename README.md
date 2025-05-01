# Sistema de Cadastro para Transportadora

## Descrição

Este sistema foi desenvolvido para gerenciar o cadastro de veículos, produtos e embalagens de uma transportadora. Além disso, o sistema possui um painel de resumo que exibe informações importantes sobre os dados cadastrados, como quantidades e categorias de veículos, produtos e embalagens.

### Funcionalidades:
- **Cadastro de veículos**: Permite o cadastro de veículos com informações como ID, nome, placa, modelo, tipo, dimensões e capacidade de peso.
- **Cadastro de produtos**: Permite o cadastro de produtos com campos como ID, nome, descrição, família, tipo, lote, dimensões, peso, grau de fragilidade e observações.
- **Cadastro de embalagens**: Permite o cadastro de embalagens associadas a produtos com campos como tipo, dimensões, peso, empilhamento e observações.
- **Painel de resumo**: Exibe um resumo dos dados cadastrados, como número de veículos e produtos cadastrados, tipos de produtos e lotes, entre outros.

## Objetivo
O objetivo deste projeto é Auxiliar no processo de cadastro e organização dos dados de veículos, produtos e embalagens para a transportadora, facilitando o gerenciamento e o acesso às informações.

## Funcionalidades Específicas:
### Cadastro de Veículos:
- ID
- Nome do veículo
- Placa
- Modelo
- Tipo (ex: Caminhão aberto, Baú, Pick-up, etc)
- Dimensões (Altura interna, Largura interna, Comprimento interno)
- Capacidade de peso
- Observações

### Cadastro de Produtos:
- ID
- Nome do produto
- Descrição
- Família
- Tipo
- Lote
- Dimensões (Altura, Largura, Comprimento)
- Peso
- Grau de fragilidade (Alta, Média ou Baixa)
- Observações

### Cadastro de Embalagens:
- Produto associado (puxado do cadastro de produtos)
- Tipo de embalagem (Caixa, Tambor, etc)
- Dimensões (Altura, Largura, Comprimento)
- Peso
- Empilhável (Sim ou Não - Checkbox)
- Observações

### Painel de Resumo:
- Número de veículos cadastrados por tipo e total
- Número de produtos cadastrados por tipo e total
- Quantidade de embalagens por tipo e total
- Número de famílias de produtos
- Número de tipos de produtos
- Número de lotes cadastrados

## Tecnologias Utilizadas
- **Java**: Linguagem de programação utilizada para o desenvolvimento do sistema.
- **NetBeans**: IDE utilizada para o desenvolvimento.
- **Swing**: Biblioteca para a criação das interfaces gráficas.

## Instruções de Uso
1. Abra o projeto no NetBeans.
2. Execute o sistema através da opção **Run**.
3. A tela principal será exibida, com opções para acessar os cadastros de veículos, produtos, embalagens e o painel de resumo.

## Requisitos
- **Sistema Operacional**: Windows / Linux / macOS
- **Java**: JDK 8 ou superior
- **NetBeans**: IDE para executar o projeto.

## Data de Entrega
Este projeto foi desenvolvido para a entrega do **Trabalho Prático I** da disciplina de **Topicos Avançados** com prazo de entrega até **7 de maio de 2025 às 09:30**.

## Contribuição
Este trabalho foi realizado por Marcos Vinicios Botelho dos Santos Nunes.
