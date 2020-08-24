package exemplos;

import java.util.ArrayList;

public class Exemplo02nomes {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Carlos");

        System.out.println(nomes);

        for(int i=0; i < nomes.size() ; i++){
            System.out.println(nomes.get(i));

        }
    }
    
}