package vjezbe;

public class Main {

	public static void main(String[] args) {
		Tiger t = new Tiger(true, 150.0, Animal.ANOTHER_ANIMALS, 100, 300.0, Tiger.HUNTING);
		System.out.println(t);
		
		Zebra z = new Zebra(true, 150, Animal.PLANTS, 24, 100, Zebra.ILL);
		System.out.println(z);
		
		Plant p = new Plant(true, false, Plant.THERE_IS_A_LOT);

		t.eat(t);
		t.eat(z);
		z.eat(z);
		z.eat(t);
		z.eat(p);
		
	}

}
