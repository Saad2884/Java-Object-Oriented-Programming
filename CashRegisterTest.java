public class CashRegisterTest {
    public static void main(String[] args) {
        CashRegister[] newEntry = new CashRegister[2]; 
        newEntry[0] = new CashRegister(2503.36, 2736.95);
        newEntry[1] = new CashRegister(550.36, 550.4);
        
        for (CashRegister c : newEntry){
            c.getChange();
        }
       System.out.printf("\t Purchase  \tPayment  \tRemaining\t\n");
           
        for (CashRegister c : newEntry){
           // System.out.println("Purchase amount = " + c.getPurchase() + "\tPayment amount = " + c.getPayment() + "\tRemaining amount = " + c.getChange());
           System.out.printf("\t %4.2f \t %4.2f \t %4.2f \t \n", c.getPurchase(), c.getPayment(), c.getChange());
        }
    }
}
