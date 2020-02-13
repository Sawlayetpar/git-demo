package serialization;

import java.io.Serializable;

public class ClassA implements Serializable{
	ClassB b = new ClassB();
	private static final long serialVersionUID = 1L;
		
}
class ClassB implements Serializable{
	ClassC c = new ClassC();
	private static final long serialVersionUID = 1L;
}
class ClassC implements Serializable{
	private static final long serialVersionUID = 1L;
	int  count = 20;
}