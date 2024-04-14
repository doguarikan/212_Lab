package lab3;
import java.util.Scanner;

public class Customer {
	static private int customerCount = 0;
	private int id;
	private int postCode;
	private int age;
	private String name;
	private String surname;
	private String email;
	
	Customer(){
		Scanner scanner = new Scanner(System.in);
		customerCount++;
		System.out.printf("Customer #%d\n",customerCount);
		System.out.printf("Enter id\n");
		setId(scanner.nextInt());
		scanner.nextLine();
		
		System.out.printf("Enter name\n");
		setName(scanner.nextLine());
		
		System.out.printf("Enter surname\n");
		setSurname(scanner.nextLine());
		
		System.out.printf("Enter age\n");
		setAge(scanner.nextInt());
		scanner.nextLine();
		System.out.printf("Enter postal code\n");
		setPostCode(scanner.nextInt());
		scanner.nextLine();
		System.out.printf("Enter email\n");
		setEmail(scanner.nextLine());
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public static int getCustomerCount() {
		return customerCount;
	}
	
	public void displayCustomerInfo() {
		System.out.printf("id: %d\n",this.id);
		System.out.printf("name: %s\n",this.name);
		System.out.printf("surname: %s\n",this.surname);
		System.out.printf("age: %d\n",this.age);
		System.out.printf("postal code: %d\n",this.postCode);
		System.out.printf("email: %s\n",this.email);
	}
	
	public static void main(String []args) {
		
		Customer cus1 = new Customer();
		Customer cus2 = new Customer();
		Customer cus3 = new Customer();
		
		Scanner scanner2 = new Scanner(System.in);
		int number;
		int selection;
		do {
			System.out.printf("1. Display Customer #1\n");
			System.out.printf("2. Display Customer #2\n");
			System.out.printf("3. Display Customer #3\n");
			System.out.printf("4. Display number of customers\n");
			System.out.printf("0. Exit\n");
			selection = scanner2.nextInt();
			
			switch(selection) {
				case 1:
					cus1.displayCustomerInfo();
					break;
				case 2:
					cus2.displayCustomerInfo();
					break;
				case 3:
					cus3.displayCustomerInfo();
					break;
				case 4:
					number = getCustomerCount();
					System.out.printf("Number of customers:%d\n",number);
					break;
				case 0:
					break;
			}
		}
		while(selection != 0);
		
	}
}
