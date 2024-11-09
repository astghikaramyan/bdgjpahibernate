import javax.jnlp.IntegrationService;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.*;

/**
 * Created by User on 26.08.2020.
 */
public class Test {
    public static void main(String[] args) {
//        Stream<String> s = Stream.generate(()->"gshufhy");
//        Stream<String> s1 = Stream.generate(()->"gshfhy");
//        Predicate<String> p1 = (e)->e.startsWith("g");
//        System.out.println(s.anyMatch(p1));
 //       System.out.println(s1.allMatch(p1));

//        Predicate<String> p2 = (e)->e.length()> 3;
//        Stream<String> stringStream = Stream.iterate("-", (s11)->s11 + s11);
//        System.out.println(stringStream.noneMatch(p2));
       // stringStream.anyMatch(p2);
//
//        Stream<String> s = Stream.generate(()->"ad");
////        System.out.println(s.anyMatch(String::isEmpty));
//        IntStream i = IntStream.empty();
//        LongStream longstream = LongStream.of(2, 5, 3);
//        OptionalLong optionalDouble = longstream.map(e->e*10).filter(n-> n < 5).findFirst();
//        if(optionalDouble.isPresent()){
//            System.out.println(optionalDouble.getAsLong());
//        }
//        optionalDouble.ifPresent(System.out::print);


        Stream.generate(() -> "1")
                .peek(System.out::println)
                .filter(s1->s1.length()>1)
                .limit(10)
                .forEach(System.out::println);

        List<Integer> l = Arrays.asList(1, 2, 3);
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(1, 2, 3);

        IntStream i = IntStream.of(1);

//        Stream<Integer> i1 = Stream.of(1);
//        IntStream intStream = i1.mapToInt(x->x);
//        DoubleStream doubleStream = i1.mapToDouble(s->s);
//        Stream<Integer> stream = doubleStream.mapToObj(s111->s111+1);
//        stream.forEach(System.out::println);

        DoubleStream d = DoubleStream.of(1.2, 2.4);
        Long l5 = d.peek(System.out::println).filter(x->x>2).count();

        List<Integer> list = IntStream.range(1, 6).mapToObj(e->e).collect(Collectors.toList());
        list.forEach(System.out::println);

        IntStream.range(1,6).forEach(System.out::println);
    }
}
