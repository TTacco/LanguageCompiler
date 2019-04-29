import java.util.ArrayList;
import java.util.LinkedList;
import TokenLibrary.Token;

public class Node {
    Token nodeToken;
    int nodeState;
    public LinkedList<Node> nodeChildren;

    public Node(){
            nodeChildren = new LinkedList<>();
    }

    public Node(Token nodeToken, int nodeState){
        this.nodeToken = nodeToken;
        this.nodeState = nodeState;
        nodeChildren = new LinkedList<>();

    }
}
