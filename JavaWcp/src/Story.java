public class Story {
	public static void main(String[] args) {
		Hero hero = new Hero("勇者");
//		hero.name = "勇者";
//		hero.hp = 100;
		System.out.println(hero.name + "が誕生した");

		Hero dummy = new Hero();
		System.out.println(dummy.name + "が誕生した");

//		System.out.println(hero.hp);

		Sword s = new Sword();
		s.name = "ひのきの棒";
		s.damage = 10;
		hero.sword = s;
		System.out.println(hero.sword.name + "を装備");

		Cleric cleric = new Cleric();
		cleric.name = "司祭";
		cleric.hp = 50;
		cleric.heal(hero);

//		Slime sm1 = new Slime();
//		sm1.hp = 50;
//		sm1.suffix = 'A';
//		Slime sm2 = new Slime();
//		sm2.hp = 50;
//		sm2.suffix = 'B';

//		hero.sit(5);
//		sm1.run();
//		sm2.run();
//		hero.slip();
//		hero.sit(25);
//		hero.run();
	}
}
