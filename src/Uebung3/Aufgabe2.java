package Uebung3;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Aufgabe2 {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C://Users//Janok//Desktop//Test.txt");
		String content = "This is a sample Text";

		Files.write(path, content.getBytes());

		List<String> list = Files.readAllLines(path);
		list.forEach(line -> System.out.println(line));

	}

}
