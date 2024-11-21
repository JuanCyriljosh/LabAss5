public class HelpDesk {
    private static HelpDesk helpDeskInstance;
    private int currentNumber = 0;

    private HelpDesk() {
    }

    public static synchronized HelpDesk getInstance() {

        if (helpDeskInstance == null) {
            helpDeskInstance = new HelpDesk();
        }
        return helpDeskInstance;
    }

    public synchronized void displayCurrentNumber() {

        System.out.println("Current Number: " + currentNumber);
    }

    public synchronized void assistCustomer(String deskName) {

        currentNumber++;
        System.out.println("Assisting Customer: " + currentNumber + " at " + deskName);
    }

    public synchronized void resetNumberCounter(int num) {

        currentNumber = num;
        System.out.println("Number Counter reset to: " + currentNumber);
    }
}
