public class Main {
    public static void main(String[] args) {
        Person james = new Person();
        Problem p1 = new Problem("pay rent", "Monthly rent", false);
        Problem p2 = new Problem("pass exams", "prepare for final exams", ProblemType.EDUCATIONAL);
        james.addProblem(p1);
        james.addProblem(p2);
        james.solveProblem("pay rent");
        System.out.println("Unsolved problems:");
        james.recountUnsolvedProblems();
    }
}