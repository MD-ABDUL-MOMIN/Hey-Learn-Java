package generics;

import java.awt.List;
import java.util.ArrayList;

// Declare type T as generic
public class DemoGenerics<T> {
	
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
	@Override
	public String toString() {
		return "DemoGenerics [t=" + t + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.setAddress("Faridpur");
		person.setName("Momin");
		DemoGenerics<Person> obj = new DemoGenerics<Person>();
		obj.set(person);
		System.out.println(obj.get());
		
		DemoGenerics<Integer> obj2 = new DemoGenerics<Integer>();
		Integer number = new Integer("3444");
		obj2.set(number);
		System.out.println(obj2.get());
	

	}

}
class Person{
	private String name;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
}
class Child{
	void display() {
		System.out.println("Its child class");
	}
}
