public class Jaeger {
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float wight;
	private int speed;
	private int streight;
	private int armor;

	public Jaeger(String modelName, String mark, String origin, float height, float wight, int speed, int streight, int armor) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
		this.height = height;
		this.wight = wight;
		this.speed = speed;
		this.streight = streight;
		this.armor = armor;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getMark() {
		return mark;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getOrigin() {
		return origin;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getHeight() {
		return height;
	}

	public void setWight(float wight) {
		this.wight  = wight;
	}

	public float getWight() {
		return wight;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setStreight(int streight) {
		this.streight = streight;
	}

	public int getStreight() {
		return streight;
	}

	public void setArmor(int armor) {
		this.armor = armor;
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