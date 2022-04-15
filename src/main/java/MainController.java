import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainController {
//    private final DataRepository dataRepository;
    private final DataRepository dataRepository = new DataRepository(new JdbcTemplate());

    public List<DataDto> write1() {
        List<DataDto> list = dataRepository.getAll();
        return list;
    }
}