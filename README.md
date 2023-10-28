# SafeKey
Carter Rath, Ruth Jimenez, Mae Pereyra

Password storage application from our Software Engineering Design Patterns class.
#INTRODUCTION
Description/Background: Safe Key is an application that provides a secure and convenient hub to store any number of passwords. The application will create secure password storage through the use of encryption by taking the user’s passwords and encrypting them. The user can only access it with their own specialized login information, which adds another layer of security to the application. The main features include a UI, which displays login details as soon as the app is run. After the user successfully logs in, the user interacts with the UI to view and modify their passwords. For password management, there’s adding, editing, deleting, and viewing the stored passwords. The password information is stored in an account text file where it is accessed by a data access object for modification and parsing. For account management, there’s changing passwords, forgetting passcode, and setting up recovery. None of them can be accessed until set-up recovery is done.

#Key Features to Develop: 
- Less memory is used - The new program implements four design patterns that would allow restructuring our software to be more organized and reusable instead of using more memory to duplicate them. 
- New GUI - The new program implements a new GUI to be more user-friendly. For the original 370 project, the homepage was used as one panel and would constantly modify the panel depending on the module the user selected (add, edit, delete, view). At the start of our new implementation for 471, it was noticed that there were some bugs with the homepage panel so NetBeans was used to design the GUI which made it simpler for the user to move between the panels as certain buttons were pressed. 
Removed unused features - The new program removes any unnecessary features that were not used again. For example, in the Account Management module, a setup recovery was included. In the create account module, several additional text fields were included for the user's full name, email, and date of birth. Seeing as these features are never used after account creation, it was decided to remove them. Now, only a username and password can be entered in the initial CreateAccountScreen. Additionally, instead of having account recovery in its own module, it is added to the account creation module as shown below:
Old version:						New Version:
   
New encryption types - the original project consisted of one encryption type that would connect to an SQL database and store the passwords. The original project only connected to one user so credentials were never checked. In the new version, we used text files to store the users' information and passwords in one location. This allows easier access to everything that belongs to said user. This also allows the user to choose between more than one encryption.
All entered passwords encrypted - In our original version we can see the passwords the user is typing in but for our 471 version they all use a JText password field to encrypt all passwords being entered. The user's recovery answer and account password are also encrypted so if an anonymous user is able to get access to the text file where the data is stored, we don’t risk the password information being leaked.
Undo/Redo functionality - Before, the user was only allowed to do one task and then save. In our new version, undo and redo commands are implemented which allow the user to undo an action and redo an action at any point. An example of the undo command being used is if a user deletes a password by accident, the user can use the undo command and it will reverse the delete command, restoring the original data. For the redo action, an example would be if the user decides to use the undo command, and the user subsequently realizes that they want to go back, they can use the redo command to reset the data. A software comparison we can make of the undo and redo command is similar to a Word document, our undo, and redo commands work the same way. 

Potential Users: Any user who wants to keep their account, specifically their password(s) secure in one place will find use in this application. Some examples of accounts that could be stored are an email account, iCloud account, or any other social media account. Any account would be feasible for this program as long as it has a text password. 


SYSTEM DESIGN PATTERNS & SYSTEM IMPLEMENTATION

2.1 Protection Proxy
Proxy is the design pattern used for securing the user’s account. In the login screen, the creation of an AccountAccessProtectionProxy class occurs to verify whether the user has an account or not. This class is used as a representative object that controls access to AccountAccess. However, the AccountAccess object which offers the actual service is not accessible yet. The proxy creates a UserDAO class where we check the existing user files to see if the login credentials match. If an anonymous user does not have an account, the user cannot proceed to the homepage. If the verification comes back true, an AccountAccess object is created and the service to access HomePage is processed. After accessing the homepage, we move on to the classes in the next design pattern, singleton.

	Protection Proxy code quality:
	
	
	



2.2 Singleton
The singleton design pattern ensures that only a single object can be created when the program is used and prevents unnecessary creation of objects. The single object that is being created is a key manager that allows modification to the user’s passwords. This object is created when a user accesses the homepage and is accessed through the getInstance method. The constructor also creates a CommandInvoker object upon creation.

	Singleton code quality:
	





2.3 Command
The command design pattern is used for our Password Command such as edit, delete, and add password. A stack array is used for the list to, doIt, undo, and redo commands.  This is for the user’s convenience to be able to access and modify their passwords and retrieve information when they make a mistake. When a user adds, deletes, or edits, the command object is created and pushed to the undo stack. When the user undos the action, the command object is popped from the undo stack and pushed to the redo stack. When the user redos the action, the command object is popped from the undo stack and pushed to the redo stack.
















	Command code quality:
	
















2.4 Strategy
Strategy is the design pattern used for implementing our different types of encrypting and decrypting the user’s password which is either a Blowfish algorithm that uses 64-bit block cipher or AES that uses HEX. Strategy is the best way since it is flexible and easier to reuse a code and will be able to apply in real-time when the user chooses the method they want to use. In this way, the user can choose whether implemented passwords are to be encrypted by AES or Blowfish. Encryption Blowfish and EncryptionAES implement the Interface SecurePassword that has an object method which is the user’s choice of encryption. The Blowfish algorithm (symmetric) uses a 64-bit block size and takes a key, from 32 bits to 448 bits. Blowfish uses a single encryption key to both encrypt and decrypt. AES algorithm (symmetric) on the other hand uses HEX (binary 16) and encrypts the passwords block by block to form a ciphertext and then this ciphertext will be decrypted the same way. This is implemented for users’ security of their passwords to their accounts. 









	Strategy code quality:
	
	
	








UTILIZATION OF EXTERNAL RESOURCES
NetBeans
From manually making the GUI to using NetBeans has helped not only improve the GUI but also manage the time necessary in order to finalize this project. It is a friendly user interface that is easily accessible and connected to where our code is from IntelliJ. It made our GUI look professional and create ease of use for new users. 
SE 370 Code
The first version of Safe Key was the skeleton of our project where we improved not only the GUI but also the way it works, especially with the Command design pattern that helps users to have a better experience using Safe Key within their edit/delete passwords and within different encryption that we newly implemented. 
GitHub
The ability to push our code in GitHub and update the code whenever the program had been modified helped to save our storage. It became simpler to edit the specific parts of the code that needed updating. Adding the code to Github, then downloading the file every time someone else modifies the code was extremely beneficial for team members working on the project at any moment.
Video Link
