import org.junit.*;
import org.junit.Test;
import upxer.javxer.StringJavxer;
import static org.junit.Assert.*;

public class TestStringJavxer {

    // SetUp
    private StringJavxer javxer;

    // Variables Tests capitalizeFirstLetter()
    private String resultTestFirstUppercase = "Diego";
    private String stringTestFirstUppercase = "diego";

    // Variables Tests capitalizeName()
    private String resultTestCapitalizeName = "Lady Richy June";
    private String stringWithoutCapitalizeStyle = "lady richy june";
    private String stringtWithUpperCasesBetweenLetters = "laDy riChy JunE";

    // Variables Tests abbreviateName()
    private int max_length = 9;
    private String resultAbbreviateName = "Kevin S. G.";
    private String stringAbbreviateName = "Kevin smith garcias";
    private String stringLowerCaseAbbreviateName = "kevin smith garcias";

    private int anotherMaxLenght = 25;
    private String resultUnAbbreviateName = "rose sib house";
    private String stringLowerCaseUnAbbreviateName = "rose sib house";

    // Variables Tests removeDoubleSpaces()
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
    public void testCapitalizeName() {
        assertEquals( resultTestCapitalizeName, javxer.capitalizeName( stringWithoutCapitalizeStyle ) );
    }

    @Test
    public void testCapitalizeNameWithUpperCases() {
        assertEquals( resultTestCapitalizeName, javxer.capitalizeName( stringtWithUpperCasesBetweenLetters ) );
    }

    @Test
    public void testAbbreviateName() {
        assertEquals( resultAbbreviateName, javxer.abbreviateName( stringAbbreviateName, max_length ) );
    }

    @Test
    public void testUnAbbreviateName() {
        assertEquals( resultUnAbbreviateName, javxer.abbreviateName( stringLowerCaseUnAbbreviateName, anotherMaxLenght ) );
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