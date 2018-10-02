package ch05;

import java.util.ArrayList;

public class _01_AnimalMainEx {
	public static void main(String[] args) {
		
		/*
		 * _01_Animal animal_dog = new _01_Dog("뚱실이");
		 * _01_Animal animal_cat = new _01_Cat("네코");
		 * 
		 * _01_Dog dog = (_01_Dog)animal_dog;	// _01_Dog 타입의 그릇 생성
		 * _01_Cat cat = (_01_Cat)animal_cat;
		 */
		
		_01_Cat cat = new _01_Cat("네코");
		_01_Dog dog = new _01_Dog("뚱실이");
		
/*		_01_Animal animal = cat;
		animal.eat();
		
		animal = dog;
		animal.eat();*/
		
		ArrayList<_01_Animal> list = new ArrayList<_01_Animal>();
		
		list.add(dog);
		list.add(cat);
		
		
		for(_01_Animal animal : list) {
			animal.eat();
			animal.sleep();
			animal.play();
		}
		
		cat.cry();
		cat.punch();
		
		dog.bark();
		dog.bite();
	}
}
