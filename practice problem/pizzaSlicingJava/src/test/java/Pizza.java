import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Pizza {
	public static void main(String[] args)
			throws IOException, URISyntaxException {

		Path path = Paths.get(ClassLoader.getSystemResource("example.in")
				.toURI());
		try (Stream<String> lines = Files.lines(path)) {
//			lines.forEach(s -> System.out.println(s));
			Object[] objects = lines.toArray();
			System.out.println(objects[0]);
		} catch (IOException ex) {
			throw ex;
		}
	}
}
