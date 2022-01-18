package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        String name="Feyza Nur", streetName="Vojkova cesta", city="Ljubljana", state="Slovenia";
        int buildingNumber=71, zipCode=1000;
        String shippingAddress="\n"+ name+ "\n"+streetName+" "+buildingNumber+"\n"+zipCode+" "+city+", "+state;
        System.out.println(shippingAddress);
    }
}
