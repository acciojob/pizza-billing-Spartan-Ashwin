package com.driver;

public class Pizza {


    public boolean isVeg;
    public int basePrice;

    public  int extraCheese;

    public  boolean isCheeseAdded;

    public  int extraTopping;
    public  boolean isExtraToppingAdded;

    public  int paperBag;

    public  boolean isPaperBagTaken;

    int total;
    String bill;

    public Pizza(Boolean isVeg){

        // your code goes here
        this.isVeg=isVeg;

        if(isVeg){

            basePrice=300;
            extraTopping=70;
        }else{
            basePrice=400;
            extraTopping=120;
        }
        extraCheese=80;
        paperBag=20;
        total=basePrice;
        bill="Base Price Of The Pizza: "+basePrice+"\n";
    }

    public int getPrice(){
        return total;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            total=total+extraCheese;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isExtraToppingAdded==false){
            total+=extraTopping;
            isExtraToppingAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isPaperBagTaken==false){
            total+=paperBag;
            isPaperBagTaken=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isCheeseAdded){
            bill=bill+"Extra Cheese Added: "+extraCheese+"\n";
        }

        if(isExtraToppingAdded){
            bill=bill+"Extra Toppings Added: "+extraTopping+"\n";
        }

        if(isPaperBagTaken){
            bill=bill+"Paperbag Added: "+basePrice+"\n";
        }

        bill=bill+"Total Price: "+total+"\n";
        return bill;
    }
}
