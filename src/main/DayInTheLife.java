public class DayInTheLife {

	public static void main(String[] args) {
		
		// This is where we describe a day in the life of someone.
    // We can run this in our IDE. The "main" method is just a special method that our programming language knows what to do with.
		// 1. We should define our person first really.
		Person jb = new Person("Jarvis Blocker");
		Person rg = new Person("Robert Gant");
		
		// 2. We should make our person do some stuff.
		rg.setHeight(183);
		
		// 3. We should output useful information about the events of the day.
		System.out.println("The name of our first person is: " + jb.getName()); // Java specific printing of a line to the "console"
		
		String personName = rg.getName();
		System.out.println("The name of our second person is: " + personName );
		System.out.println( personName + " is " + rg.getHeight() + "cm tall");
		// rg and jb die here
	}

}
