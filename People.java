package HomeWork2;

import java.util.ArrayList;

public class People {
	static ArrayList<Person> personL = new ArrayList<Person>();
	
	public People(int n) {
		for(int j = 0; j< n; j++)
		{
			personL.add(new Person());
		}
	}

	void print()
	{
		for(int i=0;i<personL.size();i++) {
			System.out.println(personL.get(i).name +" " +personL.get(i).surname+" "+personL.get(i).age +" " +personL.get(i).salary);
		}
	}
	
	void sort(String type)
	{
		int n = personL.size(); 
		if(type == "age")
		{
			for (int i = 0; i < n-1; i++) 
			for (int j = 0; j < n-i-1; j++) 
				if (personL.get(j).age > personL.get(j+1).age) 
				{ 
					// swap arr[j+1] and arr[i] 
					Person temp = personL.get(j); 
					personL.set(j, personL.get(j+1));
					personL.set(j+1, temp);

				} 
			
		}else if (type == "salary")
		{
			
		}
	}

}
