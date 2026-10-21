package Template_Method;

public class Tea extends BeverageMaker {
    @Override
    protected void brew() {
        System.out.println("Steeping the tea bag...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon to the tea...");
    }
}
