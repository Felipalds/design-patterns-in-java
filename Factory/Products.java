class Products {

    interface Product {
        String name;
        float price;
        public int buy();
    }


    public class Burger implements Product {
        int burgerAmount;
    }

    public class Pizza implements Product {
        String flavor;
    }




    public static void main(String[] args) {

    }
}