package com.learn.dao;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface LogDao {
    @Insert("insert into log (info, create_time) values (#{info}, now())")
    void log(String info);
}
