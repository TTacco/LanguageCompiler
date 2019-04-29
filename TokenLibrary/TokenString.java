package TokenLibrary;

public class TokenString extends Token{

    public String literal = "";

    public TokenString(String name){
        super(TokenTypes.STRINGLITERAL);
        literal = name;
    }

}
