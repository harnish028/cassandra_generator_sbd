package bundle;

import io.dummymaker.bundle.impl.BasicBundle;

import java.util.ArrayList;

public class InspectionResultBundle extends BasicBundle<String> {

    public InspectionResultBundle() {
        super(new ArrayList<String>() {{
            add("Ok");
            add("Faulty");
            add("Operational");
            add("Disabled");
        }});
    }
}
