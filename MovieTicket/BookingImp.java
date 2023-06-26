import java.util.*;
class BookingImp implements MovieTicketInfo
  {
    Scanner sc=new Scanner(System.in);
    List<RegisterDataBase> reg=new ArrayList<RegisterDataBase>();
    Map<String,TheaterAdd> tadd=new HashMap<>();
    List<BookingDataBase> bd=new ArrayList<>();
    public void register()
    {
      System.out.println("Enter User first name");
      String user_first_name=sc.nextLine();
      System.out.println("Enter User last name");
      String user_last_name=sc.nextLine();
      System.out.println("Enter User phone number");
      String user_phonenumber=sc.nextLine();
      System.out.println("Enter password");
      String password=checkpass();
      System.out.println("Enter confirm password");
      String confirm_password=sc.nextLine();
      if(password.equals(confirm_password))
      {
        System.out.println("Registeration successfully completed");
        System.out.println("please login to the user phone number and passowrd ");
        reg.add(new RegisterDataBase(user_first_name, user_last_name, user_phonenumber, password, confirm_password));
      }
      else 
      {
        System.out.println("Re-enter user details");
        register();
      }
    }
    String checkpass()
    {
      String str=sc.nextLine();
      if(str.length()>=8 && str.length()<=16){
      int count=0;
      for(int i=0;i<str.length();i++){
        if(str.charAt(i) >='A' && str.charAt(i) <='Z'){
          count=count+1;
          break;
        }
      }
      for(int i=0;i<str.length();i++){
        if(str.charAt(i) >='a' && str.charAt(i) <='z'){
          count=count+1;
          break;
        }
      }
      for(int i=0;i<str.length();i++){
        if(str.charAt(i) >='0' && str.charAt(i) <='9'){
          count=count+1;
          break;
        }
      }
      for(int i=0;i<str.length();i++){
        if(str.charAt(i) =='@' || str.charAt(i) =='#' || str.charAt(i)=='*' || str.charAt(i)=='$'){
          count=count+1;
          break;
        }
      }
      if(count>=4){
        System.out.println("password is valid");
        return str;
      }
      else
        System.out.println("password is invalid, enter password again");
        checkpass();
        return null;
      }
    else
      System.out.println("please enter password atleast minimum 8 to 16 character, please enter again");
      checkpass();
      return null;
      }
    public void signin()
    {
      System.out.println("Enter user phone number");
      String phonenumber=sc.nextLine();
      System.out.println("Enter user password");
      String user_password=sc.nextLine();
      for(RegisterDataBase pass: reg)
        {
      if(phonenumber.equals(pass.getUser_phonenumber()) && (user_password.equals(pass.getPassword())))
      {
        System.out.println("login done!");
      }
      else {
        System.out.println("Please enter correct user phone number and password");
        signin();
      }
    }
    }
      public void theateradd()
      {
        System.out.println("Enter theater ID");
        String theaterId=sc.nextLine();
        System.out.println("Enter theater location");
        String location=sc.nextLine();
        System.out.println("Enter theater name");
        String theaterName=sc.nextLine();
        System.out.println("Enter theater type");
        String theaterType=sc.nextLine();
        System.out.println("Enter how many screens");
        String noOfScreen=sc.nextLine();
        System.out.println("Enter manager contact number");
        String contactNumber=sc.nextLine();
        tadd.put(theaterId,(new TheaterAdd(location, theaterName, theaterType, noOfScreen, contactNumber)));
      }
    public void theaterinfo()
    {
      for (Map.Entry<String,TheaterAdd> entry : tadd.entrySet())
        {
          System.out.println("theater ID = " + entry.getKey() + " , theater info = " + entry.getValue());
        }
    }
    public void bookingticket()
    {
      System.out.println("Enter theter location");
      String location=sc.nextLine();
      System.out.println("Enter theter name");
      String theatername=sc.nextLine();
      System.out.println("Enter movie name");
      String moviename=sc.nextLine();
      System.out.println("Select movie languge \"English\" or \"Telugu\" ");
      String languge=sc.nextLine();
      System.out.println("Enter show date ");
      String showdate=sc.nextLine();
      System.out.println("Select show timing slots like \"11:45\" or \" \"2:45\" or \"6:30\" or \"9:30\" ");
      String showtimingslots=sc.nextLine();
      System.out.println("Select screen number like 1 or 2 or 3");
      String screennumber=sc.nextLine();
      System.out.println("Select category seats like \"Executive seats\" or \"golden seats\" or \"diamond seats\" ");
      String categoryseats=sc.nextLine();
      System.out.println("Select ticket price for each \"Executive seats =100 \" , \"golden seats=160\" and  \"diamond seats=220\"");
      int ticketPrice=sc.nextInt();
      System.out.println("Select how many tickets you want 1,2,5");
      int numberoftickets=sc.nextInt();
      int totalPrice=ticketPrice*numberoftickets;
      System.out.println("Toatal ticket price = " + totalPrice);
      bd.add(new BookingDataBase(location, theatername, moviename, languge, showdate,
			showtimingslots, screennumber, categoryseats, ticketPrice, numberoftickets,
			totalPrice));
    }
  }