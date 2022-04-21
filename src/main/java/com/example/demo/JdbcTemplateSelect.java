package com.example.demo;

import com.example.demo.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class JdbcTemplateSelect {

    @Autowired
    static
    JdbcTemplate jdbcTemplate;

    @GetMapping("/")
    public String selectAllData() {
        String sqlText = "SELECT user_name, try_times, ROUND((end_date - start_date) * 86400) AS play_times FROM record_data ORDER BY try_times, play_times";

        List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sqlText);
        List<Data> dataList = new ArrayList<Data>();

        for (Map<String, Object> result : resultList) {
            Data data = new Data();
            data.setUserName((String) result.get("user_name"));
            data.setTryTimes(String.valueOf(result.get("try_times")));
            data.setPlayTimes(String.valueOf(result.get("play_times")));
            dataList.add(data);
        }
        return String.valueOf(dataList);
    }
}