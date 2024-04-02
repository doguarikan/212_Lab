package lab3;
import java.util.Scanner;

public class DigitalMovie extends Content {
	private static String streamingService;
	
	public static String getStreamingService() {
		return streamingService;
	}
	public static void setStreamingService(String streamingService) {
		DigitalMovie.streamingService = streamingService;
	}
	public DigitalMovie(){
		super();
		Scanner scanner2 = new Scanner(System.in);
		System.out.printf("Enter streaming service\n");
		streamingService = scanner2.nextLine();
	}
	public void diplayContentInfo() {
		super.displayContentInfo(streamingService);
	}
}
