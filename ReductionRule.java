import TokenLibrary.TokenTypes;

public class ReductionRule {
    public TokenTypes production;
    public int popAmount;
    public String reductionGrammar;

    public ReductionRule(TokenTypes production, int popAmount, String reductionGrammar) {
        this.production = production;
        this.popAmount = popAmount;
        this.reductionGrammar = reductionGrammar;
    }
}
