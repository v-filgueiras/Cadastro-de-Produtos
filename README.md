# 🛒 Cadastro de Produtos – Java (POO)

Este é um projeto simples em Java voltado para praticar os conceitos fundamentais de **Programação Orientada a Objetos (POO)**. 
Ele simula um sistema básico de **cadastro de produtos**, com validações e operações como cálculo do valor total em estoque.

---

## 🚀 Funcionalidades

- Cadastro de produtos com:
  - Nome
  - Preço
  - Quantidade em estoque
- Validação de dados:
  - Nome não pode ser nulo ou vazio
  - Preço deve ser maior que zero
  - Quantidade não pode ser negativa
- Cálculo automático do valor total em estoque
- Impressão formatada dos dados do produto
- Tratamento de exceções em tempo de execução

---

## 💡 Conceitos aplicados

- Encapsulamento com atributos `private`
- Uso de `getters` e `setters` com validação
- Construtor utilizando os setters
- Tratamento de exceções (`IllegalArgumentException`)
- Impressão formatada com `System.out.printf`

---

## 📦 Estrutura do projeto

CadastroProdutos.java

## ▶️ Como Executar ?

- Compile o arquivo: javac CadastroProdutos.java
- Execute o programa: java CadastroProdutos

## 📸 Exemplo de saída

----------------------------
Produto: Pasta de Dente
Preço: R$ 10.00
Quantidade em estoque: 2
Valor total em estoque: R$ 20.00
----------------------------
Produto: Shampoo
Preço: R$ 15.00
Quantidade em estoque: 1
Valor total em estoque: R$ 15.00
Erro ao criar produto: O nome do produto não pode ser nulo ou vazio.
----------------------------

## 👨‍💻 Autor

Desenvolvido por Victor Filgueiras Santana 
