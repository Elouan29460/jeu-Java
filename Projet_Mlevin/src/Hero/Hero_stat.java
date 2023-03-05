package Hero; 

import java.util.*;
import Projet_Melvin.*;
import java.util.*;

public class Hero_stat {
	private int vie;
	private int attaque;
	private int defense;
	private int vitesse;
	
	public Hero_stat(int vie, int attaque, int defense, int vitesse) {
		this.vie = vie;
		this.attaque = attaque;
		this.defense = defense;
		this.vitesse = vitesse;
	}
	
	public void affiche_hero() {
		System.out.println("⬜⬜⬜⬜⬛⬛⬛⬛⬜⬜⬜⬜⬜");
		System.out.println("⬜⬜⬜⬛🟥🟥🟧🟧⬛⬜⬜⬜⬜");
		System.out.println("⬜⬜⬛⬛⬛⬛🟧🟧🟧⬛⬜⬜⬜");
		System.out.println("⬜⬛🟦🟦🟦🟦⬛🟧🟧⬛⬛⬜⬜");
		System.out.println("⬜⬛🟦🟦🟦🟦⬛🟧🟧⬛🟧⬛⬜");
		System.out.println("⬜⬜⬛⬛⬛⬛🟧🟧🟧⬛🟧⬛⬜");
		System.out.println("⬜⬜⬛🟥🟥🟥🟧🟧🟧⬛🟧⬛⬜");
		System.out.println("⬜⬜⬛🟥🟥🟥🟧🟧🟧⬛🟧⬛⬜");
		System.out.println("⬜⬜⬛🟥🟥🟥🟧🟧🟧⬛⬛⬜⬜");
		System.out.println("⬜⬜⬛🟥⬛⬛⬛⬛🟧⬛⬜⬜⬜");
		System.out.println("⬜⬜⬛🟥⬛⬜⬜⬛🟧⬛⬜⬜⬜");
		System.out.println("⬜⬜⬛⬛⬛⬜⬜⬛⬛⬛⬜⬜⬜");
	}
	public void afficher_stat_ajout() {
		System.out.println("Statistique :");
		System.out.println();
		System.out.println("Attaque : " + this.attaque + "+1 = a");
		System.out.println("Vie     : " + this.vie +     "+1 = z");
		System.out.println("Defense : " + this.defense + "+1 = e");
		System.out.println("Vitesse : " + this.vitesse + "+1 = r");
	}
	
	public void stat_ajout(int ajout) {
		int confirm = 0;
		int temp_ajout = 0;
		int res = ajout;
		Scanner sc = new Scanner(System.in);
		while (confirm != res) {
			affiche_hero();
			afficher_stat_ajout();
			System.out.println("Vous avez " + res + " point a ajouter sur votre personnage");
			int temp = sc.nextInt();
			if (temp == 1) {
				System.out.println("Combien de point voulez vous rajouter ?");
				temp_ajout = sc.nextInt();
				if ((temp_ajout > res) || (temp_ajout < 1)) {
					System.out.println("Valeur incorrect");
					System.out.println("Combien de point voulez vous rajouter ?");
					temp_ajout = sc.nextInt();
				}
				this.attaque = this.attaque + temp_ajout;
			}
			if (temp == 2) {
				System.out.println("Combien de point voulez vous rajouter ?");
				temp_ajout = sc.nextInt();
				if ((temp_ajout > res) || (temp_ajout < 1)) {
					System.out.println("Valeur incorrect");
					System.out.println("Combien de point voulez vous rajouter ?");
					temp_ajout = sc.nextInt();
				}
				this.vie = this.vie + temp_ajout;
			}
			if (temp == 3) {
				System.out.println("Combien de point voulez vous rajouter ?");
				temp_ajout = sc.nextInt();
				if ((temp_ajout > res) || (temp_ajout < 1)) {
					System.out.println("Valeur incorrect");
					System.out.println("Combien de point voulez vous rajouter ?");
					temp_ajout = sc.nextInt();
				}
				this.defense = this.defense + temp_ajout;
			}
			if (temp == 4) {
				System.out.println("Combien de point voulez vous rajouter ?");
				temp_ajout = sc.nextInt();
				if ((temp_ajout > res) || (temp_ajout < 1)) {
					System.out.println("Valeur incorrect");
					System.out.println("Combien de point voulez vous rajouter ?");
					temp_ajout = sc.nextInt();
				}
				this.vitesse = this.vitesse + temp^temp_ajout;
			}
			res = ajout - temp_ajout;
		}
	}
	
	public void afficher_stat() {
		System.out.println();
		System.out.println("Statistique :");
		System.out.println("Attaque : " + this.attaque);
		System.out.println("Vie : " + this.vie);
		System.out.println("Defense : " + this.defense);
		System.out.println("Vitesse : " + this.vitesse);
	}
}
