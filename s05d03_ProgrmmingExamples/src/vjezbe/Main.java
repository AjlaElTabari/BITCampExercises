package vjezbe;

public class Main {

	public static void main(String[] args) {
		MobilePhoneSpeakers mps1 = new MobilePhoneSpeakers("LG", 4.0, 80.60);
		
		System.out.println(mps1);
		mps1.enable();
		System.out.println(mps1);
		mps1.increaseVolume();
		System.out.println(mps1);
		mps1.increaseVolume();
		System.out.println(mps1);
		mps1.lowerVolume();
		System.out.println(mps1);
		
		Battery b1 = new Battery("Sony", 5);
		System.out.println(b1);
		
		b1.chargeTheBattery(50);
		System.out.println(b1);
		
		b1.decreaseBattery(25);
		System.out.println(b1);
		
		b1.decreaseBattery(85);
		System.out.println(b1);
		
		b1.chargeTheBattery(120);
		System.out.println(b1);
		
		Antenna a1 = new Antenna("Philips", 3);
		System.out.println(a1);
		
		System.out.println(a1.isSignalValid(4, "SMS38761236352"));
		
		Display d1 = new Display("Sony", 16.0);
		System.out.println(d1);
		
		d1.enable();
		System.out.println(d1);
		
		d1.lowerBrihthness();
		System.out.println(d1);
		d1.lowerBrihthness();
		System.out.println(d1);
		d1.lowerBrihthness();
		System.out.println(d1);
		d1.lowerBrihthness();
		System.out.println(d1);
		

		d1.increaseBrihthness();
		System.out.println(d1);
		
		MobilePhone mob = new MobilePhone("Nexus 5", 5, "red", true, b1, d1, a1, mps1);
		System.out.println(mob);
		
		mob.getBatteryConsumption(60);
	}
	

}
