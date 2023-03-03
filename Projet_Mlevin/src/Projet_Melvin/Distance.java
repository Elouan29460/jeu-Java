package Projet_Melvin;

public abstract class Distance extends Arme
{
	protected int range;
	protected int munitions;
	
	public Distance(String nom,int degats,int range,int munitions)
	{
		super(nom,degats);
		this.range = range;
		this.munitions = munitions;
	}
}
