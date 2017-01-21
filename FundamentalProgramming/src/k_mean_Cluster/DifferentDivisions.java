package k_mean_Cluster;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	private String studentName ;
	private float marks ; 
	private String classCategory ;
	Student(String studentName , float marks ){
		this.marks = marks;
		this.studentName = studentName ;
		String category = "";
		//determining  the class category based on the marks of the student 
		if(marks >= 65){
			category = "distinction";
		}else if(marks < 65 && marks >= 60){
			category = "first";
		}else{
			category = "pass";
		}
		//setting the category of the student 
		this.classCategory = category;
	}
	
	@Override
	public String toString() {
		return studentName;
	}
	public String getStudentName() {
		return studentName;
	}
	public float getMarks() {
		return marks;
	}
	public String getClassCategory() {
		return classCategory;
	}
	
}
public class DifferentDivisions {

	public static void main(String[] args) throws NumberFormatException{
		ArrayList<Student> distinctionCluster = new ArrayList<>();
		ArrayList<Student> firstClassCluster = new ArrayList<>();
		ArrayList<Student> passCluster = new ArrayList<>();
		boolean wantToInput = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please in put Student Name and marks , seperated by COMMA ");
		while(wantToInput){
			//String input = sc.nextLine();
			System.out.println("Please Input the NAME of student : ");
			String value =sc.next();
			System.out.println("Please Input the MARKS of student : ");
			float value1 =sc.nextFloat();
			//creating the student object 
			Student s = new Student(value, value1);
			//adding the student to particular cluster 
			switch(s.getClassCategory()){
			case "distinction":
				distinctionCluster.add(s);
				break;
			case "first":
				firstClassCluster.add(s);
				break ;
			default:
				passCluster.add(s);
				break ;
			}
			System.out.println("Do you want to enter more student details ? ");
			System.out.println("If yes then type Y else , type any thing AND  then I will display the clusters!");
			char ch = sc.next().toUpperCase().charAt(0);
			wantToInput = (ch == 'Y') ? true : false ; 
		}
		System.out.println("The Distinction Category Students are :"+distinctionCluster);
		System.out.println("The First Class Category Students are :"+firstClassCluster);
		System.out.println("The Pass Class  Category Students are :"+passCluster);
	}

}
