package bundle;

import io.dummymaker.bundle.impl.BasicBundle;

import java.util.ArrayList;

public class IncidentBundle extends BasicBundle<String> {

    public IncidentBundle() {
        super(new ArrayList<String>() {{
            add("Accident");
            add("Accident");
            add("Breakage");
            add("Breakage");
        }});
    }
}
