import java.util.Scanner;
class Employee{
	String Name,Address;
	int Age,Phone_number;
    	double Salary;
    	void printSalary(){
        		System.out.println("Salary of the Employee : ");
        	}
}
class Officer extends Employee{
    	String specialization;
}
class Manager extends Employee{
    	String department;
}
class Main
{
    	public static void main(String args[]){
        		Scanner sc=new Scanner(System.in);
        		Officer off=new Officer();
        		System.out.println("Enter Officer Details : ");
        		System.out.println();
        		System.out.print("Enter the name of the officer : ");
        		String s1=sc.nextLine();
       		off.Name=s1;
        		System.out.print("Enter the age of the officer : ");
        		int s2=sc.nextInt();
        		sc.nextLine();
        		off.Age=s2;
        		System.out.print("Enter the phone no of the officer : ");
        		int s3=sc.nextInt();
        		sc.nextLine();
        		off.Phone_number=s3;
        		System.out.print("Enter the address : ");
        		String s4=sc.nextLine();
        		off.Address=s4;
        		System.out.print("Enter the specialization : ");
        		String s5=sc.nextLine();
       		off.specialization=s5;
        
        		System.out.println();
        		System.out.println("Enter Manager Details : ");
        		System.out.println();
        		Manager mag=new Manager();
        		System.out.print("Enter the name of manager : ");
        		String m1=sc.nextLine();
        		mag.Name=m1;
        		System.out.print("Enter the age of the manager : ");
        		int m2=sc.nextInt();
        		sc.nextLine();
        		mag.Age=m2;
        		System.out.print("Enter the phone no of the manager : ");
        		int m3=sc.nextInt();
        		sc.nextLine();
        		mag.Phone_number=m3;
        		System.out.print("Enter the address : ");
        		String m4=sc.nextLine();
        		mag.Address=m4;
        		System.out.print("Enter the department : ");
        		String m5=sc.nextLine();
        		mag.department=m5;
        
       		System.out.println();
        		System.out.println("---OFFICER DETAILS---");
        		System.out.println("Name : "+s1);
        		System.out.println("Age : "+s2);
        		System.out.println("Phone no : "+s3);
        		System.out.println("Address : "+s4);
        		System.out.println("Specialization : "+s5);
        
        		System.out.println();
        		System.out.println("---MANAGER DETAILS---");
        		System.out.println("Name : "+m1);
        		System.out.println("Age : "+m2);
        		System.out.println("Phone no : "+m3);
        		System.out.println("Address : "+m4);
        		System.out.println("Specialization : "+m5);
        
    	}
}

