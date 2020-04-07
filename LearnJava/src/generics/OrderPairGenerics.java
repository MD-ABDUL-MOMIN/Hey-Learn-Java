package generics;

interface Pair<K,V>{
	public K getKey();
	public V getValue();
}

public class OrderPairGenerics<K,V> implements Pair<K,V>{
	
	private K key;
	private V value;

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	public OrderPairGenerics(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
@Override
	public String toString() {
		return "OrderPairGenerics [key=" + key + ", value=" + value + "]";
	}

	//Main function 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OrderPairGenerics<String, Integer> obj = new OrderPairGenerics<>("Momin", 3455);
		Person person = new Person();
		person.setName("robi");
		person.setAddress("dhaka");
		DemoGenerics<Person> demoGenerics = new DemoGenerics<Person>();
		demoGenerics.set(person);
		// pass Demo generics class as value 
		OrderPairGenerics<String, DemoGenerics<Person>> obj2  = new OrderPairGenerics<String, DemoGenerics<Person>>("name2", demoGenerics);
		
		System.out.println(obj);
		
		System.out.println(obj2);

	}


}
