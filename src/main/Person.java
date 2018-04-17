
// This is our person object

public class Person {
	
	// This is a "member variable" - a property for our Person.
	// This is information private to the object. 
	// If anyone wants this information, they must ask for it using the method "getName".
	// This is a String, which is a special type which holds text. Very useful.
	private String name;
	
	// An int is an integer number. This will be height in cm and we won't care about decimals for now.
	private int height;
	
	// This is a constructor - we call this to create an "instance" of a person.
	// But we don't set any details
	public Person()
	{
		
	}
	
	//This is also a constructor, but we set up some values immediately.
	public  Person(String name)
	{
		// "this" is a keyword. It means the specific instance of the object.
		// You can construct many Person objects. "this" relate to only the active one.
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
