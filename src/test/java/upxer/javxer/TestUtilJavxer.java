import org.junit.*;
import org.junit.Test;
import upxer.javxer.UtilJavxer;
import static org.junit.Assert.*;

public class TestUtilJavxer {

    private UtilJavxer utilities;

    //Test ifHasSomeNumber
    private String stringWithoutNumber = "Another String";
    private String stringWithNumber = "An0th3r Str1ng";

    // Test ifIsAEmail
    private String aValidEmail = "somename125_8!@somedomain.com";

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
}
