package Strategy;

public class LowerCaseStrategy implements TextStrategy {
    @Override
    public String format(String text) {
        return text.toLowerCase();
    }
}
