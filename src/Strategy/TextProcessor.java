package Strategy;

public class TextProcessor {
    private TextStrategy strategy;

    public TextProcessor(TextStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(TextStrategy strategy) {
        this.strategy = strategy;
    }

    public void process(String text) {
        String result = strategy.format(text);
        System.out.println("Processed text: " + result);
    }
}
