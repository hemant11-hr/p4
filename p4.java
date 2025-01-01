package assignment4; class Animal  
{   
}  
public void move()  
{  
}  
System.out.println("Animals can move");  
class Dog extends Animal  
{   
//Method Overriding     
public void move()  
{  
}  
System.out.println("Dogs can walk and run");  
//Method Overloading  
void add(int a,int b)  
{  
}  
int s=a+b;  
System.out.println("Sum="+s);  
void add(int a,int b,int c)  
{  
}  
}  
int s=a+b+c;  
System.out.println("Sum="+s);  
public class Assignment4   
{  
10  
public static void main(String[] args)   
11  
  
    {  
        Animal a =new Animal();          
Animal b =new Dog();   
        a.move();  
        b.move();  
          
        Dog d=new Dog();   
        d.add(10,20);  
        d.add(10,20,30);  
   }  
}
