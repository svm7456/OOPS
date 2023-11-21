
import java.util.*;
class Student{
    String name;
    int age;
    int id;
    Student(String name,int age,int id){
        this.name=name;
        this.age=age;
        this.id=id;
    }
}
public class Main
{
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(true){
		    System.out.println("\n\n===================**********======================\n");
		    System.out.println("1 - Please enter the the detail of student ");
		    System.out.println("2-  please update the detail of student ");
		    System.out.println("3-  please print all the detail of student ");
		    int input = sc.nextInt();
		    if(input==1){
		        System.out.println("please enter the name");
		        String name = sc.next();
		        System.out.println("Please enter the age ");
		        int age= sc.nextInt();
		        System.out.println("Please enter the id ");
		        int id = sc.nextInt();
		        Student s = new Student(name,age,id);
		        al.add(s);
		    }
		    else if(input==2){
		        System.out.println("please enter the id ");
		        int id =sc.nextInt();
		        System.out.println("Please enter the name do you want to change ");
		        String name = sc.next();
		        for(int i=0;i<al.size();i++){
		            if(al.get(i).id==id){
		                al.get(i).name = name;
		            }
		        }
		        
		        
		    }
		    else if(input==3){
		        for(int i=0;i<al.size();i++){
		            System.out.println("Name = " + al.get(i).name + " | age =" + al.get(i).age + " | id= " + al.get(i).id);
		        }
		    }
		    
		}
	}
}
