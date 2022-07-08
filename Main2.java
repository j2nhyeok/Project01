import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {
		FileOutputStream fos = null; // null로 초기화 해줘야ㅐ함
		String line = "Hello";
		try {
			fos = new FileOutputStream(new File("d:\\filetest\\practice.txt")); // 없으면 만듦.
			fos.write(line.getBytes()); // 문자열을 바이트 형식으로 변환 -> 배열을 형태
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fos != null) { //fos가 null이 아닐 때 , 위에 문장이 실행 된 것이므로 close  해줘야 함.
				try {

					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
