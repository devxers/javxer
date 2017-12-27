package upxer.javxer;

import java.util.regex.Pattern;

public class UtilJavxer {

    public boolean ifHasSomeNumber( String text ) {
        return text.matches( ".*\\d.*" );
    }

    public boolean ifIsAnEmail( String text ) {
        return text.matches( "^[^\\.,,][\\w+!]+@(?:[A-z0-9]+\\.)+[A-z]{1,6}$" );
    }
}
