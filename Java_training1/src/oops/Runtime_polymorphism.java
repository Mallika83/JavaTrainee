package oops;
class Animal
{
	void eat()
	{
		System.out.println("Animal eats");
	}
}
class Dog extends Animal
{
	void eat() {
		System.out.println("Dog eats bones");
	}
}
class Cat extends Animal
{
	void eat() {
		System.out.println("Cat drinks milk ");
	}
}
public class Runtime_polymorphism {

	public static void main(String[] args) {
		Animal A=new Animal();
		Animal D=new Dog();
		Animal C=new Cat();
		A.eat();
		D.eat();
C.eat();
	}

}
