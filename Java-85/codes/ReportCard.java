import java.util.Scanner;

class ReportCard 
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.print("enter student name: ");
		String name = sc.nextLine();

		System.out.print("enter the number of subjects: ");
		int no = sc.nextInt();

		/*-- create an int array to store marks --*/
		int[] marks = new int[no];

		marksEntry(marks); //method call for marks entry

		printReportCard(name, marks, no); //method call for generating report card
	}

	// method definition for marks entry
	static void marksEntry(int[] marks){
		for(int i=0;i<marks.length;i++){
			System.out.print("enter mark for subject-"+(i+1)+": ");
			marks[i] = sc.nextInt();
		}
	}

	//method definition for generating report card
	static void printReportCard(String name, int[] marks, int no){
		System.out.println("----------------------------------------------------");
		System.out.println("\t\tREPORT CARD");
		System.out.println("NAME: "+name);

		System.out.println("----------------------------------------------------");
		System.out.println(" SUBJECT\t\t MARKS");

		System.out.println("----------------------------------------------------");

		int total = 0;
		for(int i=0;i<no;i++){
			System.out.println("Subject-"+(i+1)+"\t\t   "+marks[i]);
			total = total + marks[i];
		}
		System.out.println("----------------------------------------------------");

		float avg = ((float)total)/no;
		System.out.printf("TOTAL: %d \t AVERAGE: %.2f \n", total, avg);
		System.out.println("----------------------------------------------------");
	}
}
