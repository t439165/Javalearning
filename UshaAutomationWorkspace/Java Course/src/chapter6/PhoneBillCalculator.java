package chapter6;

public class PhoneBillCalculator {

    public static void main(String args[]){
        PhoneBill bill = new PhoneBill(123456);
        bill.setMinsUsed(1500);
        bill.printItemizedBill();
    }
}
