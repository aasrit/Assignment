public class OrderLambda {
    public static void main(String[] args) {
        Amount lambdaprice = (int price) -> {
            if (price >10000 ) {

                System.out.println("order placed");
                System.out.println("Order status is completed or accepted");
            }
            else {
                System.out.println("order not accepted");
            }
        };
        lambdaprice.price(9000);
    }
    interface Amount {
        void price(int price);
    }

}

