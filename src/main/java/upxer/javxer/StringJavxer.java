package upxer.javxer;

public class StringJavxer {

    public String capitalizeFirstLetter( String text ) {

        if( !text.matches( "^[A-Z]" ) ) {

            return text.substring(0, 1).toUpperCase() + text.substring(1);

        } else {

            return text;
        }
    }

    public String abbreviateName( String name, int maxLength ) {

        if( name.length() >= maxLength ) {

            String abreviateName = name.replaceAll( "\\s(\\w{1})\\w+", ( " $1." ) );

            String abreviationsNameWithUpperCase[] = abreviateName.split("\\s+");

            return convertArrayToStringAndCapitalizeTheContents(abreviationsNameWithUpperCase);

        } else {

            return name;
        }
    }

    private String convertArrayToStringAndCapitalizeTheContents( String array[] ) {

        StringBuilder builder = new StringBuilder();

        for ( String contents : array ) {

            if (builder.length() > 0) {

                    builder.append(" ");
            }

            builder.append( capitalizeFirstLetter( contents ) );
        }

        return builder.toString();
    }
}