package sec02;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryTest { 
	public static void main(String[] args) throws IOException {
		
		//디렉토리로부터 스트림 얻기
		Path path = Paths.get("C:/K-MOVE IT/ch16/src/sec02 8588");
		Stream<Path> stream = Files.list(path);
		stream.forEach( p -> System.out.println(p.getFileName()) );
	}
}
