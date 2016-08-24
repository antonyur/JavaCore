package module2;

public class Task234Class {

    private static int[] balances = {1200, 250, 2000, 500, 3200};
    private static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    private static double withdrawBalance(double balance, double withdrawal)
    {
        double comission = getComission(withdrawal);
        return balance - withdrawal - comission;
    }

    private static double withdrawBalance(String ownerName, double withdrawal) {
        int index = 0;
        double result = -1;
        for (String name : ownerNames) {
            if (name.equalsIgnoreCase(ownerName)) {
                result = balances[index] - withdrawal - getComission(withdrawal);
                break;
            }
            index++;
        }

        return result;
    }


    private static double getComission(double withdrawal)
    {
        return withdrawal*0.05;
    }

    private static void Task3Results(String ownerName, double withdrawal){
        double remBalance = withdrawBalance(ownerName, withdrawal);
        if (remBalance < 0)
            System.out.println(String.format("%s NO", ownerName));
        else
            System.out.println(String.format("%s %f %f",ownerName, withdrawal + getComission(withdrawal), remBalance));
    }

    private static double fundBalance(String ownerName, double fund) {
        int index = 0;
        double result = 0;
        for (String name : ownerNames) {
            if (name.equalsIgnoreCase(ownerName)) {
                result = balances[index] + fund;
                break;
            }
            index++;
        }

        return result;
    }

    private static void Task4Results(String ownerName, double fund){
        double remBalance = fundBalance(ownerName, fund);
        System.out.println(String.format("%s %f", ownerName, remBalance));
    }


    public static void main(String[] args) {
        //Test task2
        double balance = 14234.45;
        double withdrawal = 1231.99;
        double remBalance = withdrawBalance(balance, withdrawal);


        System.out.println("Task2 results");
        if (remBalance < 0)
            System.out.println("No");
        else
            System.out.println(String.format("OK %f %f",getComission(withdrawal), remBalance));

        //Test task3
        System.out.println("Task3 results");

        String ownerName = "Ann";
        withdrawal = 100;
        Task3Results(ownerName, withdrawal);

        ownerName = "Oww";
        withdrawal  = 490;
        Task3Results(ownerName, withdrawal);

        //Test task4
        System.out.println("Task4 results");

        ownerName = "Ann";
        double fund = 100;
        Task4Results(ownerName, fund);

        ownerName = "Oww";
        Task4Results(ownerName, fund);
    }
}
