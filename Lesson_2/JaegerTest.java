public class JaegerTest {
	public static void main(String[] args) {
		Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "USA", "Mark-3", 79.25f, 1980f, 7, 8, 6);
		Jaeger chernoAlpha = new Jaeger("Cherno Alpha", "Russia", "Mark-1", 85.34f, 2412f, 3, 10, 10);

		System.out.println(gipsyDanger.getModelName() + " armor " + gipsyDanger.getArmor());
		System.out.println(gipsyDanger.getModelName() + " streight " + gipsyDanger.getStreight());
		System.out.println(gipsyDanger.getModelName() + "Trying to move");
		gipsyDanger.move();
		System.out.println(gipsyDanger.getModelName() + "Trying to fight");
		gipsyDanger.fight();

		System.out.println(chernoAlpha.getModelName() + " armor " + chernoAlpha.getArmor());
		System.out.println(chernoAlpha.getModelName() + " streight " + chernoAlpha.getStreight());
		System.out.println(chernoAlpha.getModelName() + "Trying to move");
		chernoAlpha.move();
		System.out.println(chernoAlpha.getModelName() + "Trying to shoot");
		chernoAlpha.shoot();
		chernoAlpha.setModelName("Cherno Alpha Destroyed");
		
		System.out.println(gipsyDanger.getModelName());
		System.out.println(chernoAlpha.getModelName());
	}
}