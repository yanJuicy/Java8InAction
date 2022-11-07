package chap03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {

		List<Apple> inventory = new ArrayList<>();
		inventory.addAll(Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red")));

		inventory.sort(new AppleComparator());
		System.out.println(inventory);

		inventory.sort(new Comparator<Apple>() {
			@Override
			public int compare(Apple o1, Apple o2) {
				return o1.getWeight().compareTo(o2.getWeight());
			}
		});
		System.out.println(inventory);

		inventory.set(1, new Apple(20, "red"));

		inventory.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));
		System.out.println(inventory);

		inventory.set(1, new Apple(10, "red"));

		inventory.sort(Comparator.comparing(Apple::getWeight));
		System.out.println(inventory);
	}

}
