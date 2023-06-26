import java.util.*;
class Student{
  private int id;
  private String name;
  private int age;
  private int marks;

  Student(int id, String name, int age, int marks){
    this.id=id;
    this.name=name;
    this.age=age;
    this.marks=marks;
  }

  public void setId(int id){
    this.id=id;
  }

  public int getId(){
    return id;
  }

  public void setName(String name){
    this.name=name;
  }

  public String getName(){
    return name;
  }

  public void setAge(int age){
    this.age=age;
  }

  public int getAge(){
    return age;
  }

  public void setMarks(int marks){
    this.marks=marks;
  }

  public int getMarks(){
    return marks;
  }
  
}

class A extends Student{
  public void addDetails(){
    
  }
}
class StudentSet{
  public static void main(String []args){
    Student student1=new Student(2, "vinay", 7, 8);
    HashSet<Student> studentDetails=new HashSet<>();
    studentDetails.add(student1);
    System.out.println("Student Id: " + student1.getId()+"\n"+ "Student Name: " + student1.getName()+"\n"+ "Student age: "+ student1.getAge()+"\n"+ "Student marks: " + student1.getMarks());
  }
}