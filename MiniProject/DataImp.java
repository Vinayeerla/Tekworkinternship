import java.util.*;
class DataImp implements HospitalInfo
  {
    Map<String, PatientDetails> palist=new HashMap<>();
    Scanner sc=new Scanner(System.in);
    public void addDetails()
    {
      System.out.println("Enter new patient details");
      System.out.println("Enter new patient Id number");
      String patientID=sc.nextLine();
      System.out.println("Enter patient name ");
      String patientName=sc.nextLine();
      int patientAge=readAge();
      System.out.println("Enter patient gender \"male or female\"");
      String patientGender=sc.nextLine();
      long patientAadharNo=readAadharNo();
      long patientContactNo=readPatientContactNo();
      System.out.println("Enter patient city name");
      String patientCity=sc.nextLine();
      System.out.println("Enter patient Address");
      String patientAddress=sc.nextLine();
      System.out.println("Enter patient adimission number");
      String patientAdmission=sc.nextLine();
      System.out.println("Enter patient guardian name");
      String patientGuardianName=sc.nextLine();
      System.out.println("Enter patient guradian address");
      String patientGuardianAddress=sc.nextLine();
      long patientGuardiancontactNo=readGuardianContactNo();
      palist.put(patientID,(new PatientDetails(patientName,patientAge,patientGender,patientAadharNo,patientContactNo,patientCity,patientAddress,patientAdmission,patientGuardianName,patientGuardianAddress,patientGuardiancontactNo) ));
    }
    int readAge()
    {
      System.out.println("Enter patient age");
      String Age=sc.nextLine();
      int count=0;
      if(Age.length()<=2){
        for(int i=0;i<Age.length();i++){
          if(Age.charAt(i) >= '0' && Age.charAt(i) <= '9')
       count+=1;     
        }
      }
      if(count<=2){
         int patientAge=Integer.parseInt(Age);
        return patientAge;
      }
      else {
        System.out.println("please enter patient Age Atleast two integers only");
        readAge();
        return 0;
      }
      }
    long readAadharNo()
    {
      System.out.println("Enter patient Aadhar Number");
      String AadharNo=sc.nextLine();
      int count=0;
      if(AadharNo.length()==12){
        for(int i=0;i<AadharNo.length();i++){
          if(AadharNo.charAt(i) >= '0' && AadharNo.charAt(i) <= '9')
       count+=1;     
        }
      }
      if(count==12){
        long patientAadharNo=Long.parseLong(AadharNo);
        return patientAadharNo;
      }
      else {
        System.out.println("please enter patient Aadhar Number Atleast 12 integers only");
        readAadharNo();
        return 0;
      }
      }
    long readPatientContactNo()
    {
      System.out.println("Enter patient contact number");
      String contactnum=sc.nextLine();
      int count=0;
      if(contactnum.length()==10){
        for(int i=0;i<contactnum.length();i++){
          if(contactnum.charAt(i) >= '0' && contactnum.charAt(i) <= '9')
       count+=1;     
        }
      }
      if(count==10){
       long patientContactNo=Long.parseLong(contactnum);
        return patientContactNo;
      }
      else {
        System.out.println("please enter patient Aadhar Number Atleast 10 integers only");
        readPatientContactNo();
        return 0;
      }
      }

    long readGuardianContactNo()
    {
      System.out.println("Enter patient guradian contact number");
      String GuardiancontactNo=sc.nextLine();
      int count=0;
      if(GuardiancontactNo.length()==10){
        for(int i=0;i<GuardiancontactNo.length();i++){
          if(GuardiancontactNo.charAt(i) >= '0' && GuardiancontactNo.charAt(i) <= '9')
       count+=1;     
        }
      }
      if(count==10){
       long patientGuardiancontactNo=Long.parseLong(GuardiancontactNo);
        return patientGuardiancontactNo;
      }
      else {
        System.out.println("please enter integers only");
        readGuardianContactNo();
        return 0;
      }
      }
    public void viewDetails()
    {
      for (Map.Entry<String,PatientDetails> entry : palist.entrySet()) 
            System.out.println("patientID = " + entry.getKey() + " , patient Details = " + entry.getValue());
    }
    public void searchId()
    {
      if(palist.size()==0)
        System.out.println("no data is available to serach for any PatientId");
      else
      {
        String verify=null;
        System.out.println("Enter patient ID");
        String patientID=sc.nextLine();
        for(Map.Entry<String,PatientDetails> id:palist.entrySet()){
          if(patientID.equals(id.getKey())){
            verify="found";
            System.out.println(palist.get(patientID));
            break;
        }
        try
          {
            if(verify==null)
              throw new NullPointerException();
          }
        catch(NullPointerException n){
          System.out.println("Exception : given patient d " + patientID + "is not matched" );
        }
      }
      }
    }
    public void searchName()
    {
      if(palist.size()==0)
        System.out.println("no data is available to serach for any Patient name");
      else
      {
        System.out.println("Enter patient name");
        String patientName=sc.nextLine();
        String verify=null;
        ArrayList<PatientDetails> names=new ArrayList<>();
        for(PatientDetails name: palist.values())
        {
          if(patientName.equals(name.getPatientName()))
          {
            verify="found";
            names.add(name);
            System.out.println("patient details " + name);
          }
          try
            {
             if(verify==null)
               throw new NullPointerException();
            }
          catch(NullPointerException n){
            System.out.println("Exception :  patient name  " + patientName +  " is not avaiable in Arogya Data Base");
          }
        }
      }
    }
    public void searchCity()
    {
      if(palist.size()==0)
        System.out.println("no data is available to serach for any Patient name");
      else
      {
        System.out.println("Enter patient city name");
        String patientCity=sc.nextLine();
        String verify=null;
        List<PatientDetails> citynames=new ArrayList<>();
        for(PatientDetails cityname:palist.values())
        {
         citynames.add(cityname); if(patientCity.equals(cityname.getPatientCity()))
          {
            
            System.out.println("patient Details = " + citynames);
            break;
          }
          try
          {
            if(verify==null)
              throw new NullPointerException();
          }
        catch(NullPointerException n){
          System.out.println("Exception : given patient city name  " + patientCity + "is not matched in Arogya Data Base" );
        }
        }
      }
    }
    public void searchAge()
    {
      String verify=null;
      System.out.println("Ente patient age from");
      String age1=sc.nextLine();
      int agefrom=Integer.parseInt(age1);
      System.out.println("Enter patient age to");
      String age2=sc.nextLine();
      int ageto=Integer.parseInt(age2);
      ArrayList<PatientDetails> ages=new ArrayList<>();
        for(PatientDetails age: palist.values()){
          if(age.getPatientAge()>=agefrom && age.getPatientAge()<=ageto)
          {
            ages.add(age);
            System.out.println("patient Details = " + ages);
          }
          try
          {
            if(verify==null)
              throw new NullPointerException();
          }
        catch(NullPointerException n){
          System.out.println("Error : given age range from  " + agefrom + " to "+ ageto + " is not matched Arogya Data Base" );
        }
    }
    }
    public void recovery()
    {
      if(palist.size()==0)
        System.out.println("no data is available to serach for any Patient name");
      else
      {
        System.out.println("Enter patient id to check he/she recovered or not");
        String ID=sc.nextLine();
        String verify=null;
        Set<String> ids=palist.keySet();
        for(String id: ids)
          {
            if(ID.equals(id))
            {
              verify="found";
              palist.remove(ID);
              break;
            }
          }
        try
          {
            if(verify==null)
              throw new NullPointerException();
          }
        catch(NullPointerException n){
          System.out.println("Exception : given id " + ID + "is not matched Arogya Data Base" );
        }
      }
    }
  }