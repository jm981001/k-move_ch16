package sec02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import sec01.Student;

public class FromCollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student>studentList =Arrays.asList(
				new Student ("홍길동",10),
				new Student ("신용권",20),
				new Student ("감자바",30)
			);
		
		Stream<Student>stream = studentList.stream();
		stream.forEach(s-> System.out.println(s.getName()));
				
				
				
	}

}
