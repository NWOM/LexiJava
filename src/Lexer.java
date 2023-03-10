public class Lexer {
    private String input;
    private int currentPosition;
    public Lexer(String input){
        this.input=input;
        currentPosition=0;
    }
    public Token getNextToken(){
        if(currentPosition>=input.length()){
            return new Token(Token.EOF,null);
        }
        char currentChar=input.charAt(currentPosition);
        if(Character.isDigit(currentChar)){
            return getNumberToken() ;
        }
        else if(currentChar=='+'){
            currentPosition++;
            return new Token(Token.PLUS,null);
        }else if(currentChar=='-'){
            currentPosition++;
            return new Token(Token.MINUS,null);
        }else if(currentChar=='*'){
            currentPosition++;
            return new Token(Token.TIMES,null);
        }else if(currentChar=='/'){
            currentPosition++;
            return new Token(Token.DIVIDE,null);
        }else if(currentChar=='('){
            currentPosition++;
            return new Token(Token.LPAREN,null);
        }else if(currentChar==')'){
            currentPosition++;
            return new Token(Token.RPAREN,null);

        }else{
            throw new IllegalArgumentException("Invalid character:"+currentChar);
        }

    }
    private Token getNumberToken(){
        StringBuilder sb=new StringBuilder();
        while(currentPosition<input.length() && Character.isDigit(input.charAt(currentPosition))){
            sb.append(input.charAt(currentPosition));
            currentPosition++;
        }
        int value=Integer.parseInt(sb.toString());
        return new Token(Token.NUMBER,value);


    }
}

