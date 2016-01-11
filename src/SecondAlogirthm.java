import java.util.Random;

public class SecondAlogirthm {
	public static int[] shuffle(int []A) {
		// Tron bai
		for (int i = 0; i < A.length; i++) {
			// Select random number
			Random rand = new Random();
			int randNumber = rand.nextInt(100);
			
			// Swap i and that Number random
			A[i] = randNumber;
			
		}
		return A;
	}
	
	public static void main(String[] args) {
		int[] cards = new int[52];
		for(int i = 0; i < 52; i++) {
			cards[i] = i;
		}
		shuffle(cards);
		for (int i = 0; i < cards.length; i++) {
			System.out.println(cards[i]);
		}
	}
}
