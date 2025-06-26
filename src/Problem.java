public class Problem {
    private String name;
    private ProblemType type;
    private boolean isSolved;

    public Problem(String name, ProblemType type, boolean isSolved) {
        this.name = name;
        this.type = type;
        this.isSolved = isSolved;

    }

    public void markAsSolved() {
        this.isSolved = true;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public String getName() {
        return name;
    }

    public ProblemType getType() {
        return type;
    }

    public String toString() {
        return name + " (" + type + ") - solved: " + isSolved;
    }
}

