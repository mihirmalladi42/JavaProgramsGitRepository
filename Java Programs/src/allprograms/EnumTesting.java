package allprograms;

enum Planet {
	MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE
}
public class EnumTesting {
	public static void main(String[] args) {
		Planet planet = Planet.MERCURY;
		System.out.println(planet);
	}
}
