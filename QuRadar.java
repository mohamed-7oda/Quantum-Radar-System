import java.util.*;

/*
 Quantum Radar System

 This system receives observations from a physical radar including:
 - Plate number
 - Date
 - Car type
 - Speed
 - Seatbelt status

 The radar evaluates every observation using a collection of
 independent traffic rules.

 Zero or more violations may be generated for every observation.
 If violations exist, a traffic fine is created.

 The system is extensible by allowing new rules to be added
 without modifying the radar itself.

 AI Model Used:
 Traffic Violation Detection Model
 (Rule-based AI Decision Engine)
*/

public class QuRadar {

    private List<Rule> rules = new ArrayList<>();
    private List<Fine> fines = new ArrayList<>();
    private Map<String, Integer> violatedRules = new HashMap<>();

    public void addRule(Rule rule) {
        rules.add(rule);
    }

    public void observe(Observation observation) {

        Fine fine = new Fine(observation.getPlateNumber());

        for (Rule rule : rules) {

            Violation violation = rule.check(observation);

            if (violation != null) {
                fine.addViolation(violation);

                violatedRules.put(
                        rule.getRuleName(),
                        violatedRules.getOrDefault(rule.getRuleName(), 0) + 1
                );
            }
        }

        if (!fine.getViolations().isEmpty()) {
            fines.add(fine);
            fine.print();
        }
    }

    public void getAllPossibleFines() {

        System.out.println("All Fines");

        for (Fine fine : fines) {
            System.out.println(
                    fine.getPlateNumber() +
                            " -> " +
                            fine.getTotalAmount() +
                            " EGP"
            );
        }
    }

    public void printViolatedRulesCount() {

        System.out.println("\nRule Violations Count");

        for (String rule : violatedRules.keySet()) {
            System.out.println(rule + " : " + violatedRules.get(rule));
        }
    }
}