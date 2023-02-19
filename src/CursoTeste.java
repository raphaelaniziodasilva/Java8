import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CursoTeste {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        // vamos ordenar os cursos pelo numero de alunos do curso
        // usando o metodo reference ::
        cursos.sort(Comparator.comparing(Curso::getAlunos));
        // vamos imprimir cada um dos cursos usando forEach
        cursos.forEach(c -> System.out.println(c.getNome()));

        System.out.println("---------------------------");

        // Eu quero imprimir todos os cursos que tem mais de 100 alunos
        // e para isso usamos o metodo stream() aonde ele devolve uma forma de trabalhar com objetos
        cursos.stream()
                // vamos utilizar o metodo filter que vai filtrar os cursos que tem mais de 100 alunos
                .filter(c -> c.getAlunos() >= 100)
                // vamos utilizar o metodo forEach para imprimir somente os cursos que tem mais de 100 alunos
                .forEach(c -> System.out.println("Os cursos que tem mais de 100 alunos " + c.getNome()));

        System.out.println("---------------------------");

        // agora eu quero imprimir o total de alunos que tem nos cursos de mais de 100 alunos
        cursos.stream()
                // filtrando os cursos que tem mais de 100 alunos
                .filter(c -> c.getAlunos() >= 100)
                // agora eu quero saber quantos alunos tem em cada um desses curso
                // vamos utilizar o metodo map
                .map(Curso::getAlunos)
                // forEach para imprimir a quantidade de alunos
                .forEach(System.out::println); // reference

        System.out.println("---------------------------");

        // vamos somar a quantidade de alunos que tem nos cursos com mais de 100 alunos
        int total = cursos.stream()
                // filtrando os cursos que tem mais de 100 alunos
                .filter(c -> c.getAlunos() >= 100)
                // quantos alunos tem em cada um desses curso e fazendo a somatoria dos alunos
                .mapToInt(Curso::getAlunos) // reference
                // somando a quantidade de alunos
                .sum();
        System.out.println(total);

        System.out.println("---------------------------");

        // retornando quaquer curso tenha mais de 100 alunos
        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                // encontrando um curso com mais de 10 alunos
                .findAny()
                // se encontrar imprima
                .ifPresent(c -> System.out.println(c.getNome()));

        System.out.println("---------------------------");

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(
                        c -> c.getNome(),
                        c -> c.getAlunos()))
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));

        }

    }
