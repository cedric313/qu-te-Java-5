import java.util.Arrays;

class tableau {

	
	public static void main(String...args) {
	
		
		String[] weaponsIndiana = {"whip", "gun" , "saber"};
		String[] weaponsHelen = {"knife", "shield" ,};
		String[] weaponsRavenwood = {"belt", "dagger" , "gun"};
		Arrays.sort(weaponsIndiana);
		Arrays.sort(weaponsHelen);
		Arrays.sort(weaponsRavenwood);
		

		String[][] weapons;
		weapons = new String[][] {
		
			weaponsIndiana,
			weaponsHelen,
			weaponsRavenwood

			

		};
		
		System.out.println(Arrays.toString(weapons[0]));
		System.out.println(Arrays.toString(weapons[1]));
		System.out.println(Arrays.toString(weapons[2]));
		

	}

}
