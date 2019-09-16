
public class House {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("This is the house that Jack built.");
		System.out.println("This is the malt");
		Home();
		System.out.println("This is the rat,");
		Malt();
		Home();
		System.out.println("This is the cat,");
		Message();
		System.out.println("This is the dog,");
		Cat();
		Message();
		System.out.println("This is the cow with the crumpled horn,");
		Message2();
		System.out.println("This is the maiden all forlorn,");
		System.out.println("That milked the cow with the crumpled horn,");
		Message2();
	}
		public static void Home() {
		System.out.println("That lay in the house that Jack built.");
		System.out.println("");
		}
		
		public static void Malt() {
		System.out.println("That ate the malt");
		
		}
		
		
		public static void Rat() {
		System.out.println("That killed the rat,");
		}
		
		public static void Cat() {
		System.out.println("That worried the cat,");
		}
		public static void Dog() {
		System.out.println("That tossed the dog,");
		
	}
		public static void Message() {
		Rat();
		Malt();
		Home();
		}
		public static void Message2() {
		Dog();
		Cat();
		Message();
	}

}
