import org.junit.*;
import org.junit.Test;
import upxer.javxer.StringJavxer;
import static org.junit.Assert.*;

public class TestStringJavxer {

    // SetUp
    private StringJavxer javxer;

    //Test capitalizeFirstLetter()
    private String resultTestFirstUppercase = "Diego";
    private String stringTestFirstUppercase = "diego";

    // Test abbreviateName()
    private int max_length = 9;
    private String resultAbbreviateName = "Kevin S. G.";
    private String stringAbbreviateName = "Kevin smith garcias";
    private String stringLowerCaseAbbreviateName = "kevin smith garcias";

    // Test removeDoubleSpaces()
    private String resultRemoveDoubleSpaces = "some text that has double spaces";
    private String aStringWithDoubleSpaces = "some    text  that has   double      spaces";


    @Before
    public void setUp() {
        javxer = new StringJavxer();
    }

    @Test
    public void testCapitalizeFirstLetter() {
        assertEquals( resultTestFirstUppercase, javxer.capitalizeFirstLetter( stringTestFirstUppercase ) );
    }

    @Test
    public void testAbbreviateName() {
        assertEquals( resultAbbreviateName, javxer.abbreviateName( stringAbbreviateName, max_length ) );
    }

    @Test
    public void testAbbreviateNameWithAllLowerCase() {
        assertEquals( resultAbbreviateName, javxer.abbreviateName( stringLowerCaseAbbreviateName, max_length ) );
    }

    @Test
    public void testRemoveDoubleSpaces() {
        assertEquals( resultRemoveDoubleSpaces, javxer.removeDoubleSpaces( aStringWithDoubleSpaces ) );
    }
}