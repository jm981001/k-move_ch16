package sec04;

import java.util.Arrays;
import java.util.List;

public class FilteringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>names=Arrays.asList("홍길동", "신윤권", "감자바","신용권", "신민철");
		
		names.stream()
			.distinct()//중복제거
			.forEach(n-> System.out.println(n));
		System.out.println();
		
		names.stream()
			.filter(n -> n.startsWith("신"))//필터링
			.forEach(n-> System.out.println(n));
		System.out.println();
		
		names.stream()
			.distinct()
			.filter(n -> n.startsWith("신"))
			.forEach(n-> System.out.println(n));
		System.out.println();
	}

}
