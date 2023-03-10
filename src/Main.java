public class Main {
    public static void main(String[] args) {
        String input="2+3*7+1/5";
        Lexer lexer=new Lexer(input);
        Token token=lexer.getNextToken();
        while(token.getType()!=Token.EOF){
            System.out.println(token);
            token=lexer.getNextToken();
        }
    }
}