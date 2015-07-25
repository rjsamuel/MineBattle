package net.link404.minebattle;

public class Player {
	
	private String displayName;
	private int kills;
	private int deaths;
	//private DateTime timeAlive;
	
	public String getDisplayName()
	{
		return displayName;
	}
	
	public int getKills()
	{
		return kills;
	}
	
	public int getDeaths()
	{
		return deaths;
	}
	
	public double getKdRatio()
	{
		return kills/deaths;
	}

}
