class Demo{
      public Demo(){
         System.out.println("This is public class constructor");
}
}
class Chaining extends Demo{
       public Chaining(){
         super();
System.out.println("This is default constructor");
}
public Chaining(String str){
    this();
  System.out.println("This is parameterised Constructor");
}
public Chaining(String s,int num){
        this("Balaji");
System.out.println("This is two parameterised constructor");
}
public Chaining(int n1, int n2, int n3){
   this("Balu",21);
System.out.println("This is three parameterised constructor");
}
}
class TestSuper3{ 
public static void main(String args[]){
Chaining c = new Chaining(2,3,6);
}
}