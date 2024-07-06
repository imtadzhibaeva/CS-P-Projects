import java.io.ObjectInputFilter.Config;
import java.util.ArrayList;
import java.util.List;

public class Lexer {
    

        private final String input;
        private final List<Token> tokens;
        
        public Lexer(String input) {

        this.input = input;
        this.tokens = new ArrayList<Token>();
        tokenize();
    }

    private void tokenize() {

    }
enum Token {

    final TokenType type;
    final String value;

    Token(TokenType type, String value){
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Token=(" + 

    }
}
    enum TokenType{
    CONFIG, UPDATE, COMPUTE, SNOW, CONFIGS, STRING, NUMBER, IDENTIFIER, REFERENCES
}
   private static class Token{
    
final TokenType type;
final String value;

Token(TokenType type, String value) {
    
    this.type = type;
    this.value = value;
}
    }


    enum TokenType{


        CONFIG, UPDATE, COMPUTE, SHOW, CONFIGS, STRING, NUMBERS, IDENTIFIEFR, REFERENCES
    }

}
