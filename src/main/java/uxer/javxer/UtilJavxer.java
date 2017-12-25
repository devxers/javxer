package uxer.javxer;

import java.util.regex.Pattern;

public class UtilJavxer {

    public boolean ifHasSomeNumber( String text ) {
        return text.matches( ".*\\d.*" );
    }
}
