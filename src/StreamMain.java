import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
		Stream<Integer> stream = intList.stream();
		stream.filter(x -> x > 0 && x % 2 == 0)
		        .sorted(Comparator.naturalOrder())
				.forEach(x -> System.out.format("% d", x));
		// можно использовать и следующее выражение forEach(System.out::print);, но не
		// знаю как сделать чтобы был пробел
		stream.close();

	}

}
