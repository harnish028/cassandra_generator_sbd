package generator;

import bundle.InspectionResultBundle;
import io.dummymaker.bundle.IBundle;
import io.dummymaker.generator.simple.IGenerator;

public class InspectionResultGenerator implements IGenerator<String> {

    private final IBundle<String> bundle = new InspectionResultBundle();

    @Override
    public String generate() {
        return bundle.getRandom();
    }
}
