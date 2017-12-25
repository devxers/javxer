import org.junit.*;
import org.junit.Test;
import uxer.javxer.StringJavxer;
import static org.junit.Assert.*;

public class TestStringJavxer {

    // SetUp
    private StringJavxer javxer;

    //Test capitalizeFirstLetter
    private String resultTestFirstUppercase = "Diego";
    private String stringTestFirstUppercase = "diego";

    // Test abbreviateName
    private int max_length = 9;
    private String resultAbbreviateName = "Kevin S. G.";
    private String stringAbbreviateName = "Kevin smith garcias";
    private String stringLowerCaseAbbreviateName = "kevin smith garcias";

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
}