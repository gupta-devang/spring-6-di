package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class DataSourceImplProd implements DataSource {
    @Override
    public String getDataSource() {
        return "Prod Datasource";
    }
}
