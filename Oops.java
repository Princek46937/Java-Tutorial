


//Object => Instance of class

//Note => When the class is defines it should not allocated in memory until the object is created
//when the object is created automatically class is allocated in memory


//class
// class Person{

//     //properties/data/type
//     String name;
//     int age;

//     //Constructor    => Called initially when the code executed

//     //Default Constructor => Without Parameter 
//     public Person(){
//         System.out.println("Default Constructor");
//     }

//     //Parameterized Constructor => With parameter
//     public Person(String name, int age){
//         this.name = name;
//         this.age = age;
//     }

//     //Copy Constructor => Copy of Object 
//     public Person(Person p2){
//         this.name = p2.name;
//         this.age = p2.age;
//     }

//     //method => that operate on data
//     public void display(){
//         System.out.println(name + age);
//     }
// }

// public class Oops{
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         //Create object for class
//         Person p1 = new Person();
        
//         // p1.name = "Rahul";
//         // p1.age = 20;
        
//         //Take input from user
//         p1.name = sc.nextLine();
//         p1.age = sc.nextInt();
        
        
//         //Accessing the field
//         // String myName = p1.name;
//         // int myAge = p1.age;
        
//         // System.out.println(myName);
//         // System.out.println(myAge);
        
        
//         //Another Object => Copy of p1 is store in p2
//         Person p2 = new Person(p1);


//         // p1.display();
//         p2.display();
        
//     }
// }
// class Student{
//     String name;
//     int age;

//     //Constructor
//     public Student(String name, int age){
//         this.name = name;
//         this.age = age;
//     }

//     //Copy Constructor => copy object
//     public Student(Student s1){
//         this.name = s1.name;
//         this.age = s1.age;
//     }

//     //Polymorphism => 
//     //Compiletime polymorphism => during compilation 
//     //Runtime polymorphism => during runtime it is more dangerous
//     public void personInfo(String name){
//         System.out.println(name);
//     }

//     public void personInfo(int age){
//         System.out.println(age);
//     }

//     public void personInfo(String name, int age){
//         System.out.println(name);
//         System.out.println(age);
//     }
// }

// public class Oops{
//     public static void main(String[] args) {

//         Student s = new Student("Prince ", 23);
//         Student s1 = new Student(s);

//         s1.personInfo(s1.name, s1.age);
//     }
// }



/**********************************************Inheritance ***************************************/
//One class Inherit their properties or method from another class


// class Shape{

//     //Field/data

//     public void area(){
//         System.out.println("Display Area");
//     }
// }

//     //Single Level Inheritance => parent class -> subclass
// class Traingle extends Shape{

//     public Traingle(int l,int b){
//         System.out.println(1/2*l*b);
//     }
        
//     // public void area(int l, int b){
//     //     System.out.println("Area of Traingle is "+1/2*l*b);
//     // }
// }

//     //MultiLevel Inheritance => parent class -> sublass -> subclass
// class EquilateralTraingle extends Shape{
//     public void area(int l, int b){
//         System.out.println("Area of Equilateral Traingle is "+(l*b)/2);
//     }
// }

//     //Hierarchical Inheritance => multiple class inherit from single superclass
// class Circle extends Shape{
//     public void area(int r){
//         System.out.println("Area of Circle is "+(3.14*r*r));
//     }


// }


// public class Oops{
//     public static void main(String[] args) {
//         Traingle t1 = new Traingle(3,2);
//         Circle c1 = new Circle();
//         EquilateralTraingle et1 = new EquilateralTraingle();
        
//         c1.area();
//         et1.area();
        

//         System.out.println(t1);
        
        
//     }
// }


/********************************Abstraction****************************************************/
// abstract class Student{
//     String name;
//     int age;

//     public void display(){
//         System.out.println("Prince");
//     }
// }

// class Prince extends Student{
//     public void display(){
//         System.out.println("Prince jha");
//     }
    
// }

// public class Oops{
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.display();
//     }
// }



/*****************************************Interface ***************************************/

// interface Person{
//     public void eat();      
// }

// interface Jha{
//     public void sleep();
// }

// //Multiple Interface
// class Prince implements Person, Jha{
//     public void eat(){
//         System.out.println("Prince is Good Boy");
//     }
//     public void sleep(){
//         System.out.println("Prince is Sleeping");
//     }
// }



// public class Oops{
//     public static void main(String[] args) {
//         Prince p = new Prince();

//         p.eat();
//         p.sleep();
        
//     }

// }






