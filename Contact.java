public class Contact {

    private String name; // Stores name of Contact
    private int age;  // Stores age of Contact
    private int phonenumber; // Stores phone number of contact
    private int bday;  // Stores birthday in an int

    // Creates Contact object based on parameters.
    public Contact(String n, int a, int p, int month, int day) {
		name = n;
		age = a;
		phonenumber = p;
		bday = 100*month + day;
    }

    // Changes phone number of contact
    public void changeNumber(int newnum) {
		phonenumber = newnum;
    }

    // Implements the passing of Contact's birthday.
    public void Birthday() {
		age++;
    }

    // Returns the name of a Contact
    public String getName() {
		return name;
    }

    // Returns the age of a Contact
    public int getAge() {
		return age;
    }

    // Returns the phone number of a Contact
    public int getNumber() {
		return phonenumber;
    }

    // Prints all information about a contact out.
    public void printContact() {
		System.out.print("Name: " + name + " Age: " + age + " Phone#: " + phonenumber);
		System.out.println(" Birthday: " + getBdayMonth() + "/" + getBdayDay());
    }

    // Returns month of Contact's birthday
    public int getBdayMonth() {
		return bday/100;
    }
    
    // Returns day of the month of Contact's birthday
    public int getBdayDay() {
		return bday%100;
    }
	/*
	Scanner scan = new Scanner(System.in);
	AddressBook book = new Addressbook();
	menu(); calls the menu method
	int choice = scan.nextInt;
	while choice != 5{
	if(choice == 1) 
	{
	}
	}
	public static void menu(){
	System.out.println("Enter the number.")
	System.out.println("1. Add Contact");
	System.out.println("2. Delete Contact");
	System.out.println("3. Print # of Friends");
	System.out.println("4. Print Info");
	System.out.println("5. Quit");
	
	*/
	

}
