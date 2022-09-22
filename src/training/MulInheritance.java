package training;

//A simple Java program to demonstrate multiple
//inheritance through default methods.
interface TestInterface1
{
 // default method
 default void show1()
 {
     System.out.println("Default TestInterface1");
 }
}

interface TestInterface2
{
 // Default method
 default void show()
 {
     System.out.println("Default TestInterface2");
 }
}

//Implementation class code
class MulInheritance implements TestInterface1, TestInterface2
{
 public static void main(String args[])
 {
     MulInheritance d = new MulInheritance();
     d.show();
 }
}