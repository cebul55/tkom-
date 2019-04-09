package Token;

public class Token {

    private int beginLineIndex;
    private int endLineIndex;
    private int lineNumber;
    private int lexemLength;
    private TokenType tokenType;
    private String tokenString;

    public Token(int beginLineIndex, int endLineIndex, int lineNumber, int lexemLength,  TokenType tokenType, String tokenString){
        this.beginLineIndex = beginLineIndex;
        this.endLineIndex = endLineIndex;
        this.lineNumber = lineNumber;
        this.lexemLength = lexemLength;
        this.tokenType = tokenType;
        this.tokenString = tokenString;
    }

    public int getBeginIndex(){ return this.beginLineIndex; }

    public int getEndIndex() { return endLineIndex; }

    public TokenType getTokenType() { return tokenType; }

    public String getTokenString() { return tokenString; }

    public int getLineNumber() {return lineNumber;}

    public int getLexemLength() { return lexemLength; }

    @Override
    public String toString(){
        if(!this.tokenType.isCommentOrWhiteSign())
            return tokenType + "  '" + tokenString + "' Line:"+ lineNumber  + "' [" + beginLineIndex + ";" + endLineIndex + "] ";
        else
            return tokenType + " Line:"+ lineNumber  +"   [" + beginLineIndex + ";" + endLineIndex + "] ";
    }
}
