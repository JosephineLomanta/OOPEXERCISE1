public class BicycleRegistration
{
	public static void main(String [] args) {
		Bicycle bike1, bike2;
		String owner1, owner2;
		Bicycle bike;
		
		bike1 = new Bicycle();
		bike1.setOwnerName("Josephine Lomanta");
		
		bike2 = new Bicycle();
		bike2.setOwnerName("Chiella Entero");
		
		bike = new Bicycle();
		bike.settagNo("2004-134R");
		
		owner1 = bike1.getOwnerName();
		owner2 = bike2.getOwnerName();
		String tag = bike.getTagNo();
		
		System.out.println(owner1 + " owns a bicycle.");
		System.out.println(owner2 + " also owns a bicycle.");
		System.out.println(tag + " is the bicycle's tag number.");
	}
}
