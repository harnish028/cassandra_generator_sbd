package generator;

import bundle.IncidentBundle;
import io.dummymaker.bundle.IBundle;
import io.dummymaker.generator.simple.IGenerator;

public class IncidentGenerator implements IGenerator<String> {

    private final IBundle<String> bundle = new IncidentBundle();

    @Override
    public String generate() {
        return bundle.getRandom();
    }
}
