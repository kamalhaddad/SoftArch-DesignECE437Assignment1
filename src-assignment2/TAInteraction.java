import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TAInteraction implements TAObject {
    Map<TAComponent, TAPort> components; // The values set of this map are the set of ports in the interaction
    TAFormula guard;
    TAStatement action;

    public TAInteraction() {
        components = new HashMap<>();
    }

    public void addComponent(TAComponent component, TAPort port) {
        if (!components.containsKey(component))
            components.put(component, port);
    }

    public void addGuard(TAFormula guard) { this.guard = guard; }
    public void addAction(TAStatement action) { this.action = action; }
    public Set<TAComponent> getComponents() { return components.keySet(); }

    public void list() {
        System.out.println("---- Interaction ----");
        System.out.println("Components and their Ports: " + components.toString());
        System.out.println("Guard: ");
        guard.list();
        System.out.println("Action: ");
        action.list();
    }

    // returns true if the interaction is ready to execute and false otherwise
    public boolean readyCheck() {
        guard.evaluate();
        if (!guard.getValue()) { return false; }

        for (Map.Entry<TAComponent, TAPort> entry : components.entrySet()) {
            TAComponent component = entry.getKey();
            TAPort port = entry.getValue();
            if (component.getPortTransition(port) == null) {
                return false;
            }
        }

        return  true;
    }

    // TODO: Store components in a concurrent list and then evaluate concurrently
    public void evaluate() {
        action.evaluate();
        for (TAComponent component : components.keySet()) {
            component.evaluate();
        }
    }
}
