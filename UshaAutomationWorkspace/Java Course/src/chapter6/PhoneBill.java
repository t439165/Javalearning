package chapter6;

import java.util.Scanner;

public class PhoneBill {

    Scanner scanner =new Scanner(System.in);
    //initialize

    private int id;
    private double baseCost;
    private double minsAlloted;
    private double minsUsed;
    private double overageRate;
    private double tax;
    private double overageCost;

    //constructors

    public PhoneBill(){
        id=0;
        baseCost=75;
        minsAlloted=1000;
        minsUsed=800;


    }

    public  PhoneBill(int id ){
        id=123456;
        baseCost=75;
        minsAlloted=1000;
        minsUsed=1500;

    }

    public  PhoneBill(int id,double baseCost,double minsAlloted,double minsUsed ) {
        this.id = id;
        this.baseCost = baseCost;
        this.minsAlloted = minsAlloted;
        this.minsUsed = minsUsed;
    }

    //methods to return the values setin constructor
    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id=id;
    }


    public double getBaseCost(double baseCost) {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public double getMinsAlloted() {
        return minsAlloted;
    }

    public void setMinsAlloted(double minsAlloted) {
        this.minsAlloted = minsAlloted;
    }

    public double getMinsUsed() {
        return minsUsed;
    }

    public void setMinsUsed(double minsUsed) {
        this.minsUsed = minsUsed;
    }

    public double getOverageRate() {
        return overageRate;
    }

    public void setOverageRate(double overageRate) {
        this.overageRate = overageRate;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }


    public double  calculateOverage(){
        if (minsUsed <= minsAlloted){
            return 0;
        }
            overageRate = 0.25;
            double overageMins = (minsUsed - minsAlloted);
            return overageMins * overageRate;
    }

    public double calculateTax(){

        double taxRate = 0.15;
        return taxRate * (baseCost + calculateOverage());
    }

    public double calculateTotal(){
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $" + calculateOverage());

        System.out.println("Tax: $"
                + String.format("%.2f", calculateTax()));
        System.out.println("Total: $"
                + String.format("%.2f", calculateTotal()));
    }
}

