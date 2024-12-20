package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dev","default"})
public class DataSourceImplDev implements DataSource {
    @Override
    public String getDataSource() {
        return "Dev DataSource";
    }
}
