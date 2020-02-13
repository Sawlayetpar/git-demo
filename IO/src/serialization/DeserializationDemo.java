package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.obj"))){
//			Student s = (Student)ois.readObject();
//			System.out.println(s);
//			ClassA a = (ClassA)ois.readObject();
//			System.out.println("count is :" + a.b.c.count);
			
			Employee emp = (Employee)ois.readObject();
			System.out.println(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
