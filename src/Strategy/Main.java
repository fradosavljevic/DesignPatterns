package Strategy;

public class Main {
    public static void main(String[] args) {
        String sampleText = "Design Patterns Are Awesome";

        System.out.println("Original text: " + sampleText);
        System.out.println("-----------------------------------");

        TextProcessor processor = new TextProcessor(new UpperCaseStrategy());
        processor.process(sampleText);

        processor.setStrategy(new LowerCaseStrategy());
        processor.process(sampleText);

        processor.setStrategy(new ReverseStrategy());
        processor.process(sampleText);
    }
}
