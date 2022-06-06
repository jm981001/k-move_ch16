package sec09;

import java.util.List;
import java.util.ArrayList;
import java.util.OptionalDouble;
public class OptionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list = new ArrayList<>();
		
		/*//예외 발생(java.util.NoSuchElementException)
		double avg = list.stream()
				.mapToInt(integer :: intValue)
				.average()
				.getAsDouble();
		*/
		//방법1
		OptionalDouble optional = list.stream()
			.mapToInt(Integer :: intValue)
			.average();	
		if(optional.isPresent()) {
			System.out.println("방법1_평균: " + optional.getAsDouble());
		} else {
			System.out.println("방법1_평균: 0.0");
		}
		
		//방법2
		double avg = list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			.orElse(0.0);
		System.out.println("방법2_평균: " + avg);
		
		//방법3
		list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			.ifPresent(a -> System.out.println("방법3_평균: " + a));
	}
}

	