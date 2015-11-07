import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class getMimeType {
	static String baseDirectory = System.getProperty("user.dir");

	public static void main(String[] args) {
		Path path;
		try {

			path = Paths
					.get(baseDirectory + "\\resources\\Sample_Webpage.html");
			System.out.println(path + " : " + Files.probeContentType(path));

		} catch (Exception x) {
		}
	}
}