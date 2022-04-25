package ProjCompras;

public class ItemCompra{

    //Atributos
    private String descricao;
    private int qtde;
    private double preco;

    //Construtor
    public ItemCompra(String descricao, int qtde, double preco) {
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }

    //Métodos
    public String mostraItem(){
        return "Descrição: "+ descricao + "Preço: " + preco + "Subtotal: " + this.calcSubtotal();
    }
    public double calcSubtotal(){
        double total;
        total = this.qtde*preco;
        return total;
    }

    //Getters e Setters
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getQtde() {
        return qtde;
    }
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

}