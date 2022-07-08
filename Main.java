import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File diaryFile = new File("d:\\filetest\\diary.txt"); // diary.txt를 가리키는 객체 생성
//		System.out.println(diaryFile.exists());      // diary.txt를 잘 가져왔나

		Scanner sc = null;
		try {
			sc = new Scanner(diaryFile); // 파일을 읽을거다.

			while (sc.hasNext()) { //다음줄있으면 가져와라.
				System.out.println(sc.nextLine()); // 한 줄만 뽑아옴.
			}
		} catch (FileNotFoundException e) { // 파일을 찾지못했을 때
			System.out.println("파일을 못찾았다.");
		} finally {
			if (sc != null) {
				sc.close(); // 빨대 제거. 통로를 닫아준다. 무조건 해줘야함

			}
		}
	}
}
