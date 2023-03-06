package Hero;

public class Hero_level {
	
	private int level;
	private int count;
	private Hero_stat h;
	
	public Hero_level(Hero_stat h) {
		this.level = 1;
		this.h = h;
	}
	
	public void level_up() {
		this.level = this.level + 1;
	}
	public void xp_win(int xp) {
		this.count = this.count + xp;
	}
	
	public void level() {
		if(this.count == this.level * 2 ) {
			level_up();
			h.stat_ajout(10);
			this.count = 0;
		}
	}
	
	public void afficher_level() {
		System.out.println("Vous êtes level : " + this.level);
		int i = this.count / this.level * 2;
		switch (i) {
		case 10: {
			System.out.println("------------------------------");
			System.out.println("|||");
			System.out.println("------------------------------");
		}
		case 20: {
			System.out.println("------------------------------");
			System.out.println("||||||");
			System.out.println("------------------------------");
		}
		case 30: {
			System.out.println("------------------------------");
			System.out.println("|||||||||");
			System.out.println("------------------------------");
		}
		case 40: {
			System.out.println("------------------------------");
			System.out.println("||||||||||||");
			System.out.println("------------------------------");
		}
		case 50: {
			System.out.println("------------------------------");
			System.out.println("|||||||||||||||");
			System.out.println("------------------------------");
		}
		case 60: {
			System.out.println("------------------------------");
			System.out.println("||||||||||||||||||");
			System.out.println("------------------------------");
		}
		case 70: {
			System.out.println("------------------------------");
			System.out.println("|||||||||||||||||||||");
			System.out.println("------------------------------");
		}
		case 80: {
			System.out.println("------------------------------");
			System.out.println("||||||||||||||||||||||||");
			System.out.println("------------------------------");
		}
		case 90: {
			System.out.println("------------------------------");
			System.out.println("|||||||||||||||||||||||||||");
			System.out.println("------------------------------");
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + i);
		}
	}
}
