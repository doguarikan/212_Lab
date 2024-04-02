package lab3;

import java.util.Scanner;

public class Main {
	static public Customer[] customerArray = new Customer[2];
	static public Content[] contentArray = new Content[4];

	public static void main(String []args) {
		Scanner scanner2 = new Scanner(System.in);
		int number;
		int selection = 1;
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
			
			switch(selection) {
				case 1:
					Customer cus1 = new Customer();
					customerArray[Customer.getCustomerCount()-1] = cus1;
					break;
					
				case 2:
					DVD dvd = new DVD();
					contentArray[Content.getContentCount()-1] = dvd;
					break;
					
				case 3:
					System.out.printf("enter genre\n");
					String genre = "";
					if (scanner2.hasNextLine()) {
						genre = scanner2.nextLine();
					}
					
					DVD dvdg = new DVD(genre);
					contentArray[Content.getContentCount()-1] = dvdg;
					break;
					
				case 4:
					DigitalMovie mov = new DigitalMovie();
					contentArray[Content.getContentCount()-1] = mov;
					break;
					
				case 5:
					DVD.rentDVD();
					break;
					
				case 6:
					System.out.printf("Enter customer id\n");
					int i = 0;
					int a = scanner2.nextInt();
					scanner2.nextLine();
					while(i!=2) {
						if(a == customerArray[i].getId()) {
							customerArray[i].displayCustomerInfo();
							break ;
						}
						i++;
					}
					break;
					
				case 7:
					System.out.printf("Enter content id\n");
					int j = 0;
					int c = scanner2.nextInt();
					scanner2.nextLine();
					while(j!=4) {
						if(c == contentArray[j].getId()) {
							if(contentArray[j] instanceof DVD)
								contentArray[j].displayContentInfo();
							else if(contentArray[j] instanceof DigitalMovie)
								contentArray[j].displayContentInfo(DigitalMovie.getStreamingService());
							break ;
						}
						j++;
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
