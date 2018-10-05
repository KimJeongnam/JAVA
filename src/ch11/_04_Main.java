package ch11;

import java.util.ArrayList;

public class _04_Main {
	public static void main(String[] args) {
		_04_Enum cat = new _04_Enum(Animal.CAT, "고양이");
		_04_Enum dog = new _04_Enum(Animal.DOG, "개");
		_04_Enum egle = new _04_Enum(Animal.EGLE, "독수리");
		
		ArrayList<_04_Enum> list = new ArrayList<_04_Enum>();
		list.add(cat);
		list.add(dog);
		list.add(egle);
		
		for(_04_Enum data : list) {
			System.out.println(data.getKind()+data.getName());
		}
	}
}
