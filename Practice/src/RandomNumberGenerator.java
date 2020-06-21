import java.util.Random;

public class RandomNumberGenerator {
	public static void main(String[] args) {
		Random r = new Random();
		int low = 1;
		int high = 6;
		int result = r.nextInt(high-low) + low;
		System.out.println(result);
	}
}
