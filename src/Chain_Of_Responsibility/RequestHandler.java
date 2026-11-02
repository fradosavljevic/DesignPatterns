package Chain_Of_Responsibility;

public abstract class RequestHandler {
    protected RequestHandler nextHandler;

    public void setNext(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(CloudRequest request);
}
