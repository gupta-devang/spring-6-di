package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.datasource.DataSource;
import org.springframework.stereotype.Controller;

@Controller
public class FauxController {
    private final DataSource dataSource;

    public FauxController(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String getDataSource() {
        return dataSource.getDataSource();
    }
}
