package TokenLibrary;

public class TokenIdentifier extends Token{
    public String idName = "";

    public TokenIdentifier(String name){
        super(TokenTypes.ID);
        idName = name;
    }

}
