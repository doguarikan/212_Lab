import java.util.Scanner;

public class Content {
	public int id;
	public int length;
	public static int contentCount = 0;
	public String title;
	public String artist;
	public String genre;
	public double costPerDay = 1.0;
	
	////////////////////////////////////////////////////////
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public static int getContentCount() {
		return contentCount;
	}
	public static void setContentCount(int contentCount) {
		contentCount = contentCount;
	}
	
	////////////////////////////////////////////////////////
	
	public Content(){
		contentCount++;
		Scanner scanner2 = new Scanner(System.in);
		System.out.printf("enter id\n");
		id = scanner2.nextInt();
		scanner2.nextLine();
		
		System.out.printf("enter title\n");
		title = scanner2.nextLine();
		
		System.out.printf("enter artist\n");
		artist = scanner2.nextLine();
		
		System.out.printf("enter lenght\n");
		length = scanner2.nextInt();
		
		scanner2.nextLine();
	}
	
	public Content(String genre){
		contentCount++;
		Scanner scanner2 = new Scanner(System.in);
		
		System.out.printf("enter id\n");
		id = scanner2.nextInt();
		scanner2.nextLine();
		
		System.out.printf("enter title\n");
		title = scanner2.nextLine();
		
		System.out.printf("enter artist\n");
		artist = scanner2.nextLine();
		
		System.out.printf("enter lenght\n");
		length = scanner2.nextInt();
		
		this.genre = genre;
		
		scanner2.nextLine();
	}
	
	////////////////////////////////////////////////////////
	
	public void displayContentInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("id: %d\n",this.id);
		System.out.printf("title: %s\n",this.title);
		System.out.printf("artist: %s\n",this.artist);
		System.out.printf("genre: %s\n",this.genre);
		System.out.printf("length(in minutes): %d\n",this.length);
		
		System.out.printf("How long would you like to rent that DVD?\n");
		int duration = scanner.nextInt();
		scanner.nextLine();
		System.out.printf("The rental cost for %d days is $%.2f\n\n",duration,calculateCost(duration));
	}
	
	public void displayContentInfo(String streamingService) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("id: %d\n",this.id);
		System.out.printf("title: %s\n",this.title);
		System.out.printf("artist: %s\n",this.artist);
		System.out.printf("length(in minutes): %d\n",this.length);
		System.out.printf("streaming service: %s\n",streamingService);
		System.out.printf("How long would you like to rent that Digital Movie?\n");
		int duration = scanner.nextInt();
		scanner.nextLine();
		System.out.printf("The rental cost for %d days is $%.2f\n\n",duration,calculateCost(duration));
	}
	
	public double calculateCost(int duration) {
		double cost = costPerDay*duration;
		return cost;
	}
}
