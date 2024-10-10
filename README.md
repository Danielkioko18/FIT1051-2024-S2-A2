                FIT1051 Assessment Two
Submission deadline: Wednesday 11th September 11:55pm AEST (Week 8) via
Moodle
Weight: 15% of your overall mark
Late penalty: 5% mark deduction per day
Instructions: Below are the coding tasks that you need to complete for Assessment
2. Your work and your submission should be independent. Please download the
IntelliJ project folder below and unzip it. This will provide you with partial code in
which to program your answers. Please complete each task in the appropriate
section of the partial code, and submit upon completion.
This assessment is worth 15% of the unit total. Submission of your code is worth
50% of this total, and your interview component (held later in Week 9) is worth 50%.
The programming portion of this assessment contains 50 marks and is comprised of
the following components:
Code correctness is worth 42 marks:
• Task 1 is worth 7 marks
• Task 2 is worth 20 marks
• Task 3 is worth 15 marks
Writing good quality code that adheres to the FIT1051 Coding Standards is worth 8
marks.
Academic Integrity: Please be reminded of the academic integrity standards that
are expected of you at Monash, which were mentioned in Week 1. You should code
alone and ask the unit staff for help if needed. Do not post your code in public forums
or send your code to anyone. Do not copy/paste code from other sources and present
it as your own — this includes use of generative AI tools. Breaching these academic
integrity requirements can incur serious penalties.
Scenario
For this assignment, you need to make a simple user registration application that
allows users to register for some system by entering their email address and chosen
password. Once a user has registered, they can then log in to the system to change
their email or password, or delete their account.
Task 1 (7 marks)
In the provided file RegisteredUser.java in the downloaded project, create a new
RegisteredUser class with three appropriately typed fields, userID, email and
password. (2 marks)
• Keep in mind that while a user can change the email address or password
associated with their account at any time, their userID should remain the
same for as long as they are registered in the system. Each user’s userID
should be unique, and userIDs should be assigned in increasing numerical
order with each new registration, starting from 1.
Implement the following for the RegisteredUser class:
• (2 mark) A default constructor with sensible default values, and a non-default
constructor with sensible parameters.
• (2 marks) Getter and setter methods for fields as appropriate.
• (1 mark) A toString method that returns the details of the RegisteredUser,
formatted appropriately.
Task 2 (20 marks)
In the Assignment2Driver class, write code that does the following, when the program
is run:
• (1 mark) Initialises an empty ArrayList of RegisteredUsers.
• (2 marks) Outputs a main menu, which allows the user to select from the
following options:
1. Register a new user.
2. Login as an existing user.
3. Quit the program.
The program should continue to run until Option 3 is selected.
• (5 marks) If Option 1 is selected, the user should be prompted to enter the
email address and password they want to register with. A new RegisteredUser
object containing their details should be added to the list of users. The user
should be informed that they have been registered successfully, and their
registration details (including userID) should be output to the screen, before
returning them to the main menu. Recall that userIDs should be uniquely
assigned, in increasing order starting at 1.
• (12 marks) If Option 2 is selected, the user should be prompted to login by
entering their email address and password. They should be allowed three
attempts to enter this correctly. If after the third attempt, no match for their
email/password has been found, an appropriate error message should be
printed and the user should be returned to the main menu. If, on the other
hand, the user logs in successfully, they should be presented with a new menu,
with the following options:
1. Print user details, which outputs all the information associated with that
user in the system.
2. Change email address, which prompts the user for a new email address
and updates their details in the system.
3. Change password, which prompts the user for a new password and
updates their details in the system.
4. Delete account, which if selected, will prompt the user for confirmation,
then remove their details from the ArrayList and return them to the
main menu.
5. Log out, which returns the user to the main menu.
Task 3 (15 marks)
Upgrade your system to include the following validation checks.
• (4 marks) Write a method called validateEmail in the Assignment2Driver
class. This method should take an email address as its parameter, and return a
boolean value. It should check the provided email address to ensure it
contains the character ‘@’, preceded by at least one character, and followed by
at least one character. If the email address meets these criteria, the method
should return true. Otherwise, it should return false. For example, the strings
“hello@world”, “1@1”, and “student123@monash.edu” should all return true, but
the strings “helloworld”, “rebecca@”, and “@monash.edu” should all return
false.
• (4 marks) Write a method called validatePassword in the Assignment2Driver
class. This method should take a password as its parameter, and return a
boolean value. It should check the provided password to ensure it:
o is at least 8 characters in length,
o contains at least one number, and
o contains a mix of upper and lowercase characters.
If it meets these three conditions, it should return true, otherwise it should
return false.
• (7 marks) Update the rest of your program so these validation checks are
performed when a user first registers, and when they update their email
address or password. If the user gives an invalid email address or password,
they should be given an appropriate error message and prompted to try again.
Adherence to coding standards (8 marks)
All code written should adhere to the guidelines set out in the FIT1051 Coding
Standards.
Submission Instructions: Please submit your IntelliJ project folder as a .zip file and
submit to the Assessment 2 link on the Moodle Assessments page. If you are not
sure how to zip your project, please refer to the video here. MAKE SURE YOU
DOWNLOAD FROM MOODLE AFTER THAT TO CHECK IT IS THE RIGHT
SUBMISSION!
Interview component: You will be asked to demonstrate your program at an
interview in Week 9, following the code submission date. You will need to ensure an
interview time is arranged with your tutor by the end of Week 8.
The interview will be 10 minutes in length, and consist of 6 questions. You may be
asked to explain your code, your program designs, to modify your code, to discuss
your coding decisions, or to explain the any of the concepts taught in Weeks 1-7 in
terms of how they relate to the Assessment tasks.
Interviews will take place in person during Applied class time, and also online via
Zoom. You must have access to a stable internet connection and a working webcam,
and your webcam must be switched on for the duration of the interview. Online
interviews will be recorded for marking integrity purposes, and recordings will be
deleted at the end of semester.
It is your responsibility to make yourself available for an interview time. The interview
is worth 50% of your assessment mark, and any student who does not attend an
interview will receive a fail grade for the assignment. Your interview must take place
before the end of Week 9.
