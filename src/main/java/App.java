import io.dummymaker.export.IExporter;
import io.dummymaker.export.impl.JsonExporter;
import io.dummymaker.factory.IProduceFactory;
import io.dummymaker.factory.impl.GenProduceFactory;
import model.HistoryOfIncident;

import java.util.List;

public class App {

    public static void main(String[] args) {

        IProduceFactory factory = new GenProduceFactory();

        List<HistoryOfIncident> historyOfIncidentList = factory.produce(HistoryOfIncident.class, 150 );

        IExporter exporter = new JsonExporter().withPretty();

        exporter.export(historyOfIncidentList);
    }
}
