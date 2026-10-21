package Template_Method;

public class Coffee extends BeverageMaker {
    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk to the coffee...");
    }

    // OVERRIDING THE HOOK: Coffee decides to change the behavior of the optional step
    @Override
    protected boolean customerWantsCondiments() {
        // Let's pretend this specific customer doesn't want any condiments/sugar
        return false;
    }
}
