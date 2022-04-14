import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class DataDto {
    private String ID;
    private String USER_NAME;
    private String TRY_TIMES;
    private Date START_DATE;
    private Date END_DATE;
}