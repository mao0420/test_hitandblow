import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
class JdbcTemplateSelect {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/")
    public String selectAllData(Model model) {
        String sqlText = "SELECT ID,USER_NAME,TRY_TIMES,START_DATE,END_DATE FROM RECORD_DATA";

        List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sqlText);
        List<Data> dataList = new ArrayList<Data>();

        for (Map<String, Object> result : resultList) {
            Data data = new Data();
            data.setDataId((String) result.get("ID"));
            data.setDataName((String) result.get("USER_NAME"));
            data.setDataTimes((String) result.get("TRY_TIMES"));
            data.setDataStart((String) result.get("START_DATE"));
            data.setDataEnd((String) result.get("END_DATE"));
            dataList.add(data);
        }
        //ランキングボタンクリック時
        String setRankingList = String.valueOf(model.addAttribute("dataList", dataList));
//                    String setRankingList = String.format(Constants.DISPLAY_TEXT_RANKING, Arrays.toString(select * from record_dara));
//                    RankingPanel.labelRanking.setText(setRankingList);
        return "index";
    }
}