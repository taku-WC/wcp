public class SuperHero extends Hero {
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した");
	}

	public void attack() {
		super.attack();
		if(this.flying) {
			super.attack();
		}
	}

	public SuperHero(String name) {
		this.hp = 100;
		this.name = name;
	}
}
