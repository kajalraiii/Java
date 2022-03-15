package customObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSorting {
	public static void main(String[] args) {
		ArrayList<Employee> arr=new ArrayList<Employee>();
		arr.add(new Employee(1,"Ram",5000d));
		arr.add(new Employee(2,"shyam",2000d));
		arr.add(new Employee(3,"sita",8000d));
		
		//sorting based on name
		Collections.sort(arr, new Comparator<>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		for(Employee emp:arr) {
			System.out.println(emp.getEno()+" "+emp.getName()+" "+emp.getSalary());
		}
		//sorting based on salary
		Collections.sort(arr,(o1,o2)->o1.getSalary().compareTo(o2.getSalary()));
			
		for(Employee emp:arr) {
			System.out.println(emp.getEno()+" "+emp.getName()+" "+emp.getSalary());
		}
	}

}
