public class Main {
  public static void main(String[] args) throws Exception{
    ListaLigada <String> lista1 = new ListaLigada<>();
    lista1.addLast(new Node<>("Passaro"));

    ListaLigada <Integer> lista2 = new ListaLigada<>();
    lista2.addLast(new Node<>(2)); 
    
    ListaLigada<String> lista3 = new ListaLigada<>();
    lista3.addLast(new Node<>("Gato"));
    
    ListaLigada <String>lista4 = new ListaLigada<>();
    for (int i = 0; i < lista1.size(); i++) {
        lista4.addLast(new Node<>());
        }
        
        for (int j = 0; j < lista3.size(); j++) {
        lista4.addLast(new Node<>());
        }
    lista4.mostraLista();
    }    
}