import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore
{
	ArrayList<Toy> toyList = new ArrayList<Toy>();
	
	public ToyStore()
	{
		toyList = new ArrayList<>();
	}
	
	public ToyStore(String toy)
	{
		loadToys(toy);
	}
	
	public void loadToys(String toy)
	{
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(toy.split(", ")));
		toyList = new ArrayList<>();
		for(int i = 0; i < toyList.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			Toy t = getThatToy(name);
			
			if(t == null)
			{
				if(type.equalsIgnoreCase("Car"))
					toyList.add(new Car(name));
				if(type.equalsIgnoreCase("AF"))
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
		for(Toy t : toyList)
		{
			if(t.getName().equalsIgnoreCase(nm))
			{
				return t;
			}
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		
		for(Toy t: toyList)
		{
			if (max < t.getCount())
				max = t.getCount();
				name = t.getName();
		}
		
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(Toy t: toyList)
		{
			if(t.getType().equalsIgnoreCase("Car"))
				cars++;
			if(t.getType().equalsIgnoreCase("AF"))
				figures++;
		}
		
		if(cars > figures)
			return "Cars";
	    
		if(figures > cars)
			return "Action Figures";
		else
			return "Equal amounts of action figures and cars!";
	}
	
	public String toString()
	{
		return " " + toyList;
	}
}