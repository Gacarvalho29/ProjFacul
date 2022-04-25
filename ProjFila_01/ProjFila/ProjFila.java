package ProjFila;

public class ProjFila {
    public static void main(String[] args) throws Exception{
        
        Queue q1 = new Queue(5);
        Pilha p1 = new Pilha(5);

        q1.enqueue("Marcos");
        q1.enqueue("Pedro");
        q1.enqueue("João");
        q1.enqueue("Carlos");
        q1.enqueue("Gabriel");

        System.out.println("Primeiro da Fila: " + q1.front());
        
        // transfere da fila para pilha
        while (q1.size()!=0){            
            p1.push(q1.front());
            q1.dequeue();
        }
        
        
        // transfere da pilha para fila
        while (p1.size()!=0){
           
            q1.enqueue(p1.top());
            p1.pop();
        }
        
        for (int i=0;i<q1.size();i++)
            System.out.println(q1.get(i));
        
        System.out.println("Primeiro da fila: " + q1.front());
    }
}
