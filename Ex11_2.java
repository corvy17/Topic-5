
public class Ex11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person("Sammy", "4419 Lima St", 
				"3105498911", "sam77@hotmail.com");

			Student student = new Student("Maria", "9027 Silver Ave", "3238906412", 
				"maria89hotmail.com", Student.SENIOR);

			Employee employee = new Employee("Crystal", "8934 High Ave", "7104324682",
				"crystal44hotmail.com", 971, 35000);

			Faculty faculty = new Faculty("Miguel", "7651 Bell St", "3105551819",
				"michael00@hotmail.com", 610, 75000, "8am to 10am", "Professor");

			Staff staff = new Staff("Val", "6235 Hollywood Ave", "3104561234",
				"valzeta55@hotmail.com", 12, 65000, "Executive Assistant");

			System.out.println(person.toString());
			System.out.println(student.toString());
			System.out.println(employee.toString());
			System.out.println(faculty.toString());
			System.out.println(staff.toString());

	}

}
