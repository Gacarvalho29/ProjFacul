package ProjCompras;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjCompras {
    public static void main(String[] args) throws Exception {
        
        ArrayList <Produto> listaProd = new ArrayList<>();
        ArrayList <ItemCompra> listaItens = new ArrayList<>();
        
        FileReader data = new FileReader("Produtos.txt");
        BufferedReader linha = new BufferedReader (data);
        String aux = linha.readLine();

        int cont = 0;
        
        while (aux != null){
            String[] dados = aux.split(";");
            // 0 = codigo
            // 1 = descrição
            // 2 = preço unitário
            
            Produto entrada = new Produto(Integer.parseInt(dados[0]),
                                  dados[1],Double.parseDouble(dados[2]));
            listaProd.add(entrada);
            cont++;
            aux = linha.readLine();                     
        }
        System.out.println("Qtde de produtos lidos: " + cont);

        int codprod = 0;

        do{
        Scanner info = new Scanner(System.in);
        System.out.print("Insira o código do produto: ");
        codprod = info.nextInt();
        for(int i = 0; i < listaProd.size();i++){
            if(listaProd.get(i).getCodigo() == codprod){
                System.out.println("Descrição: "+listaProd.get(i).getDescricao());
                System.out.print("Quantidade desejada: ");
                int qtdeprod = info.nextInt();
                listaItens.add(new ItemCompra(listaProd.get(i).getDescricao(),qtdeprod,listaProd.get(i).getPreco()));
                }
            }
        }while(codprod != 99999);
        for(int i = 0; i<listaItens.size();i++)
            listaItens.get(i).mostraItem();
        }
}
