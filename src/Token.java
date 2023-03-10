public class Token {
    public static final int NUMBER=0;
    public static final int PLUS=1;
    public static final int MINUS=2;
    public static final int TIMES=3;
    public static final int DIVIDE=4;
    public static final int LPAREN=5;
    public static final int RPAREN=6;
    public static final int EOF=7;
    private int type;
    private Object value;

    public int getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    //Define Constructor to initialize the type and value of a token
    public Token(int type,Object value){
        this.type=type;
        this.value=value;
    }
    //Override the toString() method to provide a string representation of a token
    public String toString() {
        String typeName;
        switch (type) {
            case NUMBER:
                typeName = "NUMBER";
                break;
            case PLUS:
                typeName = "PLUS";
                break;
            case TIMES:
                typeName = "TIMES";
                break;
            case DIVIDE:
                typeName = "DIVIDE";
                break;
            case LPAREN:
                typeName = "LPAREN";
                break;
            case RPAREN:
                typeName = "RPAREN";
                break;
            case EOF:
                typeName = "EOF";
                break;
            default:
                typeName = "UNKNOWN";


        }
        return String.format("Token(%s,%s)", typeName, value);
    }

}
