package Projet_Melvin;

public class Personnage 
{
	private String nom;
	private int vie;
	private int attaque;
	private int defense;
	private int vitesse;
	private Arme arme;
	
	public Personnage(String nom,int vie,int attaque,int defense,int vitesse)
	{
		this.nom = nom;
		this.vie = vie;
		this.attaque = attaque;
		this.defense = defense;
		this.vitesse = vitesse;
		Poings poings = new Poings("Poings",0);
		this.arme = poings;
	}
	
	public int getVitesse()
	{
		return this.vitesse;
	}
	
	public int getAttaque()
	{
		return this.attaque;
	}
	
	public Arme getArme()
	{
		return this.arme;
	}
	
	public int getVie()
	{
		return this.vie;
	}
	
	public void setVie(int valeur)
	{
		this.vie = valeur;
	}
	
	public void setArme(Arme arme)
	{
		this.arme = arme;
	}
}
