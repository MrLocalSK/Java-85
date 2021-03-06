class Employee 
{
	int empno;
	String name;
	float sal;
	
	void assignDetails(){
		name = "Praveen";
		sal = 5252.5f;
	}

	void getDetails(){
		System.out.println(empno + " | " + name + " | " + sal);
	}
	public static void main(String[] args) 	{
		System.out.println("in Employee class");
	}
} //Employee

class ObjectTest
{
	public static void main(String[] args) 
	{
		/*-- create an instance of Employee --*/
		Employee emp = new Employee();
		
		/*-- access the state of instance with reference --*/
		System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);

		/*-- access the state of instance with method --*/
		emp.getDetails();

		/*-- change the state of object with reference --*/
		emp.empno = 101;
		emp.name = "Sunil Joseph";
		emp.sal = 2500.5f;
		emp.getDetails();

		/*-- change the state of object with method --*/
		emp.assignDetails();
		emp.getDetails();
	}
}
