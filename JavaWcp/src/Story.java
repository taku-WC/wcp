
public class Story {
	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.name = "勇者";
		hero.hp = 100;
		System.out.println(hero.name + "が誕生した");

		Slime sm1 = new Slime();
		sm1.hp = 50;
		sm1.suffix = 'A';
		Slime sm2 = new Slime();
		sm2.hp = 50;
		sm2.suffix = 'B';

		hero.sit(5);
		sm1.run();
		sm2.run();
		hero.slip();
		hero.sit(25);
		hero.run();
	}
}
