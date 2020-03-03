package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class MyStudentRecordsMgmtApp {

	public static void main(String[] args) { 
		Student[] std= {
				new Student(110001,"Dave",LocalDate.of(1951, Month.JULY, 18)),
				new Student(110002,"Anna",LocalDate.of( 1990, Month.DECEMBER,07)),
				new Student(110003,"Erica",LocalDate.of(1974 ,Month.JANUARY, 31 )),
				new Student(110004,"Carlos",LocalDate.of(2009 , Month.AUGUST, 22)),
				new Student(110005,"Bob",LocalDate.of(1990 , Month.MARCH,05 ))

		};
		
		System.out.println("========All students========");
		printListOfStudents(std);
		
		System.out.println("========PlatinumAlumni students========");
		List<Student> ps=getListOfPlatinumAlumniStudents(std);
		int i=1;
		for(Student s:ps) {
			System.out.println("s"+i+" : "+s.toString());
			i++;
		}
		System.out.println("========Input array={5,12,21,35}========");
		int[] num= {5,12,21,35};
		printHelloWorld(num);
		
		System.out.println("The second largest integer is :"+findSecondBiggest(num));
		
	}
	
	
	
	
	public static void printListOfStudents(Student[] students){
		for(int i=0;i<students.length;i++) {
			System.out.println("s"+(i+1)+" : "+students[i]);
			
		}
		
	}
	public static List<Student> getListOfPlatinumAlumniStudents(Student[] students) {
		List<Student> platinumStudents=new ArrayList<>();
		for(int i=0;i<students.length;i++) {
			if(students[i].getDateOfAdmission().
					isBefore(LocalDate.of(1990 ,Month.JANUARY, 01 ))){
				platinumStudents.add(students[i]);
			}
			
		}
		return platinumStudents;
		
	}
	public static void printHelloWorld(int[] num){
		for(int i=0;i<num.length;i++) {
			if(num[i]%5==0&&num[i]%7==0) {
				System.out.println("Hello World");
				
			}
			else if(num[i]%5==0) {
				System.out.println("Hello");
				
			}
			else if(num[i]%7==0) {
				System.out.println("World");
				
			}
		}
	}
	public static int findSecondBiggest(int[] num) {
		int largest = num[0];
		int secondLargest = num[0];
		for (int i = 0; i < num.length; i++) {
 
			if (num[i] > largest) {
				secondLargest = largest;
				largest = num[i];
 
			} else if (num[i] > secondLargest) {
				secondLargest = num[i];
 
			}
		}
		
		return secondLargest;
	}
	
}
