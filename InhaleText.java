import TokenLibrary.TokenTypes;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Hashtable;

public class InhaleText{

    public static Hashtable<String, TokenTypes> ExhaleReserves(){
        Hashtable<String, TokenTypes> reservedWords = new  Hashtable<String, TokenTypes>();
        reservedWords.put("Cons", TokenTypes.COND_CONSIDER);
        reservedWords.put("Other", TokenTypes.COND_OTHERW);
        reservedWords.put("Rep", TokenTypes.LOOP_REPEAT);
        reservedWords.put("Say", TokenTypes.SET_SAY);
        reservedWords.put("List", TokenTypes.GET_LISTEN);

        reservedWords.put("Mul", TokenTypes.MULDIV_AROP);
        reservedWords.put("Div", TokenTypes.MULDIV_AROP);

        reservedWords.put("Add", TokenTypes.ADDSUB_AROP);
        reservedWords.put("Sub", TokenTypes.ADDSUB_AROP);

        reservedWords.put("Les,", TokenTypes.RELOP);
        reservedWords.put("LesEq", TokenTypes.RELOP);
        reservedWords.put("More", TokenTypes.RELOP);
        reservedWords.put("MorEq", TokenTypes.RELOP);
        reservedWords.put("Eq", TokenTypes.RELOP);
        reservedWords.put("Neq", TokenTypes.RELOP);

        reservedWords.put("And", TokenTypes.LOGICALOP);
        reservedWords.put("Or", TokenTypes.LOGICALOP);
        reservedWords.put("Xor", TokenTypes.LOGICALOP);
        reservedWords.put("Nand", TokenTypes.LOGICALOP);
        reservedWords.put("Not", TokenTypes.LOGICALOP);

        reservedWords.put("Is", TokenTypes.ASSIGN_OP);

        return reservedWords;
    }

    public static PushbackInputStream ExhaleText(String pathDirectory){
        FileReader inputStream = null;
        FileWriter outputStream = null;

        PushbackInputStream fr = null;
        byte[] syntax;

        Path path = Paths.get("C:\\Users\\Personal\\Desktop\\Weary.txt");
        try {
            syntax = Files.readAllBytes(path);
            ByteArrayInputStream array = new ByteArrayInputStream(syntax);
            PushbackInputStream push = new PushbackInputStream(array);

            return push;
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }

}
