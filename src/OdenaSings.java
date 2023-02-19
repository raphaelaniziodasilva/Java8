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
