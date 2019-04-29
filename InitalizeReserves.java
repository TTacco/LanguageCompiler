import TokenLibrary.TokenTypes;

import java.util.Hashtable;

public class InitalizeReserves {
    Hashtable<TokenTypes, String> reservedWords = new Hashtable<TokenTypes, String>();

    Hashtable<TokenTypes, String> InitalizeReserves(){
        reservedWords.put(TokenTypes.BEGIN_PROGRAM, "Begin");
        reservedWords.put(TokenTypes.END_PROGRAM, "End");
        return reservedWords;
    }

}
