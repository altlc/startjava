public class JaegerTest {
	public static void main(String[] args) {
		Jaeger gipsyDanger = new Jaeger();
		Jaeger chernoAlpha = new Jaeger();

		gipsyDanger.setModelName("Gipsy Danger");
		gipsyDanger.setOrigin("USA");
		gipsyDanger.setMark("Mark-3");
		gipsyDanger.setHeight(79.25f);
		gipsyDanger.setWight(1980f);
		gipsyDanger.setSpeed(7);
		gipsyDanger.setStreight(8);
		gipsyDanger.setArmor(6);

		chernoAlpha.setModelName("Cherno Alpha");
		chernoAlpha.setOrigin("Russia");
		chernoAlpha.setMark("Mark-1");
		chernoAlpha.setHeight(85.34f);
		chernoAlpha.setWight(2412f);
		chernoAlpha.setSpeed(3);
		chernoAlpha.setStreight(10);
		chernoAlpha.setArmor(10);

		System.out.println( gipsyDanger.getModelName() + " armor " + gipsyDanger.getArmor());
		System.out.println( gipsyDanger.getModelName() + " streight " + gipsyDanger.getStreight());
		System.out.println( gipsyDanger.getModelName() + "Trying to move");
		gipsyDanger.move();
		System.out.println( gipsyDanger.getModelName() + "Trying to fight");
		gipsyDanger.fight();

		System.out.println( chernoAlpha.getModelName() + " armor " + chernoAlpha.getArmor());
		System.out.println( chernoAlpha.getModelName() + " streight " + chernoAlpha.getStreight());
		System.out.println( chernoAlpha.getModelName() + "Trying to move");
		chernoAlpha.move();
		System.out.println( chernoAlpha.getModelName() + "Trying to shoot");
		chernoAlpha.shoot();
		chernoAlpha.setModelName("Cherno Alpha Destroyed");
		
		System.out.println( gipsyDanger.getModelName() );
		System.out.println( chernoAlpha.getModelName() );
	}
}