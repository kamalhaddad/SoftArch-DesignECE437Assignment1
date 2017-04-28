import java.util.HashSet;
import java.util.Set;

public class TASystem implements TAObject {
    Set<TAComponent> componentSet;
    Set<TAInteraction> interactionSet;

    public TASystem() {
        componentSet = new HashSet<>();
        interactionSet = new HashSet<>();
    }

    public boolean addComponent(TAComponent component) {
        return componentSet.add(component);
    }

    public boolean addInteraction(TAInteraction interaction) {
        return interactionSet.add(interaction);
    }

    // returns true if a conflict is found
    public boolean checkConflicts() {
        Set<TAComponent> componentsBuffer = new HashSet<>();
        for (TAInteraction interaction : interactionSet) {
            Set<TAComponent> currentComponents = interaction.getComponents();

            // get intersection between current interaction and all previous interactions
            Set<TAComponent> intersection = new HashSet<>(currentComponents);
            intersection.retainAll(componentsBuffer);
            // if intersection of sets is not empty then there is a conflict between interactions
            if (!intersection.isEmpty())
                return true;
            componentsBuffer.addAll(currentComponents);
        }

        return false;
    }

    public boolean deadlockCheck() {
        for (TAInteraction interaction : interactionSet) {
            if (interaction.readyCheck())
                return true;
        }
        return false;
    }

    public void list() {
        System.out.println("----- System -----");
        for (TAComponent component : componentSet)
            component.list();

        for (TAInteraction interaction : interactionSet)
            interaction.list();

        System.out.println("------------------");
    }

    public void printState() {
        if (!deadlockCheck())
            System.out.println("There are interactions ready to execute.");
        else
            System.out.println("The system is in a deadlock state. :(");
    }

    // Execute for one step
    public void execute() {
        execute(1);
    }


    // Execute for a certain number of steps
    public void execute(int steps) {
        Set<TAInteraction> readyInteractions = new HashSet<>();
        for (TAInteraction interaction : interactionSet)
            if (interaction.readyCheck())
                readyInteractions.add(interaction);

        TAConcurrent interactionsHead;
        for (TAInteraction interaction : readyInteractions) {
            getNonConflicting(readyInteractions);
        }
    }

    // Returns the set of non conflicting interactions inside
    private Set<TAInteraction> getNonConflicting(Set<TAInteraction> interactions) {
        Set<TAInteraction> nonConflicts = new HashSet<>();
        Set<TAComponent> componentsBuffer = new HashSet<>();
        for (TAInteraction interaction : interactions) {
            Set<TAComponent> currentComponents = interaction.getComponents();

            // get intersection between current interaction and all previous interactions
            Set<TAComponent> intersection = new HashSet<>(currentComponents);
            intersection.retainAll(componentsBuffer);
            // if intersection of sets is empty then there is no conflict between interactions
            if (intersection.isEmpty()) {
                componentsBuffer.addAll(currentComponents);
                nonConflicts.add(interaction);
            }
        }
        return nonConflicts;
    }
}
