package pattern.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 
 * io源码查看
 * 
 * @author Lin.Pc
 *
 */
public class IoCodeTester {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("c://user.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		byte[] buf = new byte[]{};
		bis.read(buf);
		
//		fis.close();
		bis.close();
	}
}
