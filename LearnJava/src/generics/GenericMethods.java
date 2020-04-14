package generics;


public class GenericMethods {
	public static void main(String[] args) {
		
		Water water  = new Water();
		water.setElement("mostly water");
		Juice juice  = new Juice();
		juice.setElement("mostly juice");
		Sample sample = new Sample();
		sample.<Water,Juice>mix(water, juice); //Generic method is called
		
		
	}

}

class Sample{
	
	private String firstName;
	private String lastName;
	//Declare generic method
	<T,W>void mix(T item1, W item2){
		System.out.println("Mix is called"+item1.toString()+' '+item2.toString());
		
	}
}

class Water{
	private String element;

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}
	
	
	
}
class Juice{
	private String element;

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}
	
	
}
