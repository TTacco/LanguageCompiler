package TokenLibrary;

public class TokenDataType extends Token{
    public String dataType;

    public TokenDataType(String dataType) {
        super(TokenTypes.DATA_TYPE);
        this.dataType = dataType;
    }
}
