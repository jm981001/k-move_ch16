package sec11;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
 public class ToListTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Sex.MALE),
				new Student("김수애", 6, Student.Sex.FEMALE),
				new Student("신용권", 10, Student.Sex.MALE),
				new Student("박수미", 6, Student.Sex.FEMALE)
		);
		
		//남학생들만 List 생성
		List<Student> maleList = totalList.stream()
				.filter(s->s.getsex()==Student.Sex.MALE)
				.collect(Collectors.toList());
		maleList.stream()
			.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		//여학생들 HashSet 생성
		Set<Student> femaleSet = totalList.stream()
				.filter(s -> s.getsex() == Student.Sex.FEMALE)
				//.collect(Collectors.toCollection(HashSet :: new));
				//.collect( Collectors.toCollection(()->{return new HashSet<Student>();}) );
				.collect( Collectors.toCollection(()->new HashSet<Student>()) );
		femaleSet.stream()
			.forEach(s -> System.out.println(s.getName()));
	}
}
