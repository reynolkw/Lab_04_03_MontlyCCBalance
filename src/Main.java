public class Main
{
    public static void main(String[] args)
    {
        // simulating user input
        double ccBalance = 5000.0;
        double interestRate = 0.17;
        double interestDue = 0.0;

        interestDue = ccBalance * interestRate;
        ccBalance = ccBalance + interestDue;
        System.out.println("The interest due after one month is $" + interestDue);
        System.out.println("The account balance after one month is $" + ccBalance);

        System.out.println();

        interestDue = ccBalance * interestRate;
        ccBalance = ccBalance + interestDue;
        System.out.println("The interest due after two months is $" + interestDue);
        System.out.println("The account balance after two months is $" + ccBalance);

    }
}