import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main3 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			File file = new File("d:\\filetest\\practice.txt");
			int length = (int)file.length(); // 파일 객체의 길이를 long값으로 알려줌
			byte[] buf = new byte[length]; //N개의 바이트 단위 배열을 만듦. buf에 집어넣을 거임.
			
			
			fis = new FileInputStream(file);// 파일 읽어오기
			
			fis.read(buf);
			String result = new String(buf);
			
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		

	}

}
