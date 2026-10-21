package Strategy;

public class UpperCaseStrategy implements TextStrategy {
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
