package TokenLibrary;

public class Token {
    public TokenTypes tokenType;

    public Token(TokenTypes tokenType){
        this.tokenType = tokenType;
    }

    public TokenTypes getTokenType(){
        return tokenType;
    }

}
