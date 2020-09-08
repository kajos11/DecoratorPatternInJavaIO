package extend;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestLowerClassInputStream {
	
	public static void main(String[] args) throws IOException {
		
		InputStream is = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
		
		int c;
		while((c = is.read()) > 0) {
			System.out.print((char)c);
		}
		
		is.close();
		
	}

}
