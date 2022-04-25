package ProjCompras;

import java.util.ArrayList;

public class Carrinho {
    
    //Atributos
    private ArrayList<ItemCompra> listaItens;
    private double totalCompra;
    private double procDesconto;
    private double valorPagar;

    //Construtor
    public Carrinho(ArrayList<ItemCompra> listaItens, double procDesconto) {
        this.listaItens = listaItens;
        this.procDesconto = procDesconto;
        totalCompra = 0;
        valorPagar = 0;
    }

    //Getters e Setters
    public double getTotalCompra() {
        return totalCompra;
    }
    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }
    public double getProcDesconto() {
        return procDesconto;
    }
    public void setProcDesconto(double procDesconto) {
        this.procDesconto = procDesconto;
    }
    public double getValorPagar() {
        return valorPagar;
    }
    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public ArrayList<ItemCompra> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<ItemCompra> listaItens) {
        this.listaItens = listaItens;
    }

    
}
