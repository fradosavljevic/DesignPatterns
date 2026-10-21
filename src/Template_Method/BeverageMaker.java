package Template_Method;

public abstract class BeverageMaker {

    public final void makeBeverage() {
        boilWater();
        brew();
        pourInCup();

        // HOOK: Optional step. Subclasses can override this behavior if they want.
        if (customerWantsCondiments()) {
            addCondiments();
        } else {
            System.out.println("Skipping condiments as requested.");
        }

        System.out.println("Beverage is ready!\n");
    }

    private void boilWater() {
        System.out.println("Boiling water...");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup...");
    }

    // Abstract steps that subclasses MUST implement
    protected abstract void brew();
    protected abstract void addCondiments();

    // THE HOOK: Has a default implementation (returns true).
    // Subclasses can choose to override it, but they don't have to.
    protected boolean customerWantsCondiments() {
        return true;
    }
}
