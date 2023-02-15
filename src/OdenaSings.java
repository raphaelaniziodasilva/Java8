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

        // fazendo a ordenação da nossa lista por tamanho da string para isso vamos usar a interface Comparator
        // precisamos criar uma classe e implementar a interface Comparator

        // criando o comparador de String que vai ser do tipo ComparadorPorTamanho
        Comparator<String> comparador = new ComparadorPorTamanho();

        // fazendo a ordenação pelo tamanho da String
        palavras.sort(comparador);
        System.out.println(palavras);

        // vamos imprimir todos elements da lista e para isso utilizamos o (for) para percorrer o array e imprimir cada elmento
        /**
         *  for (String p: palavras) {
         *             System.out.println(p);
         *      }
         */

        // vamos fazer uma outra forma de percorrer a lista e imprimir seus elementos e para isso vamos utilizar a Consumer
        // precisamos criar uma classe e implementar a interface Consumer

        // criando o consumidor de String que vai ser do tipo ImprimeNaLinha
        Consumer<String> consumidor = new ImprimeNaLinha();
        // o forEach vai receber um consumidor de Strings e vai imprimir a lista
        palavras.forEach(consumidor);
    }
}

class ComparadorPorTamanho implements Comparator<String> {
    // Comparator e responsavel por você implementar e poder dizer olha essa string aqui vem antes e essa depois etc...
    // assim podemos ordenar a lista de string por um outro criterio do jeito que agente preferir

    @Override
    // vamos reescrever esse metodo compare do java.util para poder fazer a ordenação pelo tamanho de String
    // vamos pegar 2 strings e compara uma com a outra pelo tamanho dela
    // se a primeira string for vir antes da segunda string deve retornar um numero negativo se ele vier depois da
    // segunda string ele retorna um valor positivo e se der um empate retorna 0
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length()) {
            return -1;
        }
        if(s1.length() > s2.length()) {
            return 1;
        }
        return 0;
    }
    // agora vamos voltar para a classe OdenaSings e criar o Comparator de string
}

// criando a classe e implementando a nova interface do Java 8 Consumer
class ImprimeNaLinha implements Consumer<String> {

    // reescrevendo o metodo accept
    @Override
    // vai funcionar como se fosse o for passando por cada elemento do array
    public void accept(String s) {
        // toda vez que eu for consumir uma string eu vou
        System.out.println(s); // imprimir a string
    }
    // agora vamos voltar para a classe OdenaSings e criar o Consumer de string
}