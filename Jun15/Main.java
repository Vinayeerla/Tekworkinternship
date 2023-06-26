class Student{
  String name;
  int id;
  int age;

  Student(String n, int i, int a){
    name=n;
    age=a;
    id=i;
  }

  public void studentAttendence(){
    System.out.println("Student method");
  }
}
class Student1 extends Student{
  int marks;
  Student1(int marks,int id, String name, int age){
    super(name, id, age);
    this.marks=marks;
  }
  public void studentAttendence(){
    System.out.println("Student method is overriding");
  }

  public void display(){
    System.out.println(name + " " + id + " " + age + " " + marks );
  }
}
class Main{
  public static void main(String []args){
    Student1 st1=new Student1(23, 34,"vinay",32);
    
    st1.display();
  }
}