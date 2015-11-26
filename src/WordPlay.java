import java.util.Arrays;

/**
 * Created by Robert on 2015-11-24.
 */
public class WordPlay {

	private Character[] vowels = {'a', 'e', 'i', 'o', 'u','y','A','I', 'E', 'O', 'U','Y'};

	public boolean isVowel(Character ch)
	{
		if (Arrays.asList(vowels).contains(ch))
			return true;
		return false;
	}

	public String replaceVowels(String phrase, Character ch)
	{
		String ret = phrase;
		for (Character c: phrase.toCharArray())
		{
			if (isVowel(c))
			{
				ret = ret.replace(c, ch);
			}
		}
		return ret.toString();
	}

	public String emphasize(String phrase, Character ch)
	{
		StringBuilder ret = new StringBuilder(phrase);

		for (int i = 0; i < ret.length(); i++)
		{
			Character newChar = ret.charAt(i);
			if (i % 2 != 0 && Character.toLowerCase(newChar) == Character.toLowerCase(ch))
			{
				ret.setCharAt(i, '+');
			}
			else if (i % 2 == 0 && Character.toLowerCase(newChar) == Character.toLowerCase(ch))
			{
				ret.setCharAt(i, '*');
			}
		}
		return ret.toString();
	}
}
