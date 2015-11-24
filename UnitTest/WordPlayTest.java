import junit.framework.TestCase;

/**
 * Created by Robert on 2015-11-24.
 */
public class WordPlayTest extends TestCase {

	public void testIsVowel() throws Exception {
		WordPlay w = new WordPlay();

		assertTrue(w.isVowel('g'));
	}
}