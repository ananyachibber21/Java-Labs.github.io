import java.util.*;
class Vehicle
{
	void display()
	{
		System.out.println("This is vehicle");
	}
}

class Car extends Vehicle
{
	void display()
	{
		System.out.println("This is Car");
	}
}

class Bike extends Vehicle
{
	void display()
	{
		System.out.println("This is Bike");
	}
}

class Vehicles
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the no on tyres: ");
		int N = console.nextInt();

		switch(N){
			case 2:
			    Bike b = new Bike();
			    b.display();
			    break;

			case 4:
			    Car c = new Car();
			    c.display();
			    break;

			default:
			    Vehicle v = new Vehicle();
                v.display();
                break;
		}
	}
}
