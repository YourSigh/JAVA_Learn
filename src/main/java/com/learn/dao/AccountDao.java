package com.learn.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao {
    @Update("update user set money = money + #{money} where username = #{username}")
    void inMoney(@Param("username") String username, @Param("money") double money);

    @Update("update user set money = money - #{money} where username = #{username}")
    void outMoney(@Param("username") String username, @Param("money") double money);
}
