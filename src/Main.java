

public class Main {
    public static void main(String[] args) {
        Store s = new Store(0.08);

        s.cart.add (new Product ("paper", 10.00)); //$10.00
        s.cart.add(new Product ("pencils", 1.00)); //$1.00

        double finalAmount= s.getTotalWithTax();

        System.out.println(finalAmount); //$11.88
        }
    }