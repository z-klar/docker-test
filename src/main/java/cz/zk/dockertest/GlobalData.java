package cz.zk.dockertest;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Data
@Component
public class GlobalData {

    @Value("${params.param1}")
    private String Param1;
    @Value("${params.param2}")
    private String Param2;
    @Value("${params.param3}")
    private String Param3;

}
