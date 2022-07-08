import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main5 {

	public static void main(String[] args) {
		File file = new File("d:\\filetest\\lineio.txt");

		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader(file));
			String line;
			while((line = bf.readLine()) != null) { //BufferedReader은 맨 끝을 만나면 -1 이 아닌 null...
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bf != null) {
				try {
					bf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
