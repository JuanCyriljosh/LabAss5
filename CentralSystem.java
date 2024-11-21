public class CentralSystem {
    public static void main(String[] args) {
        
        HelpDesk deskManager = HelpDesk.getInstance();

        deskManager.assistCustomer("Desk 1");
        deskManager.assistCustomer("Desk 2");
        deskManager.assistCustomer("Desk 3");
        deskManager.assistCustomer("Desk 1");
        deskManager.assistCustomer("Desk 2");
        deskManager.assistCustomer("Desk 3");
 
        deskManager.displayCurrentNumber();
     
        deskManager.resetNumberCounter(0);

        deskManager.assistCustomer("Desk 1");
        deskManager.assistCustomer("Desk 2");
        deskManager.assistCustomer("Desk 3");
    }
}
