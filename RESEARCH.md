One of the powerful features of Java is its built-in support for multithreading—the concurrent
running of multiple tasks within a program. In many programming languages, you have to
invoke system-dependent procedures and functions to implement multithreading. 
/
CREATING A THREAD 
We create a class that extends the java.lang.Thread class. This class overrides the run() 
method available in the Thread class. A thread begins its life inside run() method. We create 
an object of our new class and call start() method 
to start the execution of a thread. Start() invokes the run() method on the Thread object

RUNNABLE
Thread Class vs Runnable Interface

If we extend the Thread class, our class cannot extend any other class because Java doesn’t support multiple inheritance. But, if we implement the Runnable interface, our class can still extend other base classes.
We can achieve basic functionality of a thread by extending Thread class because it provides some inbuilt methods like yield(), interrupt() etc. that are not available in Runnable interface.
Using runnable will give you an object that can be shared amongst multiple threads. 
