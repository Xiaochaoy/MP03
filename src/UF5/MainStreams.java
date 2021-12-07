package UF5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MainStreams {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("José Maria","Oriol","Xiao","Rubén","Adrià","Juan Carlos","Carlos");

        String llistaN[] = new String[]{"José Maria","Oriol","Xiao","Rubén","Adrià","Juan Carlos","Carlos"};
        Stream<String> stream1 = Arrays.stream(llistaN);

        List<String> llista = Arrays.asList(llistaN);
        Stream<String> stream2 = llista.stream();

        stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 4;
            }
        }).map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("----------------------------------------");
        stream1.filter(s -> s.length() > 4)
                .map(String::toUpperCase)
                .sorted((o1,o2) -> Integer.compare(o1.length(),o2.length()))
                .count();
    }
}
