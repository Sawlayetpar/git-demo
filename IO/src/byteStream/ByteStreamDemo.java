package byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("MyReport.txt") ;
				FileOutputStream fos = new FileOutputStream("output.txt");
						FileOutputStream bfos = new FileOutputStream("BufferOut.txt")){
			
					int value;
					while((value = fis.read()) != -1) {
						fos.write(value);
					}
			{
				
				}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
		
	}
}
