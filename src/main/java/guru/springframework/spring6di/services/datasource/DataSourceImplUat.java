package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("qa")
public class DataSourceImplUat implements DataSource {
    @Override
    public String getDataSource() {
        return "QA Datasource";
    }
}
