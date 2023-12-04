package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Person myPerson = new Person("Alex", "Paton", "181");
        System.out.println(myPerson.toString());

        Customer myCustomer = new Customer();
        Customer myCustomer2 = new Customer("Shine", "Galway", "4890", "167h", true);

        myCustomer.setName("Pero");
        myCustomer.setAddress("Athenry");
        myCustomer.setPhone("847");
        myCustomer.setCustNo("69");
        myCustomer.setMailingList(true);

        System.out.println("Customer 1: name: "+ myCustomer.getName() + " address: "+ myCustomer.getAddress()+
                " phoneNo. " + myCustomer.getPhone() +"customerNo. "+ myCustomer.getCustNo() + " Mailing list " + myCustomer.isMailingList());
        System.out.println("Customer 2: name: "+ myCustomer2.getName() + " address: "+ myCustomer2.getAddress()+
                " phoneNo. " + myCustomer2.getPhone() +"customerNo. "+ myCustomer2.getCustNo() + " Mailing list " + myCustomer2.isMailingList());



        System.out.println(myCustomer2.toString());


    }
}