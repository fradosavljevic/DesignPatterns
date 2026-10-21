package Strategy;

public class ReverseStrategy implements TextStrategy {
    @Override
    public String format(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
