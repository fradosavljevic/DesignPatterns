package Interpreter;

public class Main {
    static void main(String[] args) {
        Expression cpuHigh = new TerminalExpression("CPU_HIGH");
        Expression memoryHigh = new TerminalExpression("MEMORY_HIGH");

        Expression alertCondition = new AndExpression(cpuHigh, memoryHigh);

        String context1 = "Metrics: CPU_HIGH and MEMORY_HIGH warning triggered.";
        String context2 = "Metrics: CPU_HIGH warning triggered only.";

        System.out.println("Context 1 matches rule: " + alertCondition.interpret(context1));
        System.out.println("Context 2 matches rule: " + alertCondition.interpret(context2));
    }
}
