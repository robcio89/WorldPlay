import junit.framework.TestCase;

/**
 * Created by Robert on 2015-11-24.
 */
public class WordPlayTest extends TestCase {

	public void testIsVowel() throws Exception {
		WordPlay w = new WordPlay();

		assertTrue(w.isVowel('a'));

		assertTrue(w.isVowel('A'));

		assertFalse(w.isVowel('g'));
		assertFalse(w.isVowel('H'));
	}

	public void testReplaceVowels() throws Exception {
		WordPlay w = new WordPlay();

		String modified = "HgllgWgrld";

		assertEquals(modified, w.replaceVowels("HelloWorld", 'g'));
	}

	public void testReplaceVowels1() throws Exception {
		WordPlay w = new WordPlay();

		String modified = "*l*m*k*t*";

		assertEquals(modified, w.replaceVowels("Alamakota", '*'));
	}

	public void testReplaceVowels2() throws Exception
	{
		WordPlay w = new WordPlay();

		String modified = "#br#k#d#br#";

		assertEquals(modified, w.replaceVowels("AbrAkadAbra", '#'));
	}

	public void testEmphasize() throws Exception
	{
		WordPlay w = new WordPlay();

		String modified = "dn* ctg+*+ctg+";

		assertEquals(modified, w.emphasize("dna ctgaaactga", 'a'));
	}

	public void testEmphasize1() throws Exception
	{
		WordPlay w = new WordPlay();

		String modified = "M+ry Bell+ +br*c*d*br+";

		assertEquals(modified, w.emphasize("Mary Bella Abracadabra", 'a'));
	}

	public void testEmphasize3() throws Exception
	{
		WordPlay w = new WordPlay();

		String modified = "dn* ctg+*+ctg+";

		assertEquals(modified, w.emphasize("dna ctgaaactga", 'A'));
	}

	public void testEmphasize4() throws Exception
	{
		WordPlay w = new WordPlay();

		String modified = "M+ry Bell+ +br*c*d*br+";

		assertEquals(modified, w.emphasize("Mary Bella Abracadabra", 'A'));
	}
}