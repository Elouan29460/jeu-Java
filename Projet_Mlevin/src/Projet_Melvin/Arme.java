package Projet_Melvin;

public abstract class Arme 
{
	protected String nom;
	protected int degats;
	
	public Arme(String nom,int degats)
	{
		this.nom = nom;
		this.degats = degats;
	}
}
