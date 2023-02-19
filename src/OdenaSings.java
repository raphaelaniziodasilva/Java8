import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OdenaSings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        palavras.add("Alura online");
        palavras.add("editora casa do codigo");
        palavras.add("psg");
        palavras.add("Bayer");
        palavras.add("City");

        // fazendo a ordenação da nossa lista por tamanho da string do menor para o maior
        // vamos usar o metodo sort do java para fazer a ordenação da nossa lista
        // o lambdas -> e parecido com as arrow function => usam a mesma forma

        // primeira forma utilizando o lambda
        // fazendo a ordenação da lista utilizando o metodo sort do java e comparando duas strings uma com a outra
        palavras.sort((s1, s2) -> {
            if(s1.length() < s2.length())
                return -1;
            if(s1.length() > s2.length())
                return 1;
            return 0;
        });

        // segunda forma utilizando o lambda junto com o metodo compare
        // fazendo a ordenação da lista utilizando o metodo sort do java
        palavras.sort((s1, s2) -> {
            // utilizando metodo compare do java para comparar duas strings uma com a outra
            return Integer.compare(s1.length(), s2.length());
        });
        System.out.println(palavras);

        // vamos utilizar o forEach percorrer a lista e imprimir seus elementos
        // o lambdas -> e parecido com as arrow function => usam a mesma forma
        palavras.forEach(s -> {
            // dentro do array de palavras para cada palavra no indice s imprima o indice s
            System.out.println(s);
        });
    }
}
