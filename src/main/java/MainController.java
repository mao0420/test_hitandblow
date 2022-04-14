import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final DataRepository dataRepository;

    public List<DataDto> write1() {
        List<DataDto> list = dataRepository.getAll();
        return list;
    }
}