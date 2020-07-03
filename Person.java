package HomeWork2;
import java.util.ArrayList;
import java.util.Random; 
import java.util.Scanner;

public class Person {
	
	String name;
	String surname;
	int age;
	int salary;
	static Random rn = new Random();
	static ArrayList<Person> personL = new ArrayList<Person>();
	static Scanner in = new Scanner(System.in);

	public int getAge()
	{
		return age;
	}
	public static void main(String[] args) {
		People p = new People(10);
		System.out.println("Initial array");
		p.print();
		System.out.println("\nSorted Array");
		p.sort("age");
		p.print();
		
		System.out.println("\n");
		personMaker();
		printL();
		
	}

	public Person(){
		
		name = nameGenerator();
		surname = surnameGenerator();
		age = ageGenerator();
		salary=rn.nextInt(1000)+1;
		
	}
	public Person(String name) {
		this.name=name;
		surname="";
		age=0;
		salary=rn.nextInt(1000)+1;
	}	
	
	public Person(String name,String surname) {
		this.name=name;
		this.surname=surname;
		age=0;
		salary=rn.nextInt(1000)+1;
	}
	
	public Person(String name,String surname, int age) {
		this.name=name;
		this.surname=surname;
		this.age=age;
		salary=rn.nextInt(1000)+1;
	}
	
	public Person(String name,String surname, int age,int salary) {
		this.name=name;
		this.surname=surname;
		this.age=age;
		this.salary=salary;
	}
	
	public static void personMaker() {
		
		int rnp = rn.nextInt(9)+1;
		
		for(int i=0; i< rnp ;i++) {
			
			personL.add(new Person());
		}
		
		
	}
	
	public int avgAgeSalary(int x) {
		
		
		
		return 0;
	}
	

	public static String nameGenerator() {
		
		String[] nameArr = new String[]{"Mert","Ekin","Deniz","Can","Esat","Bahadýr","Buse","Neslihan","Mihriye","Erdinç" };
		
		return nameArr[rn.nextInt(10)];
			
		}
	public static String surnameGenerator() {
		
		String[] surnameArr = new String[]{"Çetin","Darendeli","Köktekin","Uður","Kýnay","Erol","Kýlýc","Esen"};
		
		return surnameArr[rn.nextInt(7)];
		}
		
	public static int ageGenerator() {
		
		return rn.nextInt(60)+18;
	}
		
	public static void printL() {
			
		for(int i=0;i<personL.size();i++) {
			System.out.println(personL.get(i).name +" " +personL.get(i).surname+" "+personL.get(i).age +" " +personL.get(i).salary);
		}
	}
	
	
	
	public double calcAvgAge(int limit) {
		
		int avgAge=0;
		int flag=0;
		
		for(int i=0;i<personL.size();i++) {
			
			if(personL.get(i).salary>limit) {
				avgAge+=personL.get(i).salary;
				flag++;
			}
		}
		
		
		return avgAge/flag;
	}
	
	}
	
	
	
