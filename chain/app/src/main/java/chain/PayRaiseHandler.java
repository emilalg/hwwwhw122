package chain;

abstract class PayRaiseHandler {
    protected PayRaiseHandler nextHandler;

    public void setNextHandler(PayRaiseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handlePayRaiseRequest(double percentage);
}