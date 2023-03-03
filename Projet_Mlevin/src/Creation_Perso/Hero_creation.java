package Creation_Perso; 

import Projet_Melvin.*;
import java.util.*;

public class Hero_creation {
	private int vie;
	private int attaque;
	private int defense;
	private int vitesse;
	private int stat_default = 100;
	private int confirm = 0;
	
	public Hero_creation() {
		Scanner sc = new Scanner(System.in);
		while (this.confirm != 101) {
			String temp = sc.next();
			switch (temp) {
			case "a": {
				this.attaque = this.attaque + 1;
				this.confirm = this.confirm + 1;
			}
			case "z": {
				this.vie = this.vie + 1;
				this.confirm = this.confirm + 1;
			}
			case "e": {
				this.defense = this.defense + 1;
				this.confirm = this.confirm + 1;
			}
			case "r": {
				this.vitesse = this.vitesse + 1;
				this.confirm = this.confirm + 1;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + temp);
			}
		}
	}
	
	
}
