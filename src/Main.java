import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<MyNumber> num=new ArrayList<>();
        num.add(new MyNumber(5,5,4,6));
       int calc = (int) num.stream().flatMapToInt(MyNumber-> IntStream.of(MyNumber.getValue()))
               .filter(n->n%2==0)
               .average()
               .orElse(0);

        System.out.println("Среднее значение четных чисел: " + calc);


    }
}