package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Teacher vino = new Teacher(1,"vino",5000);
		Teacher mello = new Teacher(2,"mello",7000);
		Teacher mark = new Teacher(3,"mark",6000);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(vino);
		teacherList.add(mello);
		teacherList.add(mark);
		
		Student tharaa = new Student(1,"tharaa",4);
		Student thiravi = new Student(2,"thiravi",7);
		Student maaran = new Student(3,"maaran",8);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(tharaa);
		studentList.add(thiravi);
		studentList.add(maaran);
		
		School gps = new School(teacherList,studentList);
		
		Teacher megan = new Teacher(6,"megan",9000);
		
		gps.addTeachers(megan);
		
		
		tharaa.payFees(5000);
		thiravi.payFees(4500);
		maaran.payFees(6000);
		System.out.println("GPS has earned RS" + gps.getTotalMoneyEarned());
		
		System.out.println("..........Making SCHOOL PAY SALARY...........");
		vino.receiveSalary(vino.getSalary());
		System.out.println("GPS has spent for salary to " + vino.getName()
		+" and now has RS " + gps.getTotalMoneyEarned());
		
		mello.receiveSalary(mello.getSalary());
		System.out.println("GPS has spent for salary to " + mello.getName()
		+" and now has RS " + gps.getTotalMoneyEarned());
		
		System.out.println(maaran);
		
		mark.receiveSalary(mark.getSalary());
		System.out.println(mark);

	}

}
