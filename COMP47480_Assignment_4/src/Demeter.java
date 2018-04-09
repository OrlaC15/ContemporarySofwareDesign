/**
/*
 * Created by Orla on 03/04/2018.
 *//*

public class Demeter {
    static final String CURRENCY_SYMBOL = "€";
    public static void main(String[] args) {
        ShopKeeper john = new ShopKeeper();
        Customer aoife = new Customer();
        System.out.println("Initial value in wallet is: " + CURRENCY_SYMBOL + aoife.getTotalMoney());

       // john.chargeCustomer(aoife, 50);
      //  System.out.println("Value in wallet after purchase is: " + CURRENCY_SYMBOL + wallet.getTotalMoney());
    }
}

class Customer {
    Wallet wallet ;
    public Customer(){
        name=""; //unused
        myWallet = wallet;
    }
    public float updateWallet() {
        myWallet.addMoney();

        return value;
    }

    private float value;
    public String getName() {
        return name;
    }
    public Wallet getWallet() {
        return myWallet;
    }
    private String name;
    private Wallet myWallet;
}

class Wallet {
    private float value;
    public  Wallet(float newValue) {

        value = newValue;
    }

    public void addMoney(float deposit) {
        value += deposit;
    }
    public void subtractMoney(float debit) {
        value -= debit;
    }
}

class ShopKeeper {
    // ...
//    public void chargeCustomer(Customer cust, float amount){
//        Wallet wallet = cust.getWallet();
//        if (wallet.getTotalMoney() > amount) {
//            wallet.subtractMoney(amount);
//        } else {
//            // get the baseball bat...
//        }

   // }
    // ...
*/
//}