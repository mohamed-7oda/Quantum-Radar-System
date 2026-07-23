public class Violation {
    private String description;
    private int fee;

    public Violation(String description, int fee) {
        this.description = description;
        this.fee = fee;
    }

    public String getDescription() {
        return description;
    }

    public int getFee() {
        return fee;
    }
}