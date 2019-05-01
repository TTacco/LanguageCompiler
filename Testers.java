import GRTree.NPLviewer;
import TokenLibrary.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.*;

public class Testers {

    public static void main(String[] args) {


        Hashtable<String, TokenTypes> reservedWords = new Hashtable<String, TokenTypes>();
        Hashtable<String, TokenIdentifier> identifiers = new Hashtable<String, TokenIdentifier>();

        reservedWords = InhaleText.ExhaleReserves();
        Scanner scan = new Scanner(reservedWords, identifiers, "‪C:\\Users\\Personal\\Desktop\\Weary.txt");

        while (Scanner.IsInputEnd()) {
            Token currentToken = scan.ConsumeNextToken();
            if (currentToken.getTokenType() == TokenTypes.ERROR) {
                System.out.println("ERROR IN THE SYNTAX AT LINE " + Scanner.line);
                break;
            } else {
                switch (currentToken.getTokenType()) {
                    case WHITESPACE:
                    case SINGLECOMMENT:
                    case MULTICOMMENT:
                        break;
                    case NEWLINE:
                        System.out.println();
                        break;
                    case STRINGLITERAL:
                        //System.out.println(currentToken.tokenType);
                        TokenString strT = (TokenString) currentToken;
                        
                        System.out.print("[" + currentToken.getTokenType() + " = " + strT.literal + "] " );
                        break;
                    case LETTERLITERAL:
                        TokenChar lit = (TokenChar) currentToken;
                        System.out.print("[" + currentToken.getTokenType() + " = " + lit.literal + "] " );
                        break;
                    case ID:
                        TokenIdentifier tid = (TokenIdentifier) currentToken;
                        System.out.print("[" + currentToken.getTokenType() + " = " + tid.idName + "] " );
                        break;
                    default:
                        System.out.print("[" + currentToken.getTokenType() + "] ");
                }
            }
        }


        Scanner scan2 = new Scanner(reservedWords, identifiers, "‪C:\\Users\\Personal\\Desktop\\Weary.txt");
        Parser parse = new Parser(scan2);
        Node root = parse.startParse();

        if(root != null){
            System.out.println("STARTING SEARCH");
            String treeSyntax = parse.DepthFirstTraversal(root);
            System.out.println(treeSyntax);

            new NPLviewer("C:\\Users\\Personal\\Desktop\\grtreefile.txt");
        }
    }


}
