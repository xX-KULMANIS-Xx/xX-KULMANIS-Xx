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
                double battlepassNum = allowance / battlepass;
        //print the number of battlepasses i can buy
                System.out.println("I can buy " + Math.round(battlepassNum) + " battlepasses with an allowance of " + allowance + " dollars.");
                }
}