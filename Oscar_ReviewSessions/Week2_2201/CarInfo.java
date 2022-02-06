package Week2_2201;

public class CarInfo {
    public static void main(String[] args) {
        int year=2022;
        String make= "Tesla", model= "Model 3", color= "black";
        //automatic = true, manual=false
        boolean transmission=true;
        byte millage=0;
        int price= 450_000;
        System.out.println ("My dream car is "+year+" "+make+" "+model+"\nAutomatic transmission: "+transmission+
        " "+color+" "+millage+" "+price+ " Euro" );

        // converting the value into TL >> 1eur =15.5TL

        double priceInTL=price*15.5;
        double taxRate= 1.80;
        double priceAfterTaxinTL= priceInTL+(priceInTL*taxRate);
        System.out.println("This car costs "+ priceInTL+ " in Turkey.\nTotal price, including tax "+priceAfterTaxinTL);
    }
}
