# hello-world
Information repository

You can read this for basic introductory info

Go to the github home page and follow the "Hello World tutorial
If you don't want to start your own repository, you can use this one to practise!
(We probably won't need 2).

How to use:

Start off with the simple version:

Click "Clone or download"
Download ZIP
Pick a nice easy to work with location on your computer, unzip the contents there.
Congratulations, you have a local copy of this repository to do with as you wish!
The copy is not linked to the repository (difference between simple and advanced).
Next, open your IDE.
In our example, this will be Eclipse.
Open the "Project Explorer" view. 
(If you don't have it open by default, use the menu path in eclipse Window > Show View > Project Explorer)
Right click in an empty area of Project Explorer.
New > Project
Pick "Java Project"
Click Next
Choose a name for the project (I'd suggest DayInTheLife)
Untick "Use default location", and pick the folder containing your local copy of this repository. (At the moment called hello-world-master)
Click Next
You should see the contents of the folder in the view.
Click Finish

You now have a java project that you can work in! It will be a bit messy to look at for now... we will improve that later.

To run your project:
Use the eclipse menu Run > Debug Configurations...
Select "Java Application" from the list.
Click the "New" button (full tooltip is currently "New launch configuration", it is in the top left above all the options)
Give it a name.
Select the project as your new project (this may be auto filled)
Search for a main class.
It should find DayInTheLife, pick it.
Click Apply
Click Debug

This will run the "main" class in DayInTheLife.
As a shortcut, you can use the dropdown next to the little green bug button - this is "Debug" (or the green arrow button - this is "Run")
The difference between debugging and running is small but very important.
At the moment, we have no need to ever just run the program, as we want to learn the extra tools that debugging brings.
For now, as long as you do not create any breakpoints, debug and run will do the same thing. 
Feel free to experiment with breakpoints and debugging, but you'll have to learn yourself for now.

