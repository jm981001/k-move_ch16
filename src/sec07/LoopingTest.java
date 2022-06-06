package sec07;

import java.util.Arrays;

public class LoopingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = {1, 2, 3, 4, 5};
		
		System.out.println("[peek()를 마지막에 호출한 경우]");
		Arrays.stream(intArr)//오리지날 스트림
			.filter(a -> a%2==0)//짝수만 가지는 새로운 스트림 생성
			.peek(n-> System.out.println(n));//동작 안함//중간처리 메서드이기 때문
		
		System.out.println("[최종 처리 메소드를 마지막에 호출한 경우]");
		int total = Arrays.stream(intArr)//오리지날 스트림
			.filter(a -> a%2==0)//짝수만 가지는 새로운 스트림 생성
			.peek(n -> System.out.println(n))   //동작함//중간처리 메서드
			.sum();//최종처리메서드
		System.out.println("총합: " + total);
		
		
		System.out.println("[forEach()를 마지막에 호출한 경우]");
		Arrays.stream(intArr)
			.filter(a -> a%2==0)
			.forEach(n -> System.out.println(n)); //동작함//최종 처리 메서드
		
	}

}
