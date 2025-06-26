import java.util.ArrayList;
import java.util.List;
public class Person {
    private List<Problem> problems = new ArrayList<>();

    public void addProblem(Problem problem) {
        problems.add(problem);
    }
    public void solveProblem(String name){
        for(Problem problem: problems){
            if(problem.getName().equalsIgnoreCase(name)){
                problem.markAsSolved();
                break;
            }
        }
    }
    public List<Problem>getUnsolvedProblems() {
        List<Problem> unsolved = new ArrayList<>();
        for(Problem problem: problems){
        if(!problem.isSolved()){
            unsolved.add(problem);
        }
        }
        return unsolved;
    }
    public void recountUnsolvedProblems() {
        for(Problem problem: getUnsolvedProblems()){
            System.out.print(problem);
        }
    }
    }

