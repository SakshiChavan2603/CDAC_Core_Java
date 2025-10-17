import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TestNIOClasses {

	public static void main(String[] args) {
		try {
			Path p = Paths.get("emp.csv");
			List<String> list1 = Files.readAllLines(p);
			
			for(String s : list1) {
				String[] arr = s.split(",");
				System.out.println(arr[0] + " " + arr[1] + " "+ arr[2]);
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
