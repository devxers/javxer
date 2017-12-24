import org.junit.*;
import org.junit.Test;
import uxer.javxer.UtilJavxer;
import static org.junit.Assert.*;

public class TestUtilJavxer {

	private UtilJavxer utilities;

	//Test ifHasSomeNumber
	private String stringWithoutNumber = "Another String";
	private String stringWithNumber = "An0th3r Str1ng";

    //Test capitalizeFirstLetter
    private String resultTestFirstUppercase = "Diego";
    private String stringTestFirstUppercase = "diego";

    // Test abbreviateName
    private String resultAbbreviateName = "Kevin S G";
    private String stringAbbreviateName = "Kevin smith garcias";

	@Before
	public void setUp(){
		utilities = new UtilJavxer();
	}

    @Test
    public void testifHasSomeNumberExpectFalse() {
        assertFalse( utilities.ifHasSomeNumber( stringWithoutNumber ) );
    }

    @Test
    public void testifHasSomeNumberExpectTrue() {
    	assertTrue( utilities.ifHasSomeNumber( stringWithNumber ) );
    }

    @Test
    public void testCapitalizeFirstLetter() {
        assertEquals( resultTestFirstUppercase, utilities.capitalizeFirstLetter( stringTestFirstUppercase ) );
    }

    @Test
    public void testAbbreviateName() {
        assertEquals( resultAbbreviateName, utilities.abbreviateName( stringAbbreviateName, 9 ) );
    }
}
