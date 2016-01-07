import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createPokerList();
	}
	
	public static void createPokerList(){
		List<Integer> pokerList = new ArrayList<>();
		for (int i = 0; i < 52; i++) {
			pokerList.add(i);
		}
		System.out.println(" List before swap:");
		showPokeList(pokerList);
		swapPokerList(pokerList);
		System.out.println("");
		System.out.println(" List after swap:");
		showPokeList(pokerList);
		System.out.println("");
		System.out.println(" Dealing poker:");
		dealPoker(pokerList);
	}
	
	public static void showPokeList(List<Integer> pokerList){
		for (int i = 0; i < pokerList.size(); i++) {
			System.out.print(" | " + pokerList.get(i));
		}
	}
	
	public static void swapPokerList(List<Integer> pokerList){
		for (int i = 0; i < pokerList.size(); i++) {
			swapPokerPair(pokerList, getRandomIndex());
		}
	}
	
	public static List<Integer> getRandomIndex(){
		List<Integer> indexList = new ArrayList<>();
		Random rand = new Random(); 
		int index1 = 0, index2 = 0;
		while(index1 == index2){
			index1 = rand.nextInt(52);
			index2 = rand.nextInt(52);
		}
		indexList.add(index1);
		indexList.add(index2);
		return indexList;
	}
	
	public static void swapPokerPair(List<Integer> pokerList, List<Integer> indexList){
		int mediateCard;
		mediateCard = pokerList.get(indexList.get(0));
		pokerList.set(indexList.get(0), pokerList.get(indexList.get(1)));
		pokerList.set(indexList.get(1), mediateCard);
	}
	
	public static void dealPoker(List<Integer> pokerList){
		int i = 0;
		List<Integer> listOfHuman1 = new ArrayList<>();
		List<Integer> listOfHuman2 = new ArrayList<>();
		List<Integer> listOfHuman3 = new ArrayList<>();
		List<Integer> listOfHuman4 = new ArrayList<>();
		while (i < 51) {
			listOfHuman1.add(pokerList.get(i));
			listOfHuman2.add(pokerList.get(i+1));
			listOfHuman3.add(pokerList.get(i+2));
			listOfHuman4.add(pokerList.get(i+3));
			if (i < 51) {
				i = i + 4;
			}
		}
		System.out.println("Poker card list of human 1:");
		showPokeList(listOfHuman1);
		System.out.println("");
		System.out.println("Poker card list of human 2:");
		showPokeList(listOfHuman2);
		System.out.println("");
		System.out.println("Poker card list of human 3:");
		showPokeList(listOfHuman3);
		System.out.println("");
		System.out.println("Poker card list of human 4:");
		showPokeList(listOfHuman4);
	}
}
