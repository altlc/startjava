public class Jaeger {
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float wight;
	private int speed;
	private int streight;
	private int armor;

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setWight(float wight) {
		this.wight  = wight;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setStreight(int streight) {
		this.streight = streight;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public String getModelName() {
		return modelName;
	}

	public String getMark() {
		return mark;
	}

	public String getOrigin() {
		return origin;
	}

	public float getHeight() {
		return height;
	}

	public float getWight() {
		return wight;
	}

	public int getSpeed() {
		return speed;
	}

	public int getStreight() {
		return streight;
	}

	public int getArmor() {
		return armor;
	}

	public void move() {
		System.out.println( modelName + " Moving...");
	}

	public void shoot() {
		System.out.println(modelName + " Shooting...");
	}

	public void fight() {
		System.out.println(modelName + " Fighting...");
	}

}