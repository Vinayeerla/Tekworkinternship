interface Study{
  void studyMaterials();
  void submitAssignment();
}

abstract class Student{
  private int id;
  private String name;
  private int grade;
  Student(int id, String name, int grade){
    this.id=id;
    this.name=name;
    this.grade=grade;
  }
  public int getId(){
    return id;
  }

  public void setId(int id){
    this.id=id;
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name=name;
  }

  public int getGrade(){
    return grade;
  }

  public void setGrade(int grade){
    this.grade=grade;
  }
  
}

class RegularStudent extends Student implements Study{
  private String department;

  RegularStudent(int id, String name, int grade, String department){
    super(id, name, grade);
    this.department=department;
  }
  public String getDepartment(){
    return department;
  }

  public void setDepartment(){
    this.department=department;
  }

  public void studyMaterials(){
    System.out.println("Study materials are avaiable");
  }

  public void submitAssignment(){
    System.out.println(" Assignment Submitted");
  }
  
}

class DistanceLearningStudent extends Student{
  private String location;
  

  DistanceLearningStudent(int id, String name, int grade, String department, String locatio){
    super(id, name, grade);
    this.location=location;
  }

  public String getLocation(){
    return location;
  }

  public void setLocation(String location){
    this.location=location;
  }

  public void studyMaterials(){
    System.out.println("Study materials are avaiable ");
  }

  public void submitAssignment(){
    System.out.println(" Assignment Submitted");
  }
  
}

class StudentMain{
  public static void main(String []args){
    RegularStudent rs= new RegularStudent(425,"vinay",10,"cc");
    DistanceLearningStudent dls=new DistanceLearningStudent(55, "fff", 22, "ddd", "sff");
    System.out.println(dls.getId()+"\n"+dls.getName()+"\n"+dls.getGrade()+"\n"+rs.getDepartment()+"\n"+dls.getLocation());
    rs.submitAssignment();
    rs.studyMaterials();
    dls.submitAssignment();
    dls.studyMaterials();
  }
}