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
Info: This project isd to show and understand that you know hjow to properly read code and use eclipse. The proeject itself is a game with cute little audios and pngs.

Project Setup Completed Successfully

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

What data type is used to store scores?

Where would it make sense to implement sorting of scores?