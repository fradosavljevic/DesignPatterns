package Builder;

public class Main {
    public static void main(String[] args) {
        ServerBuilder enterpriseBuilder = new EnterpriseServerBuilder();

        CloudArchitect architect = new CloudArchitect(enterpriseBuilder);

        architect.constructProductionServer();

        CloudServer enterpriseServer = enterpriseBuilder.getResult();
        System.out.println("Server 1: " + enterpriseServer);

        ServerBuilder budgetBuilder = new BudgetServerBuilder();
        architect = new CloudArchitect(budgetBuilder);

        architect.constructTestServer();
        CloudServer testServer = budgetBuilder.getResult();
        System.out.println("Server 2: " + testServer);
    }
}
