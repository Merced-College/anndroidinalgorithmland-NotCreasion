[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=23137640)
# AnnDroidInAlgotihmLand
a sample project to practice sorting and searching

🎵 Download Required Audio File

This project uses an audio file that is too large to store directly in the GitHub repository.
Please download the file from Google Drive before running the program.

Download the audio file here:

➡️ Download the required audio file from Google Drive

Instructions

Open the Google Drive folder using the link above.

Download the ZIP file that contains the audio file.

Extract (unzip) the file on your computer.

Place the extracted audio file into the project folder named content.

Download all of the whole content folder, and put this in your project.



Name: Estefania Reyes
Date: 17 March 2026
Info: This project is to show and understand that you know how to properly read code and use eclipse. The proeject itself is a game with cute little audios and pngs. After that we are prompted to add a selection sort and a binary search.

Project Setup Completed Successfully\

## Code Exploration

What types of files are located in the src folder?
The SRC folder holds all the info needed for Level 1. It has main,leaderboards, and Score Entry.

What appears to be stored in the content folder?
In the content folder it holds all the images and stuff needed for the game like the boom,enemy, and it also holds the audio for the game.

What is the purpose of the uml folder?
The UML folder appearcs to be the planning that shows how the software works.

Why do software projects often separate code from content/assets?
It mis a way to keep everything organized allowing someone other from the creator to add stuff without breaking the programs logic.

Which class contains the main() method?
The Main class in the file called Main.java holds the main class.

What does the program do when it first starts running?

The first thing the program does is initialize the graphical interface, which then opens up a window that uses all the game assests as m,entioned before; the ship, the boom, etc.
What objects or classes are created when the program begins?
It creates a new window that holds the game. Then the game manager(engine) is opened.After that content loaders read files from the "content" folder.

Which class appears responsible for drawing graphics?
The RabbitGamePanel.java appears to be drawing the graphics.

Which class appears responsible for loading files or content?
The class that is responsible for loading files or content is Assets.java

How does the game update what appears on the screen?
The RabbitGamePanel
relies on the method called Repaint to draw new images, all while the engine is running a loop.

What does the UML diagram help you understand about the program?
The UML diagram allows you to know exactly how the program is structured. It helps you understand the program and overall helps you make changes without breaking the games logic. 

Which class appears to be the central class in the system?
The central class is AppRouter.java.

Which classes depend on or interact with other classes?
Main interacts with AppRouter, AppRouter interacts with all panel classes. After that RabbitGamePanelInteracts with Assets. Assests interacts with the entire content folder. LeaderboardPanel interacts with LeaderboardTableMode.

Where in the code are scores stored?
Scores are all stored in the Leaderboard.csv file.

What data type is used to store scores?
LeaderboardRepository is responsible for storing the scores.

Where would it make sense to implement sorting of scores?
ScoreEntry & leaderboardAlgortihms are likely being used to impliment sorting the scores.

## Sorting
In which class did you add the sorting code?
I added the code to LeaderboardsAlgorithms.java.

Why did you choose that location?
I choose this location because as the name states "algorithms" I felt all calculations should be done in this class.

What data structure is being sorted?
ScoreEntry is being sorted due to the fact that it isd where the scores originate and since it stores the unsorted value, before it can go anywhere else it has to be sorted or else it can't be inputed at all.

Which sorting algorithm did you choose?
I chose to do SelectionSort.

How does your algorithm work in your own words?
IT works by findinf the largested unsoirted score and moving it to the front. It is a nested Loop.

How did you verify that your sort was correct?
I ran the program and opened the leaderboard. I also tested several different scores in random order.

## Searching

How does binary search work in your own words?
Binary search works by sorting from the middle and decididng based on the size of the number if you use the numbers on the right or the left of the middle. With that it lowers the range making it potentially faster. It uses a loop.

Why must the data be sorted before binary search can be used?
IF you dont sort before using binary search it will take longer as it will check every single item before it finds what it is looking for. If it is sorted once it gets to the middle it will decide if it needs to use the left set or the right set cutting down the ammount that it needs to check.

What variables did you use for low, high, and mid?
Low is used to track the starting index. High is used to track the end of the index. Mid is the number directly in between the low and high.

What happens when the score is not found?
If the score is not found it causes the while loop to exit and reutrn the fact that the score does not exisst. -1