package sec01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list = Arrays.asList(
				"홍길동","신용권","감자바",
				"람다식","박병렬");
		//순차처리
		Stream<String>stream = list.stream();
		stream.forEach(ParallelTest :: print );
		System.out.println();
		
		//병렬처리
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelTest :: print);
	}
	
	public static void print(String str) {
		System.out.println(str+ " : " + Thread.currentThread().getName());
	}	
}
