package Projet_Melvin;

public class ArcElementaire extends Arc
{
	private String element;
	
	public ArcElementaire(String nom,int degats,int range,int munitions,String element)
	{
		super(nom,degats,range,munitions);
		this.element = element;
	}
}
