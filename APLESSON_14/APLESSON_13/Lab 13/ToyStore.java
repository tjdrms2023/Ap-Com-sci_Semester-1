import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore
{
	static ArrayList<Toy> toyList = new ArrayList<Toy>();
	
	public ToyStore()
	{
		toyList = new ArrayList<>();
	}
	
	public ToyStore(String toy)
	{
		loadToys(toy);
	}
	
	public void loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		toyList = new ArrayList<>();
		for(int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			Toy t = getThatToy(name);
			
			if(t == null)
			{
				if(type.equalsIgnoreCase("Car"))
					toyList.add(new Car(name));
				else if(type.equalsIgnoreCase("AF"))
					toyList.add(new AFigure(name));
			}
			else
			{
				t.setCount(t.getCount()+1);
			}
		}
	}
	
	public Toy getThatToy(String nm)
	{
		for(Toy toy : toyList)
		{
			if(toy.getName().equalsIgnoreCase(nm))
			{
				return toy;
			}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = " ";
		int max = Integer.MIN_VALUE;
		
		for(Toy toy: toyList)
		{
			if (max < toy.getCount()){
				max = toy.getCount();
				name = toy.getName();
			}
		}
		
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(Toy object: toyList)
		{
			if(object.getType().equalsIgnoreCase("Car"))
				cars++;
			if(object.getType().equalsIgnoreCase("AF"))
				figures++;
		}
		
		if(cars > figures)
			return "Cars";
	    
		else if(figures > cars)
			return "Action Figures";
		else
			return "Equal amounts of action figures and cars!";
	}
	
	public String toString()
	{
		return " " + toyList;
	}
}