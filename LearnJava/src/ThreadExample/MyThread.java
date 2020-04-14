package ThreadExample;

public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo threadDemo = new ThreadDemo();
		System.out.println(Thread.currentThread().getPriority());
		threadDemo.setPriority(3);
		threadDemo.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main thread");
		}
		System.out.println(threadDemo.getPriority());
	
	}
}
class ThreadDemo extends Thread{
	public void run(){
		for(int i=0;i<5;i++) {
			System.out.println("child thread");
		}
		
	}
}
