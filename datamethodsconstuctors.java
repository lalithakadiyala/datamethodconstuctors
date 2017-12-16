
public class datamethodsconstuctors {

	public static void main(String[] args) {

		studentinfo studentobj = new studentinfo();
		studentobj.display();

		studentinfo studentobj1 = new studentinfo("Nandan", 8, 768, "ME");
		studentobj1.display();

	}
}

class studentinfo {
	// instance variables
	String name;
	int Grade;
	int totalmarks;
	String Course;

	// constructors
	studentinfo() {
		name = "lalitha";
		Grade = 7;
		totalmarks = 560;
		Course = "computerscience";
	}

	studentinfo(String pname, int Grad, int tm, String Crse) {
		name = "pname";
		Grade = Grad;
		totalmarks = tm;
		Course = Crse;

	}
	// static varible
	static String companyname= " Google";  

	int getaverage() {
		int average = 1000 - totalmarks;
		return average;
	}

	void display() {
		System.out.println("Enter name  :" + name);
		System.out.println("The Grade is :" + Grade);
		System.out.println("the total marks  :" + totalmarks);
		System.out.println("enter course :" + Course);
		System.out.println("the average is : " + getaverage());
        System.out.println(studentinfo.companyname);
	}
}
