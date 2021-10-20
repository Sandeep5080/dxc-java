package inheritance;

public class Student {
	
		void read(){System.out.println("reading...");}  
		}  
		class Dog extends Student{  
		void bark(){System.out.println("barking...");}  
		}  
		class TestInheritance{  
		public static void main(String args[]){  
		Dog d=new Dog();  
		d.bark();  
		d.read();  
		}}  


