package com.test.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用JdbcTemplate访问数据库
 * 
 * @author admin
 *
 */
@RestController
@RequestMapping("/mydb")
public class StudentController {
		
	@Autowired
    private JdbcTemplate jdbcTemplate;
    
    @RequestMapping("/getStudent")
    public List<Map<String, Object>> getStudent(){
        String sql = "select * from student";
        List<Map<String, Object>> list =  jdbcTemplate.queryForList(sql);
        /*for (Map<String, Object> map : list) {
            Set<Entry<String, Object>> entries = map.entrySet( );
                if(entries != null) {
                    Iterator<Entry<String, Object>> iterator = entries.iterator( );
                    while(iterator.hasNext( )) {
                    Entry<String, Object> entry =(Entry<String, Object>) iterator.next( );
                    Object key = entry.getKey( );
                    Object value = entry.getValue();
                    System.out.println(key+":"+value);
                }
            }
        }*/
        return list;
    }
    
    /*@RequestMapping("/student/{id}")
    public Map<String,Object> getUser(@PathVariable String id){
        Map<String,Object> map = null;
        List<Map<String, Object>> list = getStudent();
        for (Map<String, Object> dbmap : list) {
        	Set<Entry<String, Object>> entries = map.entrySet();
            Set<String> set = dbmap.keySet();
            for (String key : set) {
            	//逻辑有点问题, 需要完善
                if(key.equals("id")){    
                    if(dbmap.get(key).equals(id)){
                        map = dbmap;
                    }
                }
            }
        }
        if(map==null)
            map = list.get(0);
        return map;
    }*/
    

}
