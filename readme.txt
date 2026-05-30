Classes and Objects
     
Classes :  
   Classes are template or blue print for creating an object and classes will consist of
        * attribute
        * constructors 
        * methods
general class structure 
public class classname{
    
    datatype attributename;     attribute 
    
    public classname(parameters){}  constructors
    
    public void methodname(parameters){} methods

}        
--------------------------------------------------------------------------------------------
Objects:
  objects are the real world entity that will act as instances of class with actual values 
  
  Scanner sc= new Scanner(System.in);   sc is the object
  
---------------------------------------------------------------------------------------------------
Attributes: 
   attributes are the instant variable that belong to the class and stores the data for each object 
       datatype attributename;
       
types in attribute:
    * primitive datatype attributes  - int number;
    * reference datatype attributes  - String name; string[] skills;
    * custom object attributes       - objname[] names;
 
--------------------------------------------------------------------------------------------------
constructors: 
   constructors are special methods that is used to initialize the objects and created with class name 
and has no return type this keyword is used to assign parameter to attributes  

constructors must be in class name 
       class age{
          public age(int age){}
       }
    
constructors has no return type 
         public class name(int data){}
         
constructors initialize using this keyword       
         this.atrributename=parameter name;       
       
--------------------------------------------------------------------------------------------------       
methods:
   methods/functions are the block of code that perform the specific tasks. this is behaviour/actions of of the object
and made the code reusable.
every method has separate stack memory 
types of methods        
       * with argument with return type 
       * with argument without return type
       * without argument with return type
       * without argument without return type
----------------------------------------------------------------------------------------------------------
OOPs in java:
   object oriented programming system is organising software that is based on object rather than function and loops.
object is  self contained unit that has attributes and methods

Four pillars of oops:
      * Encapsulation
      * Abstraction
      * Inheritance
      * Polymorphism
 
---------------------------------------------------------------------------------------------------------     
Encapsulation: 
   Its the process that involves wrapping the data attributes and methods all together in single class and restricting
direct access to the data variable from outside is called Encapsulation.
class demo{
   dataattributes;
   methods(){}
   main method{}
   }
-----------------------------------------------------------------------------------------------------------------
Abstraction:
          
       
       
       
       
       