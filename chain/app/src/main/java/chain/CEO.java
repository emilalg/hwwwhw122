package chain;

class CEO extends PayRaiseHandler {
    @Override
    public void handlePayRaiseRequest(double percentage) {
        System.out.println("Toimitusjohtaja hyväksyi " + percentage + " % palkankorotuspyynnön.");
    }
}