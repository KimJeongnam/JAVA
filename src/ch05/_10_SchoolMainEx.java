package ch05;

import java.util.ArrayList;

public class _10_SchoolMainEx {
	public static void main(String[] args) {
		ArrayList<_10_School> schools = _10_School.getSchools();
		
		schools.add( new _10_MidSchool("팔마중학교", 
				"31", "김정남", 2, 100));
		
		schools.add( new _10_College("서원대학교", 
				"201010385", "김정남", 2, 4.0));
		
		for(_10_School school : schools) {
			System.out.println(school);
		}
		
		_10_getHandler handler;
		for(_10_School school : schools) {
			handler = (_10_getHandler)school;
			_10_School.print_ScoreOrGpa(handler);
		}
		
	}
}
