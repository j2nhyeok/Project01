import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main6 {

	public static void main(String[] args) {
		int sumAge = 0;
		List<Integer> age = new ArrayList<>();
		StringTokenizer st;
		//파일 생성 (직접 손으로)
		//persons.txt
		//파일 정보를 한 줄씩 읽어서
		//1. 콘솔 출력
		
		File file = new File("d:\\filetest\\persons.txt");
		BufferedReader bf = null;
		
		try {
			bf = new BufferedReader(new FileReader(file));
			String line;
			
			while((line = bf.readLine()) != null) {
				System.out.println(line);
				st = new StringTokenizer(line, ",");
				st.nextToken();  
				age.add(Integer.parseInt(st.nextToken()));
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bf != null) {
				try {
					bf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		for(int i = 0; i < age.size(); i++) {
			sumAge += age.get(i);
		}
		System.out.println(sumAge / age.size() + "살");
		
		
		
		//2. 사람 평균 나이 구해서 출력

	}

}
