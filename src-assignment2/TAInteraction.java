import java.util.HashMap;
import java.util.Map;

public class TAInteraction {
    Map<TAComponent, TAPort> components;
    TAFormula guard;
    TAStatement action;

    public TAInteraction() {
        components = new HashMap<>();
    }

    public void addComponent(TAComponent component, TAPort port) {
        components.put(component, port);
    }

    public void addGuard(TAFormula guard) { this.guard = guard; }
    public void addAction(TAStatement action) { this.action = action; }

    public void listInteraction() {
        System.out.println("---- Interaction ----");
        System.out.println("Components and their Ports: " + components.toString());
        System.out.println("Guard: ");
        guard.list();
        System.out.println("Action: ");
        action.list();
    }

    public boolean readyCheck() {
        guard.evaluate();
        if (!guard.getValue()) { return false; }

        for (Map.Entry<TAComponent, TAPort> entry : components.entrySet()) {
            TAComponent component = entry.getKey();
            TAPort port = entry.getValue();
            if (component.isPortReady(port) == null) {
                return false;
            }
        }

        return  true;
    }

    public void evaluate() {
        action.evaluate();
        for (TAComponent component : components.keySet()) {
            component.evaluate();

        }
    }
}
