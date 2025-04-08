package com.learn.dao;

import com.learn.domain.Users;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersDao {
    @Insert("insert into user(name, pwd) values (#{name}, #{pwd})})")
    void save(Users users);
    @Update("update user set name=#{name}, pwd=#{pwd} where id = #{id}")
    void update(String name,String pwd,Integer id);
    @Delete("delete from user where id = #{id}")
    void delete(Integer id);
    @Select("select * from user")
    List<Users> findAll();
    @Select("select * from user where id = #{id}")
    Users findById(Integer id);
}
