package zadacaaa36;

public class Student {
	int id; // data member (instancirana varijabla)
	String ime; // data member -||-
	int starost; // data member -||-
	Student(int i, String n) { // konstrukor so 2 parametri
	id = i;
	ime = n;
	}
	Student(int i, String n, int a) { // konstrukor so 3 parametri OVERLOADING
	id = i;
	ime = n;
	starost = a;
	}
	void display() { // metod
	System.out.println(id + "" + "" + starost);
	}
	public static void main(String args[]) {
	Student s1 = new Student(111,"Petar"); // kreiraj objekt s1
	Student s2 = new Student(222,"Marko", 25); // kreiraj objekt s2
	s1.display(); // pecati - s1
	s2.display(); // pecati - s2
	}

}
