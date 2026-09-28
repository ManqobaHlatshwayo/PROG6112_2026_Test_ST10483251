public abstract class Consoles implements IConsoles {

    // Variables to store the console type, store name and total sales
    private String consoleType;
    private String store;
    private int totalSales;

    // Constructor that accepts the console type, store name and total sales
    public Consoles(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    // Methods to get the console type, store name and total sales
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return store;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }

    // Abstract method, written in the subclass
    public abstract void printReport();
}