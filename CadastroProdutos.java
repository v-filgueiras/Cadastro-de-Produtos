package ProgramaçãoOrientadaObjetos;

public class CadastroProdutos {
    private String nome;
    private double preco;
    private int quantidade;

    public CadastroProdutos(String nome, double preco, int quantidade) {
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Setters com validação
    public void setNome(String nomeProduto) {
        if (nomeProduto == null || nomeProduto.isEmpty()) {
            throw new IllegalArgumentException("O nome do produto não pode ser nulo ou vazio.");
        }
        this.nome = nomeProduto;
    }

    public void setPreco(double precoProduto) {
        if (precoProduto > 0) {
            this.preco = precoProduto;
        } else {
            System.out.println("O preço do produto deve ser maior que zero.");
        }
    }

    public void setQuantidade(int quantidadeProduto) {
        if (quantidadeProduto >= 0) {
            this.quantidade = quantidadeProduto;
        } else {
            System.out.println("A quantidade deve ser zero ou maior.");
        }
    }

    public double calcularValorTotal() {
        return this.preco * this.quantidade;
    }

    public void imprimirDetalhes() {
        System.out.println("----------------------------");
        System.out.println("Produto: " + this.nome);
        System.out.printf("Preço: R$ %.2f%n", this.preco);
        System.out.println("Quantidade em estoque: " + this.quantidade);
        System.out.printf("Valor total em estoque: R$ %.2f%n", calcularValorTotal());
    }

    public static void main(String[] args) {
        try {
            CadastroProdutos produto1 = new CadastroProdutos("Pasta de Dente", 10.0, 2);
            CadastroProdutos produto2 = new CadastroProdutos("Shampoo", 15.0, 1);
            CadastroProdutos produto3 = new CadastroProdutos("", 15.0, 1); // vai lançar exceção
            produto1.imprimirDetalhes();
            produto2.imprimirDetalhes();
            produto3.imprimirDetalhes();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar produto: " + e.getMessage());
        }
    }

}
