package serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable{

	private static final long serialVersionUID = 1L;
	private long id ;
	private String name;
	private int age;
	private transient String email = "jbnfgn";
	private String address;
	
	public Employee() {
		System.out.println("Call Default Constructor");
	}
	public Employee(long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Employee(long id) {
		this.id = id;
	}
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("Call wirteExternal");
		out.writeLong(id);
		out.writeUTF(name);
		out.writeInt(age);
//		out.writeUTF(email);
	}


	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("Call readExternal");
		id = in.readLong();
		name = in.readUTF();
		age = in.readInt();
//		email = in.readUTF();
		
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", address=" + address
				+ "]";
	}
	
}
