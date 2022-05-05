public class Node <E>{
    private E elemento;	// elemento armazenado no nó
    private Node<E> next;	// próximo elemento da lista... que também é do tipo  Node
    private Node<E> prev; // elemento anterior da lista

    public Node(){
        
    } 
    public Node(E elemento) {
        // construtor	
        this.elemento = elemento;
        next = null;
        prev = null;
    }

    public void mostraElemento(){
        System.out.println("Elemento: " + elemento);
    }


    public E getElemento() {
        return elemento;
    }
    public void setElemento(E elemento) {
        this.elemento = elemento;
    }

    public Node<E> getNext() {
        return next;
    }
    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getPrev() {
        return prev;
    }
    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

}
