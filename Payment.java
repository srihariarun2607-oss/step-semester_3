class FeeAccount {
    void pay(double amount) {
        System.out.println("Paid in one go (day-scholar account)");
    }
}

class HostelFeeAccount extends FeeAccount {
    void pay(double amount) {
        System.out.println("Paid in two installments (hostel account)");
    }
}

public class Payment {

    public static void main(String[] args) {

        FeeAccount[] accounts = {
            new HostelFeeAccount(),
            new HostelFeeAccount(),
            new FeeAccount(),
            new FeeAccount()
        };

        int hostelCount = 0;
        int dayCount = 0;

        for (int i = 0; i < accounts.length; i++) {

            if (accounts[i] instanceof HostelFeeAccount) {
                accounts[i].pay(60000);
                hostelCount++;
            } else {
                accounts[i].pay(60000);
                dayCount++;
            }
        }

        System.out.println("Hostel accounts processed: " + hostelCount
                + " | Day-scholar accounts processed: " + dayCount);
    }
}
