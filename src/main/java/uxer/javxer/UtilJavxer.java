package uxer.javxer;

public class UtilJavxer {

    public boolean ifHasSomeNumber( String text ) {
        return text.matches( ".*\\d.*" );
    }

    public String capitalizeFirstLetter( String text ) {
        if( !text.matches( "^[A-Z]" ) ) {
            return text.substring(0, 1).toUpperCase() + text.substring(1);
        } else {
            return text;
        }
    }

    public String abbreviateName( String name, int maxLength ) {
        if( name.length() >= maxLength ) {
            return name.replaceAll( "\\s(\\w)", "$1" );
        } else {
            return name;
        }
    }
}
