package dataStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataStreamDemo {

	public static void main(String[] args) {
		String [] itemName = {"apple", "orange" , "mango"};
		int [] count = {5,4,6};
		double[] price = {500,800,1800};
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("items.dat"))) {
			
			for (int i=0;0>itemName.length;i++) {
				dos.writeUTF(itemName[i]);
				dos.writeInt(count[i]);
				dos.writeDouble(count[i]*price[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
