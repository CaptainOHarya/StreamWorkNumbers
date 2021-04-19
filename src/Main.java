import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
		// ArrayList для хранения отсортированной коллекции
		List<Integer> result = new ArrayList<>();
		// Формирование отсортированной коллекции
		for (Integer x : intList) {
			
			if (x > 0 && x % 2 == 0)
				result.add(x);
			//Используем метод Collections.sort()
			Collections.sort(intList);
		}
		// Вывод новой коллекции
		for (Integer r : result) {
			System.out.print(r + " ");
		}

	}

}
