package Colec;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/**
 *
 * @author 1130847
 */
public class Main {
    public static void main(String[] args) {
//        List<String> items = new ArrayList<String>();;
//        items.add("um");
//        items.add("dois");
//        items.add("três");
//        Stream<String> stream = items.stream();
//        
//        stream
//            .map(s -> {
//                String s2 = s + " alguma coisa";
//                return s2;
//             })
//             .forEach(System.out::println);
//        
//        items.stream().forEach(System.out::println);
        
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Joaquim", 39));
        pessoas.add(new Pessoa("Célia", 37));
        pessoas.add(new Pessoa("Carolina", 22));
        pessoas.add(new Pessoa("Jeferson", 17));
        
        
        // Imprimir os dados de todas as pessoas no console;
        /*for(int i=0; i<pessoas.size(); i++) {
            System.out.println(pessoas.get(i));
        }*/
        
//        for(Pessoa p: pessoas) {
//            System.out.println(p);
//        }
        
        pessoas.stream().forEach(System.out::println);
        pessoas.stream().forEach(p -> System.out.println(p.getNome()));
        
        pessoas.stream()
                .sorted(Comparator.comparing(Pessoa::getNome).reversed())
                .forEach(System.out::println);
        
//        System.out.println("Imprimir somente as pessoas com idade superior a 21 anos;");
//        for(Pessoa p: pessoas) {
//            if(p.getIdade() > 21)
//                System.out.println(p);
//        }
//        
//        System.out.println("Imprimir somente as pessoas com idade superior a 21 anos em ordem alfabética;");
//        // ordenar
//        // printar
//        
//        System.out.println("Tornar todas as pessoas 1 ano mais velhas;");
//        for(Pessoa p: pessoas) {
//            p.setIdade(p.getIdade() + 1);
//        }
    }
}
