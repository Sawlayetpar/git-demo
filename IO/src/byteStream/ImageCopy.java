package byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ImageCopy {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("pic.PNG");
				FileOutputStream fos = new FileOutputStream("Photo//copy.PNG")){
			byte[] bytes = new byte[0];
			
			while(fis.read(bytes) != -1)
				fos.write(bytes);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
