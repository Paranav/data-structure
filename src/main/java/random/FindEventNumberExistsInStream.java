package random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEventNumberExistsInStream {

	public static void main(String[] args) {

		int[] arr = new int[] { 7, 9, 10, 4, 5, 7, 8, 1, 2, 11, 13 };

		List<Integer> evenIntegerList = Arrays.stream(arr).boxed().filter(i -> i % 2 == 0).collect(Collectors.toList());

		evenIntegerList.forEach(System.out::print);

		HashSet<Integer> set = new HashSet();

		System.out.println("\nNew problem");

		List<Integer> distinctList = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());

		distinctList.forEach(System.out::println);

		System.out.println("\nNew problem");
		Arrays.stream(arr).boxed().filter(i -> !set.add(i)).findFirst().ifPresent(System.out::println);

		System.out.println("\nNew problem");
		System.out.println(Arrays.stream(arr).boxed().count());

		System.out.println("\nNew problem");
		Arrays.stream(arr).boxed().max(Integer::compare).ifPresent(System.out::print);

		System.out.println("\nNew problem");
		String input = "Java articles are Awesome";
		input.chars().mapToObj(c -> Character.toLowerCase(Character.valueOf((char) c)))
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(c -> c.getValue() > 1L).map(e -> e.getKey()).findFirst().ifPresent(System.out::println);

		System.out.println("\nNew problem");
		Arrays.stream(arr).boxed().sorted().forEach(System.out::print);

		System.out.println("\nNew problem");
		Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).forEach(System.out::print);

		System.out.println("\nNew problem");
		Arrays.parallelSort(arr);
		Arrays.stream(arr).boxed().forEach(System.out::print);

		System.out.println("\nNew problem");
		List<Notes> noteLst = new ArrayList<>();
		noteLst.add(new Notes(1, "note1", 11));
		noteLst.add(new Notes(2, "note2", 22));
		noteLst.add(new Notes(3, "note3", 33));
		noteLst.add(new Notes(4, "note4", 44));
		noteLst.add(new Notes(5, "note5", 55));
		noteLst.add(new Notes(6, "note4", 66));

		Map<String, List<Integer>> map = noteLst.stream()
				.sorted(Comparator.comparingInt(note -> ((Notes) note).getId()).reversed())
				.collect(Collectors.toMap(note -> note.getTagName(), note -> {
					List<Integer> list = new ArrayList<>();
					list.add(note.getId());
					return list;
				}, (oldValue, newValue) -> {
					oldValue.addAll(newValue);
					return oldValue;
				}, LinkedHashMap::new));

		System.out.println(map);

	}

	static class Notes {

		private int id;
		private String tagName;
		private int number;

		public Notes(int id, String tagName, int number) {
			this.id = id;
			this.number = number;
			this.tagName = tagName;
		}

		public int getId() {
			return this.id;
		}

		public String getTagName() {
			return this.tagName;
		}
	}

}
