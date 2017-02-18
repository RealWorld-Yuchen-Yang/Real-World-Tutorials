package main;

import java.util.LinkedList;
import java.util.List;

public class EpisodeOne {
	public static void main(String[] args)
	{
		AnimeCharacter profFarnsworth = new AnimeCharacter("Hubert J. Farnsworth", 
																new String[]{"Good news, everyone!"});
		
		AnimeCharacter drZoidberg = new AnimeCharacter("John Zoidberg");
		
		AnimeCharacter bender = new AnimeCharacter("Bender Bending Rodríguez",
				new String[]{
						"Bite my shiny metal ass!",
						"Please insert liquor!"});

		List<AnimeCharacter> characters = new LinkedList();
		characters.add(profFarnsworth);
		characters.add(drZoidberg);
		characters.add(bender);
		
		for(AnimeCharacter character: characters)
		{
			character.likesToSay();
		}
	}
}
