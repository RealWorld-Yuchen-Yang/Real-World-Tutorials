package main;

public class AnimeCharacter {
	private String name;
	private String[] catchPhrases;

	public AnimeCharacter(String name)
	{
		this(name, null);//new String[]{}
	}

	public AnimeCharacter(String name, String[] cachyPhrases) {
		this.name = name;
		this.catchPhrases = cachyPhrases;
	}
	
	public void likesToSay()
	{
		System.out.println("I am "+name);
		for(int i=0; i<catchPhrases.length; i++)
		{
			System.out.println("	"+catchPhrases[i]);
		}
	}
}
