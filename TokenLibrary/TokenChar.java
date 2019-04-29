package TokenLibrary;

public class TokenChar extends Token{

    public char literal = 0;

    public TokenChar(char name){
        super(TokenTypes.LETTERLITERAL);
        literal = name;
    }

}
