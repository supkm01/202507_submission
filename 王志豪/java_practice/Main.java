package java_practice;

public class Main {

	public static void main(String[] args) {

        Student student = new Student("Taro", 20, "20230001");
        student.introduce();
        student.run();
        
        Car car = new Car("Toyota");
        car.run();
        System.out.println("The car brand is: " + car.getBrand());

	}

}
