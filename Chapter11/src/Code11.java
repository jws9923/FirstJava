import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Code11 {
	public static void main(String[] args) {

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("c:/FirstJava/myData1.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String inStr = null;
		
		try {
			inStr = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(inStr);

		try {
			inStr = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(inStr);
		
		try {
			inStr = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(inStr);

		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}