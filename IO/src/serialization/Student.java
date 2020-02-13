package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = 255388314901222018L;
	private String name;
	private int age;
	private transient String phone = "00000";
	private static String email;
	
	public Student(String name,int age,String phone,String email) {
		this.name = name;
		this.age =age;
		this.phone = phone;
		Student.email = email;
	}
	
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
		System.out.println("Call ReadObj");
		ois.defaultReadObject();
		phone = ois.readUTF();
		email = ois.readUTF();
	}
	
	private void writeObject(ObjectOutputStream oos) throws IOException {
		System.out.println("call writeObj");
		oos.defaultWriteObject();
		oos.writeUTF(phone);
		oos.writeUTF(email);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", phone=" + phone + " ,email= "+email +"]";
	}

	
	
	
}
