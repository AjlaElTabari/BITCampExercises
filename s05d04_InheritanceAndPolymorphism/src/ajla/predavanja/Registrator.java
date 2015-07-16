package ajla.predavanja;

public class Registrator {

	public void Register(LandVehicle lv) {
		System.out.println("Registrated vehicle " + lv.getRegistration());
	}
	public static void main(String[] args) {
		LandVehicle lv1 =  new LandVehicle("L23-T654", 2015, 5, 3); 
	}

}
