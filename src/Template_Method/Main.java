package Template_Method;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Making Tea ---");
        BeverageMaker tea = new Tea();
        tea.makeBeverage();

        System.out.println("--- Making Black Coffee (No condiments due to hook) ---");
        BeverageMaker coffee = new Coffee();
        coffee.makeBeverage();
    }
}
