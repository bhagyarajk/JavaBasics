Exception hierarchy
----------------------
1. Throwable 
2. a. Exception b. Error
3. a. Exception --> a.checked and unchecked b. Error --> a.VirtualMachine Error b. AssertionError

 Checked and Unchecked exception : 
 Checked --> these are checked at the compile time and if the exception is of checked type then the programmer must have to use the throws keyword or the handle the exception, exception propagation is not implicit
 ex. File related exceptions like FileNotFoundException, SQLException, IOExcpetion (Just remember like trying to access any resource and user is doing something wrong then checked exceptions will happen)
 
 Unchecked --> these are the exceptions which are checked at the runtime operations, and for these the implicit propagation is possible,
 and in c++ all the exceptions are unchecked and programer need not to bother a lot, but for the systematic way java checked excpetions must be either handled by the programmer or He/She should let the jvm to handle by mentioning the throws keyword
 
 ex. ArithmaticException
 
 **Our Custom exceptions should be made checked or unchecked?**<br>
 <hr>
 If the user is able to recover from the exception then make it checked, if the end user can't do anything with the exception then make that exception as the unchecked
 
**Difference between the error and exception** <br> <hr>
Error : Serious problems that an Application should not try to catch the errors, most probably these cant be solve by programming
Exception : An application can catch exceptions and they can at least try to handle it 

ClassNotFound vs NoClassDefinitionFound
-------------------------------------------
NoClassDefinitionFound --> will occur when the class is present at the compile time and not present at the runtime
ClassNotFoundException --> when you try to load some classes using the methods like Class.forName() during the run time but the class is not found in the classpath 

Default exception handler 
-------------------------------
When there is some exception in occured in the method, method creates an object of the respective exception and throws it to the jvm, if the programmer has not written a logic to handle the exception, then the default exception handler will handle the exception object thrown and displays the content of the exception object, before this the exception will be propagated till the end 

try catch block 
---------------------
try {
}
catch(Exception exception) {
}
Try block must be either fallowed by the catch or the finally block, one try can have multiple catch blocks so that, the perticular 
specific exception can be catched 

and no matter what, the finally block will be executed whether the exception occures or not 

Custom Exception
-------------------
1. In order to throw an object, the object should contain the properties of the throwable interface
2. If you extend the class with Exception then the custom exception will become checked, if you extend the custom exception class with RuntimeException then the custom class will behave as the unchecked exception

Note : Why fileNotFound exception is checked ?
--------------------------------------------------
Ans took from stackoverflow
Ans 1 : 

Exceptions always encountered at runtime only, Difference is made when a exception is handled.

Checked or unchecked means whether it is forced to handle at compile time or it will only be identified when it is encountered at runtime.

If an exception is checked means compiler has way to identify whether the exception can occur or not. and whenever you compile it, you will be forced to handle a checked exception and by doing this chances of runtime exceptions will be reduced.

During file handling, compiler doesn't check whether file is present or not, it just check whether you have handled fileNotFoundException or not, because once you are dealing with a file chances of encountering this exception is very high and you should handle it in your code. for arithmetic Exception there is not way to find it during compile time. and thus it is left unchecked.

Ans 2 : 



NullPointerException or ArithmeticException usually shouldn't happen in a finished, correct program. You can handle those just with checking before with if to see if you divide by 0 or an object is null and then you are sure this Exception will not be thrown. Every time handling those Exceptions can make the code less readable.

Now you could argue that you could do the same for FileNotFoundException by just checking if the file exists before doing anything. But many constructors or methods that expect a File also support String from which the file is created then. I guess it is a question of where you draw the line, if you always only have the File method and never also support String then I would have added it to the unchecked ones too I think.

In other words: if a FileNotFoundException is thrown then it can be the desired behaviour and drive the flow of your program, but NullPoinerException really shouldn't be used for that.

When to go for checked and when to go for unchecked ?
----------------------------------------------------------
1. When there is a high chance of occurring an exception and it will be benificial if we handle the exception and given some user readable info for the end user so that he can understand what is he doing wrong, then I will go for checked, because if a program fails at compile time, there is still a chance that programmer can fix it and hand it over to the client, but if it fails at runtime without an attention from the programmer then client will get a buggy code 

2. When there is less chance of occurrence of that exception and programmer can probably have so many ways by that he/she can simply verify the things making sure that the exception will not occur(not 100% of course), then I will go for unchecked, example is devide by zero : Here programmer can use if else to ensure that the denominator will not have zero, and it can be done pretty easily, in that case I could probably go for unchecked 

Note : 
-------------
1.You can use the instance of operator to find out the whether the built in exception is a checked or unchecked
2. if the object is instance of runtime then it's unchecked, if its an instance of exception then it's checked

