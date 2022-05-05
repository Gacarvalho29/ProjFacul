public class ListaLigada <E> {

    private Node<E> header; // início da lista ligada
    private Node<E> trailer; // fim da lista ligada
    private int size;    // quantidade de elementos na lista ligada

    public ListaLigada() {
        // construtor - cria uma lista vazia
        header = null;
        trailer = null;
        size = 0;
    }

    public int size() {
        // retorna o tamanho da lista	
        return size;
    }

    public boolean isEmpty() {
        // verifica se a lista está vazia
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Node<E> first() {
        // retorna o Nó inicial da lista
        return header;
    }

    public Node<E> last() {
        // retorna o nó final da lista
        return trailer;
    }

    public void addFirst(Node<E> novoElemento) {
        // adiciona um elemento no início da Lista
        if (isEmpty()) {
            // a lista está vazia
            header = novoElemento;
            trailer = novoElemento;
        } else {
            // já existe pelo menos um elemento na lista
            novoElemento.setNext(header);
            header = novoElemento;
        }
        size++;
    }

    public void addLast(Node<E> novoElemento) {
        // adiciona um elemento no final da Lista
        if (isEmpty()) {
            // a lista está vazia
            header = novoElemento;
            trailer = novoElemento;
        } else {
            // já existe pelo menos um elemento na lista
            trailer.setNext(novoElemento);
            trailer = novoElemento;
        }
        size++;
    }

    public void mostraLista() {
        //mostra todos os elementos da lista
        Node<E> aux = header;
        header.mostraElemento();
        while (aux.getNext() != null) {
            aux.setNext(aux);;
            aux.mostraElemento();
        }
        System.out.println("Fim da Lista!");
    }

    public void addAfter(Node<E> novoElemento, E pos) throws Exception {
        // adiciona o nó novoElemento depois do elemento indicado por pos
        if (isEmpty()) // se a lista estiver vazia
        {
            throw new Exception("Lista vazia!");
        } else {
            // verifica se a posição de inserção é o final da lista
            if (trailer.getElemento().equals(pos)) {
                addLast(novoElemento);
            } else {
                // procura a posição de inserção
                Node<E> aux;
                for (aux = header; aux.getNext() != null; aux.setNext(aux)) {
                    if (aux.getElemento().equals(pos)) {
                        novoElemento.setNext(aux.getNext()); 
                        aux.setNext(novoElemento);
                        size++;
                    }
                }
            }
        }
    }

    public void addBefore(Node<E> novoElemento, E pos) throws Exception {
        // adiciona o nó novoElemento antes do elemento indicado por pos
        if (isEmpty()) // se a lista estiver vazia
        {
            throw new Exception("Lista vazia!");
        } else {
            // verifica se a posição de inserção é o início da lista
            if (header.getElemento().equals(pos)) {
                addFirst(novoElemento);
            } else {
                // procura a posição de inserção
                Node<E> aux, ant = null;
                for (aux = header; !(aux.getElemento().equals(pos)); aux.setNext(aux)) {
                    ant = aux;
                }
                ant.setNext(novoElemento);
                novoElemento.setNext(aux);
                size++;
            }
        }
    }

    public void remove(E elemento) throws Exception {
        // remove o elemento indicado como parâmetro
        if (isEmpty()) // se a lista estiver vazia
        {
            throw new Exception("Lista vazia!");
        } else {
            // verifica se o elemento a ser removido é o primeiro da lista
            if (header.getElemento().equals(elemento)) {
                header.setNext(header);
            } else {
                // procura pelo elemento que será removido
                Node<E> aux, ant = null;
                for (aux = header; !(aux.getElemento().equals(elemento)); aux.setNext(aux)) {
                    ant = aux;
                }
                ant.setNext(aux.getNext());
            }
            size--;
        }
    }

    
}
