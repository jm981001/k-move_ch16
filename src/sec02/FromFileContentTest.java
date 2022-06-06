package sec02;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentTest {
	
	//파일로부터 스트림 얻기
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/sec02/linedata.txt");
		Stream<String> stream;
		
	//Files.lines() 메소드 이용
	stream = Files.lines(path, Charset.defaultCharset());
	stream.forEach( System.out :: println );//람다식 메소드참조 형태로 변경
	//stream.forEach(s-> System.out.println(s));   위에꺼랑 같은거
	stream.close();
	System.out.println();
	}
}