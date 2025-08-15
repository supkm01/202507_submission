package java_practice;

public class Person {
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
	public void introduce() {
        System.out.println("My name is " + name + ". I am " + age + " years old.");
    }
}
