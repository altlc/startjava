package com.startjava.Lesson_2_3.wolf;

public class Wolf {
	private String gender;
	private String name;
	private float weight;
	private byte age;
	private String color;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		if (age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void go() {
		System.out.println("Go");
	}

	public void run() {
		System.out.println("Run");
	}

	public void sit() {
		System.out.println("Sit");
	}

	public void hunt() {
		System.out.println("Hunt");
	}

	public void howl() {
		System.out.println("howl");
	}
}