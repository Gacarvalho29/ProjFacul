package ProjFila;

public class Vetor {

    private String[] A; // armazena os elementos do vetor (tipo)
    private int capacity; // capacidade do vetor (tamanho físico)
    private int size; // elementos no vetor (tamanho lógico)

    public Vetor(int capacity) {
        A = new String[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return size;
    }

    public String get(int i) throws Exception {
        if (isEmpty()) {
            throw new Exception("Lista vazia!!");
        }
        if (i > size) {
            throw new Exception("Posição inexistente");
        }
        return A[i];
    }

    public void set(int i, String n) throws Exception {
        if (isEmpty()) {
            throw new Exception("Lista vazia!!");
        }
        if (i > size) {
            throw new Exception("Posição inexistente");
        }
        A[i] = n;
    }
    
    public void add(int i, String n) throws Exception {
        if (size==capacity)
            throw new Exception("Lista cheia!!");
        if (i<0 || i>size+1)
            throw new Exception("Posição de inserção inválida!!");
        for (int j = size-1;j >= i; j--)
            A[j+1]= A[j];
        A[i]= n;
        size++;        
    }

    public void remove(int i) throws Exception {
        if (isEmpty())
            throw new Exception("Lista vazia! Impossível excluir");
        if (i<0 || i>=size)
            throw new Exception("Posição de remoção inválida!!");
        for (int j = i;j<size-2;j++)
            A[j]=A[j+1];
        size--;
    }

    public int search(String n) {
        for (int i=0; i<size;i++)
            if (A[i]==(n))
                return i;
        return -1;
    }

    public String[] getArray() {
        return A;
    }

}
