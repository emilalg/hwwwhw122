package chain;

class Lähiesimies extends PayRaiseHandler {
    @Override
    public void handlePayRaiseRequest(double percentage) {
        if (percentage <= 2) {
            System.out.println("Lähiesimies hyväksyi " + percentage + " % palkankorotuspyynnön.");
        } else {
            nextHandler.handlePayRaiseRequest(percentage);
        }
    }
}
