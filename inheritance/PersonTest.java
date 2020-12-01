package inheritance;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person("Peter", "ul.Iskar 100", "0889754886","peter@gmail.com");
		Student s = new Student ("Ivan", "ul.Montevideo","0897554321","ivankata@abv.bg","sophomore");
		Employee e = new Employee("John","St.Main 67","08273649028","john@gmail.com","Office 3", 3400, "13 NOV 2020");
		Faculty f = new Faculty ("Stephen","St.Main 5","0828338849","st.mail@gmail.com","Office 3", 3400, "20 NOV 2012",7,"Professor");
		Staff s1 = new Staff("John","St.Main","08273649028","john@gmail.com","Office 3", 3400, "13 NOV 2020","Assistant");
		
		
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(e.toString());
		System.out.println(f.toString());
		System.out.println(s1.toString());
		




	}

}
