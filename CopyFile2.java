import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile2 {

	public static void main(String[] args) {
		FileReader inputStream = null; // 파일에 있는 내용을 읽어올 수 있는 객체. Reader가 있으면 문자단위로 읽어옴*(한 글자씩 읽어옴)
		FileWriter outputStream = null; // 한 글자씩 출력..
		
		try {
			inputStream = new FileReader("input.txt");
			outputStream = new FileWriter("output.txt");
			
			int c;
			while((c = inputStream.read()) != -1) { //문자 하나를 읽어오는데 int형으로 반환 -> 파일 끝까지 읽어라..
				System.out.println("읽을 문자 확인 : " + (char)c);
				outputStream.write(c);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
