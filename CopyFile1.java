import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1 {

	public static void main(String[] args) {
		FileInputStream in = null; // 파일 내용을 바이트 단위로 읽어오는 객체
		FileOutputStream out = null; // 파일 내용을 바이트 단위로 출력
		
		try {
			in = new FileInputStream("input.txt"); // 생성자에 읽고자 하는 파일 ... 예외처리 꼭해야함. 
			out = new FileOutputStream("output.txt");  // 해당 파일이 없으면 해당 파일을 만듦.
			int c; 
			
			while((c = in.read()) != -1) { //in.read() 하나의 바이트를 들고와 숫자로 읽음. read는 int형으로 읽어옴 . c에다 대입 연산  -1이 EOF
				out.write(c); // 그대로 복사하여 적음.
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(in != null) {
				try {
					in.close();            
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(out != null) {
				try {
					out.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
