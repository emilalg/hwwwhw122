class ComputerFacade {
    private BIOS bios;
    private HardDrive hardDrive;
    private Memory memory;

    public ComputerFacade() {
        this.bios = new BIOS();
        this.hardDrive = new HardDrive();
        this.memory = new Memory();
    }

    public void startComputer() {
        bios.initialize();
        hardDrive.spinUp();
        memory.loadBootData();
        memory.printBootData();
        bios.shutdown();
    }
}
