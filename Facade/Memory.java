class Memory {
    private char[] bootData = new char[256];

    public void loadBootData() {
        System.out.println("Loading boot data into memory...");
        for (int i = 0; i < bootData.length; i++) {
            bootData[i] = (char) (Math.random() * 256);
        }
    }

    public void printBootData() {
        System.out.println("Printing boot data in memory...");
        for (int i = 0; i < bootData.length; i++) {
            System.out.printf("Memory address %d: %c%n", i, bootData[i]);
        }
    }
}