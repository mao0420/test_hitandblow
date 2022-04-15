import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class DataRepository {
    private final JdbcTemplate jdbcTemplate;

    public List<DataDto> getAll() {
        String sql = "select ID,USER_NAME,TRY_TIMES,START_DATE,END_DATE from record_data";
        List<Map<String, Object>> dataList = jdbcTemplate.queryForList(sql);
        List<DataDto> list = new ArrayList<>();
        for (Map<String, Object> data : dataList) {
            list.add(new DataDto(
                    (String) data.get("ID"),
                    (String) data.get("USER_NAME"),
                    (String) data.get("TRY_TIMES"),
                    (Date) data.get("START_DATE"),
                    (Date) data.get("END_DATE")));
        }
        return list;
    }
}