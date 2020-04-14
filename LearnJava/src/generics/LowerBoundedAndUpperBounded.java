package generics;

public class LowerBoundedAndUpperBounded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ///Lower bounded checking		
		ChildFactory<ChildTwo> subTypingCheck = new ChildFactory<ChildTwo>();// Right
		subTypingCheck.show();
		//ChildFactory<SubTypeOfChild> subTypingCheck = new ChildFactory<SubTypeOfChild>(); //Right
		//ChildFactory<ParentClass> subTypingCheck = new ChildFactory<ParentClass>(); // RIght
		//ChildFactory<Demo> subTypingCheck = new ChildFactory<Demo>(); // False
		ChildFactorytwo test = new ChildFactorytwo();
		//Super class testing
		ParentClass parentClass = new ParentClass();
		ChildTwo childTwo = new ChildTwo();
		test.remove(new ChildFactory<ChildTwo>());// Right
		//test.remove(new ChildFactory<SubTypeOfChild>());//not current
		test.remove(new ChildFactory<ParentClass>());// Right
		//test.remove(new ChildFactory<Demo>());// False
	
				
		

	}

}
class Demo{
	
}
class ParentClass extends Demo{
	
}

class ChildFactory<T extends ParentClass>{
	
	void show() {
		System.out.println("SubType checking");
	}
	
	
}


class ChildTwo extends ParentClass{
	
}
class SubTypeOfChild extends ChildTwo{
	
}
class ChildFactorytwo{
	 void remove(ChildFactory<? super ChildTwo> childFactory) {
		 System.out.println("super bounded");
	 }
}

