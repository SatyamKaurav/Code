# Abstract Classes
An abstract class can be considered as a blueprint for other classes. Abstract
classes are classes that contain one or more abstract methods. An abstract method
is a method that has a declaration but does not have an implementation. This set of
methods must be created within any child classes which inherit from the abstract
class. A class that contains one or more abstract methods is called an **abstract class**.

##### Creating Abstract Classes in Java

* By default, Java does not provide abstract classes.
* A method becomes abstract when decorated with the keyword abstract.
* An abstract class cannot be directly instantiated i.e. we cannot create an
object of the abstract class.
* However, the subclasses of an abstract class that have definitions for all the
abstract methods declared in the abstract class, can be instantiated.
* While declaring abstract methods in the class, it is not mandatory to use the
abstract decorator (i.e it would not throw an exception). However, it is
considered a good practice to use it as it notifies the compiler that the user
has defined an abstract method.

The given Java code uses the ABC class and defines an abstract base class:
~~~Java
abstract class ABC{
 int value;
 Abstract int do_something(){ 
 //Our abstract method declaration
 // TO_DO
 }
}
//We will do it in the following example, in which we define two classes inheriting
//from our abstract class:
class add extends ABC{
 int do_something(){
 return value + 42;
 }
}
class mul extends ABC{
 int do_something(){
 return value * 42;
 }
}
class Test{
 public static void main(String[] args) {
 add x = new add(10);
 mul y = new mul(10);
 System.out.println(x.do_something());
 System.out.println(y.do_something());
 }
}
~~~
~~~
Output
52
420
~~~

