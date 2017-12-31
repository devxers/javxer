import org.junit.*;
import org.junit.Test;
import upxer.javxer.UtilJavxer;
import static org.junit.Assert.*;

public class TestUtilJavxer {

    private UtilJavxer utilities;

    //Test ifHasSomeNumber
    private String stringWithoutNumber = "Another String";
    private String stringWithNumber = "An0th3r Str1ng";

    // Test ifHasSomeLetter
    private String stringWithoutLetters = "79136895";
    private String stringWithLetters = "5856A89";
    private String anotherStringWithLetters = "58 A 596 B";

    // Test ifIsAnEmail
    private String aValidEmail = "somename125_8!@somedomain.com";
    private String anEmailWithDotAtBeginning = ".another_email@domain.com";
    private String anEmailWithCommaAtBeginning = ",simpleemail@another.com";
    private String anInvalidEmail = "someelse@domain";

    @Before
    public void setUp(){
        utilities = new UtilJavxer();
    }

    @Test
    public void testIfHasSomeNumberExpectFalse() {
        assertFalse( utilities.ifHasSomeNumber( stringWithoutNumber ) );
    }

    @Test
    public void testIfHasSomeNumberExpectTrue() {
        assertTrue( utilities.ifHasSomeNumber( stringWithNumber ) );
    }

    @Test
    public void testIfIsAnEmail() {
        assertTrue( utilities.ifIsAnEmail( aValidEmail ) );
    }

    @Test
    public void testIfIsAnEmailWithDotAtBeginning() {
        assertFalse( utilities.ifIsAnEmail( anEmailWithDotAtBeginning ) );
    }

    @Test
    public void testIfIsAnEmailWithCommaAtBeginning() {
        assertFalse( utilities.ifIsAnEmail( anEmailWithCommaAtBeginning ) );
    }

    @Test
    public void testIfIsAnEmailExpectFalse() {
        assertFalse( utilities.ifIsAnEmail( anInvalidEmail ) );
    }

    @Test
    public void testIfHasSomeLetterExpectFalse() {
        assertFalse( utilities.ifHasSomeLetter( stringWithoutLetters ) );
    }

    @Test
    public void testIfHasSomeLetterExpectTrue() {
        assertTrue( utilities.ifHasSomeLetter( stringWithLetters ) );
    }

    @Test
    public void testIfHasSomeLetterExpectTrueStringWithSpaces() {
        assertTrue( utilities.ifHasSomeLetter( anotherStringWithLetters ) );
    }
}
