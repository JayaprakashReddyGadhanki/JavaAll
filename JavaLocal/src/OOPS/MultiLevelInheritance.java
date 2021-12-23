package Inheritance;
class A {

	int a = 40;

	void show() {
		System.out.println("In Class A");
	}

}

class B extends A {
	int b = 20;

	void display() {
		System.out.println("In Class B");
	}
}

class MultiLevelInheritance extends B {

	public static void main(String[] Args) {
		B obj = new B();
		System.out.println(obj.a);
		obj.show();

		System.out.println(obj.b);
		obj.display();

	}

}