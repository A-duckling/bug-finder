**IB CS IA Project**

*Website:* https://nonsubversively-mesenteric-aiko.ngrok-free.dev/


***************************************************************************************



**IA PAPER - Word**

IB Computer Science SL IA
Darrien Isaac
Client: Gabriela Isaac
Advisor: Jesse Packman
IA Topic: an app that helps identify Florida bugs bad for gardens.

Criterion A – Planning:
Scenario:
The client has a garden, which they tend to often. It is large and hard to manage, with many flower beds across the front and back yard. Bugs are essential to the ecosystem and health of a garden. However, some bugs will target certain types of plants, hurting the output of the garden. Many are invasive as well, hurting the general ecosystem too. However, because of their size and relatively similar looking bodies, it can be hard to tell which bugs are good for your garden, and which are bad. Many bugs even use mimicry to imitate other bugs, making it that much harder for us to tell. Therefore, to solve this problem, she is considering digital methods that can help identify and distinguish bugs from each other. During our discussion, the client brought up this issue, and so we decided to come up with a solution.

Solution:
A website that through a series of questions the client can determine the type of bug. Users will be taken through a decision tree which will ask them about features of the bug or actions of the bug. It will end with a proposed bug, which will include a description, evaluation of if it is harmful or positive for a garden, and images to compare the bug to.



Rationale:
I believe this solution will work well because it is simple to use. Websites are easy to access, with little hurdle to get into. Using simple questions to evaluate a complicated evaluation suits well in this case.
Current digital methods are either not specific enough, either being too general or not local enough (middle of Florida), or don’t explicitly show the difference between the bugs, especially the ones that look similar.
I plan on using Java, JSON, JavaScript, HTML, and CSS. Object Oriented Programming works well with this type of application and I am familiar with Java. JSON is useful for communicating with the front end. I will use ngrok to host the website.


Success Criteria:
A.	Simple and direct Graphic User Interface, with a simple input method
B.	Bug classification is accurate and precise enough to be effective in determining if the bug is good or bad for a garden
C.	The result of the program displays a wide range of information about the bug, including images, descriptions and evaluations, enough to feel accurate
D.	It is simple to access









Criterion B – Design Overview:


Record of Tasks:
	Candidate:  
Task number	Planned action 	Planned outcome	Time estimate	Target completion date	Criterion
1	Create VSCode Project	A framework to make the project	8 hours		
2	Code framework for question nodes	Question boxes for the decision tree	2 hours		
3	Code framework for bug nodes	A framework for each bug I will add and its features	2 hours		
4	Add telemetry	A way to understand where nodes are	1 hour		
5	Make list of insects in central florida related to a garden	A list to add into website	2 hours		
6	Give each insect a its features	Adding description, outcome, etc.	6 hours		
7	Add images to each	A few images for each insect	3 hours		
8	Code each insect into JSON file	Nodes for each insect	2 hours		
9	Add formatting for bug nodes with CSS and JS	Images, description, outcome, etc. are formatted nicely on screens	2 hours		
10 	Format buttons and question nodes	The questions are clean and direct	1 hour		
11 	Find images to help with questions	Images that represent each question	2 hours		
12	Add images to questions	Images are in each question choice	1 hour		
13	Add welcome screen, description and colors	The website looks clear	2 hours		
14	Add restart button	At any point, you can restart	1 hour		
15	Add a go backwards button	At any point, you can go back to the previous question	1 hour		
16	Add ngrok 	This website is currently on Local Host. This lets anyone access the website	1 hour		

17					








Testing Plan:
Success Criteria	Description	Input	Output
A	User can use the website without assistance	User clicks through website	A final insect is determined
A	User can go back, restart, and understand results without assistance	User goes through program for one bug, then for another bug, and then must go back due to a “error”	User goes through the program, utilizes restart button, then responds to the “error” by using back button once.
C			


Design:
Insect List:
•	beetles (Coleoptera)
•	butterflies (Lepidoptera)
•	flies (Diptera)
•	ants/bees (Hymenoptera)
•	true bugs (Hemiptera)
•	webspinners (Embioptera), scorpionflies (Mecoptera), and angel insects (Zoraptera)














Program Overview











Criterion C – Development:
General Layout:
This program is a Spring Boot Application run in VS Code. It uses Java for its backend, HTML, CSS, and JavaScript for its frontend, and JSON to communicate between them. All the images, descriptions and other data are stored in the data file. Going on to the BugFinderApplication.java file and hitting the run button will launch this application and let me run it on my computer. Then, I start up the NGROK application, which brings up the terminal, and from there I can run my application on NGROK. This allows anyone to access my website as long as those two applications are running. 
The files of bug-finder to src to bug_finder were loaded in with the Spring Boot application. 
The controller controls the _
The files in model classes that allow me to create instances in JSON, acting as a preset which can then be loaded to 


















Criterion D – Functionality and extensibility of a product:
Video:

Criterion E – Evaluation:

Success Criteria	Met?	Client Comments
A	Yes	
B	Yes	
C	Yes	
D	No	

Reflection:
I would agree with this evaluation. I was not able to make it easily accessible, as it requires a 

