package chain;

class Yksikönpäällikkö extends PayRaiseHandler {
    @Override
    public void handlePayRaiseRequest(double percentage) {
        if (percentage > 2 && percentage < 5) {
            System.out.println("Yksikön päällikkö hyväksyi " + percentage + " % palkankorotuspyynnön.");
        } else {
            nextHandler.handlePayRaiseRequest(percentage);
        }
    }
}