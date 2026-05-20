//Create a contact list application using a HashMap to store contact information
//like name, phone number, and email. Implement functionalities to add contacts,
//retrieve details based on the name, and remove contacts.


import java.util.HashMap;

class Contact{
    String name, email, phoneNumber;

    public String getName() {
        return name;
    }

    public Contact(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

class ContactRecords {
    HashMap<String,Contact> records;

    ContactRecords(HashMap<String, Contact> records){
        this.records = records;
    }

    void add(Contact c){
        this.records.put(c.name,c);
    }

    Contact findByName(String name){
        return records.get(name);
    }

    void remove(String name){
        records.remove(name);
    }

    void display(){
        records.forEach((key,value)-> System.out.println(value));
    }
}
public class ContactListApplication {
    void main(){
        HashMap<String, Contact> rec = new HashMap<>();
        ContactRecords cr = new ContactRecords(rec);
        cr.add(new Contact("Shivam", "Shivam.sah2020t@gmail.com", "836868583"));
        cr.add(new Contact("Alok", "mrxgupta@mail.com", "948294743"));
        cr.add(new Contact("Kirish", "kirish922@mail.com", "948344743"));
        cr.display();
        System.out.println("********************");
        System.out.println(cr.findByName("Alok"));
        System.out.println("********************");
        cr.remove("Alok");
        cr.display();
    }
}
