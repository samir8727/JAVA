package co.samir.myprogram.test;
import co.samir.myprogram.Company;
import co.samir.myprogram.Employee;
public class Test1 {
	public static void main(String[] args) {
		Company company1=new Company(6787651,"Accenture pvt. ltd.", "Software", "Bangalore");
		
		Employee employee1=new Employee();
		employee1.setId(3456101);
		employee1.setName("Samir Rout");
		employee1.setSalary(34000);
		employee1.setGender('M');
		employee1.setCompany(company1);
		String[] tasklist1= {"sff","xgdg","fgfg"};
		
		employee1.doSomething("study....");
		
		employee1.printEmployeeDetails();
		
		employee1.setTasklist(tasklist1);
		employee1.displayTask(tasklist1);
		
		employee1.riseSalary(employee1, 10);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>0<<<<<<<<<<<<<<<<<<<<<<<<");
		
		Company company2=new Company(6787651,"marvel ltd.", "media", "New york");
		
		String[] tasklist2= {"adsghsh","afagahyq","wuqiqoqoqo"};
		Employee employee2=new Employee(100023, "Spider man", 56000, 'm', company2,tasklist2);
		
		employee2.printEmployeeDetails();
		
		employee2.displayTask(tasklist2);
		
		employee2.riseSalary(employee2, 10);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>0<<<<<<<<<<<<<<<<<<<<<<<<");
		
		String[] tasklist3= {"have to finished all work","Deployee all program","be on time"};
		
		Employee employee3=new Employee(45000, "super man", 'M', company2,tasklist3);
		employee3.printEmployeeDetails();
		employee3.doSomething("flying");
		employee3.displayTask(tasklist3);
		employee3.riseSalary(employee3, 20);
		
		
		
	}

}
