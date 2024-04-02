import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	static ArrayList <Customer> customerArray = new ArrayList<Customer>();
	static ArrayList <Content> contentArray = new ArrayList<Content>();

	public static void main(String []args) {
		Scanner scanner2 = new Scanner(System.in);
		int number;
		int selection = 1;
		
		////////////////////////////////////////////////////////
		
		do {
			System.out.printf("1. Create a new Customer\n" + 
					"2. Create a new DVD\n" + 
					"3. Create a new DVD with genre\n" + 
					"4. Create new Digital Movie \n" +
					"5. Rent a DVD\n" + 
					"6. Display Customer Information\n" + 
					"7. Display Content Information\n" +
					"8. Display number of customers.\n" + 
					"0. Exit\n");
			
			if (scanner2.hasNextInt()) {
				selection = scanner2.nextInt();
				scanner2.nextLine();
			}
			
		////////////////////////////////////////////////////////
			
			switch(selection) {
				case 1:
					Customer cus1 = new Customer();
					customerArray.add(cus1);
					break;
					
				case 2:
					DVD dvd = new DVD();
					contentArray.add(dvd);
					break;
					
				case 3:
					System.out.printf("enter genre\n");
					String genre = "";
					if (scanner2.hasNextLine()) {
						genre = scanner2.nextLine();
					}
					
					DVD dvdg = new DVD(genre);
					contentArray.add(dvdg);
					break;
					
				case 4:
					DigitalMovie mov = new DigitalMovie();
					contentArray.add(mov);
					break;
					
				case 5:
					DVD.rentDVD();
					break;
					
				case 6:
					System.out.printf("Enter customer id\n");
					int cus = Customer.getCustomerCount();
					int a = scanner2.nextInt();
					scanner2.nextLine();
					ListIterator <Customer> cusiter = customerArray.listIterator();
					
					while(cus != 0){
						cusiter.next();
						cus--;
					}
					
					Customer tmp;
					while(cusiter.hasPrevious()) {
						tmp = cusiter.previous();
						if(a == tmp.getId()) {
							tmp.displayCustomerInfo();
							break ;
						}
					}
					
					break;
					
				case 7:
					System.out.printf("Enter content id\n");
					int c = scanner2.nextInt();
					int con = Content.getContentCount();
					scanner2.nextLine();
					ListIterator <Content> coniter = contentArray.listIterator();
					
					while(con != 0) {
						coniter.next();
						con--;
					}
					
					Content temp;
					while(coniter.hasPrevious()) {
						temp = coniter.previous();
						if(c == temp.getId()) {
							if(temp instanceof DVD)
								temp.displayContentInfo();
							else if(temp instanceof DigitalMovie)
								temp.displayContentInfo(DigitalMovie.getStreamingService());
							break ;
						}
					}
					
					break;
					
				case 8:
					number = Customer.getCustomerCount();
					System.out.printf("Number of customers: %d\n",number);
					break;
					
				case 0:
					break;
			}
		}
		while(selection != 0);
	}
}
