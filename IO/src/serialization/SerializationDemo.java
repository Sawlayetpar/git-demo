package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.obj"))){
//			oos.writeObject(new Student("Tun Tun", 25,"0978227170","email"));
	//	oos.writeObject(new ClassA());
	//		oos.flush();
			
			Employee emp = new Employee();
			emp.setName("Tun Tun");
			emp.setAge(55);
			emp.setEmail("email");
			emp.setAddress("YGN");
			
			oos.writeObject(emp);
			oos.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("serialization finished!");
		}
	}
}
