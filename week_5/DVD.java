import java.util.Scanner;

public class DVD extends Content{
	private Date rentDate;
	private String gen;
	static private int dvdCount = 0;

	////////////////////////////////////////////////////////
	
	public DVD(){
		super();
		dvdCount++;
	}
	
	public DVD(String gen) {
		super(gen);
		dvdCount++;
	}
	
	public Date getRentDate() {
		return rentDate;
	}
	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}
	public static int getDvdCount() {
		return dvdCount;
	}
	
	public void displayDVDInfo() {
		super.displayContentInfo();
	}
	
	////////////////////////////////////////////////////////
	
	public static void rentDVD() {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter customer id ");
		scanner.nextInt();
		scanner.nextLine();
		
		System.out.printf("Enter DVD id ");
		scanner.nextInt();
		scanner.nextLine();
		
		System.out.printf("Enter Day ");
		scanner.nextInt();
		
		System.out.printf("Enter Month ");
		scanner.nextInt();
		
		System.out.printf("Enter Year ");
		scanner.nextInt();
	}
}
