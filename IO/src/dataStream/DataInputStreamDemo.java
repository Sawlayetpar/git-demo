package dataStream;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamDemo {

	public static void main(String[] args) {
		try (DataInputStream dis = new DataInputStream(new FileInputStream("items.dat"))){
			
			int i=0;
			while(i>=0) {
				System.out.printf("[Name %s,Count %d,Price %f]%n"
						,dis.readUTF(),dis.readInt(),dis.readDouble());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
//e(fx)eclipse