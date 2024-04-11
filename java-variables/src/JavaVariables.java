public class JavaVariables {
        public static void main(String[] args) {
        //Define variables
                int games = 3;
                double allowance = 40;
                long battlepass;
                battlepass = 20;
        //use variables
                System.out.println("Number of games I own = " + games);
                System.out.println("My monthly allowance = " + allowance);
                System.out.println("Cost of a single battle pass = " + battlepass);
        //With the current allowance, how many battle passes can I buy
                //divide allowance by cost of a battlepass
                double NumBattlepass = allowance / battlepass;
                //print the number of battlepasses i can buy
                System.out.println("I can buy " + (int) NumBattlepass + " battlepasses with an allowance of $" + allowance);
        //what is the total cost of battlepasses
                //cost is equal to the number of battlepasses that can be bought times the cost of a battlepass
                double costTotal = (int) NumBattlepass * battlepass;
                System.out.println("To buy " + (int) NumBattlepass + " battlepasses, it will cost me $" + costTotal);
                }
}