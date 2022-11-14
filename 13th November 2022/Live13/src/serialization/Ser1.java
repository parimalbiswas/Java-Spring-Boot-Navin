package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable
{
	int i = 10;
	int j = 20;

	public Dog()
	{
		System.out.println("Constreactoir called........");
	}
}

class Cat implements Serializable
{
	int i = 30;
	int j = 40;

	public Cat()
	{
		System.out.println("Constreactoir called........");
	}
}

public class Ser1
{

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Dog dog = new Dog();
		Cat cat = new Cat();

		System.out.println("Serialization Started");
		FileOutputStream fos1 = new FileOutputStream("F:\\cuma.ser");
		ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
		oos1.writeObject(dog);
		oos1.writeObject(cat);
		System.out.println("Serialization Ende");

		System.out.println("DSerialization Started");
		FileInputStream fos2 = new FileInputStream("F:\\cuma.ser");
		ObjectInputStream oos2 = new ObjectInputStream(fos2);
		Dog d1 = (Dog) oos2.readObject();
		Cat c1 = (Cat) oos2.readObject();
		System.out.println("DeSerialization Ende");

		System.out.println(d1.i + "===" + d1.j);
		System.out.println(c1.i + "===" + c1.j);

	}

}
