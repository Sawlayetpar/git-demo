package byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("MyReport.txt");
					FileOutputStream bfos = new FileOutputStream("BufferOut")) {
			
			long sTime = System.currentTimeMillis();
			int data;
			byte[] bytes= new byte[20];
			while ((data = fis.read(bytes)) != -1) {
				System.out.println(bytes);
				bfos.write(bytes);
				bfos.flush();
			}
			
			long eTime = System.currentTimeMillis();
			System.out.println("eTime :" + eTime);
			System.out.println("Total time :" + (eTime - sTime));
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
