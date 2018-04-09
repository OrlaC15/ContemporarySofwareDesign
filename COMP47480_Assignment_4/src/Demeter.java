public class Demeter {
    static final String CURRENCY_SYMBOL = "€";
    public static void main(String[] args) {
        ShopKeeper john = new ShopKeeper();
         Wallet wallet = new Wallet(95);
        System.out.println("Initial value in wallet is: " + CURRENCY_SYMBOL + wallet.getTotalMoney());
        Customer aoife = new Customer(wallet);
        john.chargeCustomer(aoife,500);

        System.out.println("Value in wallet after purchase is: " + CURRENCY_SYMBOL + aoife.getWallet().getTotalMoney());
    }
}

class Customer {
    public Customer(Wallet wallet) {
        name = ""; //unused
        myWallet = wallet;
    }

    public boolean payandUpdate(float amount) {
    Wallet wallet = getWallet();
    boolean flag= true;
    if(wallet.getTotalMoney()>amount) {
        wallet.subtractMoney(amount);
    } else {
       flag=false;
    }

return flag;}
    public String getName() {
        return name;
    }
    public Wallet getWallet() {
        return myWallet;
    }

    public void setMyWallet(Wallet myWallet) {
        this.myWallet = myWallet;
    }

    private String name;
    private Wallet myWallet;
}

class Wallet {
    public  Wallet(float newValue) {
        value = newValue;
    }
    public float getTotalMoney() {
        return value;
    }
    public void addMoney(float deposit) {
        value += deposit;
    }
    public void subtractMoney(float debit) {
        value -= debit;
    }
    private float value;
}

class ShopKeeper {
   //float amount; // ...
    public void chargeCustomer( Customer cust, float amount){
       System.out.println(" you owe "+ amount);

      boolean flag = cust.payandUpdate(amount);
      if (flag== true){
          System.out.println("Thank You,  Have a nice day");
      }else{
          System.out.println("Sorry come back back when your not broke");
      }


   }
 }