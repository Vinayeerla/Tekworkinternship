/*You have been tasked with creating a phone directory using the HashMap data structure in Java. The phone directory should store the names and phone numbers of individuals. Implement the following functionalities:

Add a contact: Allow the user to add a new contact to the phone directory. The user should provide the name and phone number of the contact.

Remove a contact: Allow the user to remove a contact from the phone directory. The user should provide the name of the contact to be removed.

Search for a contact: Allow the user to search for a contact by name. If the contact is found, display the corresponding phone number. If the contact is not found, display a message indicating that the contact was not found.

Display all contacts: Display all the contacts in the phone directory, along with their corresponding phone numbers.

Implement the PhoneDirectory class that internally uses a HashMap to store the contacts. The keys in the HashMap should be the names of the contacts (String), and the values should be the phone numbers (String).

Write a main method to demonstrate the functionality of the PhoneDirectory class. Create an instance of the PhoneDirectory class and perform the following operations:

Add at least five contacts to the phone directory.
Search for a contact by name and display the phone number.
Remove a contact from the phone directory.
Display all the contacts in the phone directory.*/
import java.util.*;
class PhoneDirectory{
  Scanner sc=new Scanner(System.in);
  HashMap<String, String> contact=new HashMap<>();
  public void addContact(){
    System.out.println("enter name");
    String name=sc.nextLine();
    System.out.println("enter number");
    String phnNum=sc.nextLine();
    contact.put(name,phnNum);
  }
  public void deleteContact(String name){
    contact.remove(name);
  }

  public void searchByName(String name){
    if(contact.size()==0)
        System.out.println("no data is available");
      else{
        String verify=null;
        for(Map.Entry<String,String> id:contact.entrySet()){
          if(name.equals(id.getKey())){
            verify="found";
            System.out.println(contact.get(name));
            break;
          }
        }
        if(verify==null){
      System.out.println("conatct is not avaiable");
      }
    }
  }

  public void displayContact(){
    if(contact.size()==0)
        System.out.println("no data is available ");
    else {
      for (Map.Entry<String,String> entry : contact.entrySet()) 
            System.out.println("Name = " + entry.getKey() +"\n" + "phone number  = " + entry.getValue());
    }
  }

  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    PhoneDirectory pd=new PhoneDirectory();
    for(int i=0; i<2; i++)
      pd.addContact();
    System.out.println("contact details: ");
    pd.displayContact();
    System.out.println("Enter name for searching contact");
    String name=sc.nextLine();
    pd.searchByName(name);
    System.out.println("Enter name to delete contact");
    String na=sc.nextLine();
    pd.deleteContact(na);
    System.out.println("Rest of the contact details");
    pd.displayContact();
  }
}