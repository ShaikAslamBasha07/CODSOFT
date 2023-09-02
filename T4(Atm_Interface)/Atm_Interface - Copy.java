import java.util.Scanner;
    public class Atm_Interface
    {
        public static void main(String args[] )
        {
            int balanceleft = 5000, withdraw, deposit;
            Scanner sc = new Scanner(System.in);
            while(true)
            {
                System.out.println("Automated Teller Machine");
                System.out.println("Choose 1 to Withdraw");
                System.out.println("Choose 2 to Deposit");
                System.out.println("Choose 3 to Check Balance");
                System.out.println("Choose 4 to EXIT");
                System.out.print("Choose the operation you want to perform:");
                int num = sc.nextInt();
                switch(num)
                {
                    case 1:
                        System.out.print("Enter money to be withdrawn:");
                        withdraw = sc.nextInt();
                        if(balanceleft >= withdraw)
                        {
                            balanceleft = balanceleft - withdraw;
                            System.out.println("Please collect your money");
                        }
                        else
                        {
                            System.out.println("Insufficient Balance");
                        }
                        System.out.println("");
                        break;

                    case 2:
                        System.out.print("Enter money to be deposited:");
                        deposit = sc.nextInt();
                        balanceleft = balanceleft + deposit;
                        System.out.println("Your Money has been successfully depsited");
                        System.out.println("");
                        break;

                    case 3:
                        System.out.println("Balance : "+balanceleft);
                        System.out.println("");
                        break;

                    case 4:
                        System.exit(0);
                }
            }
        }
    }