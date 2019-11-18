package com.film.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    @Select("SELECT * FROM as_user where id=#{id}")
    List<Map> getById(Long id);


}
