package com.myblog.mapper;

import com.myblog.pojo.Category;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Lucifer on 2018/6/12.
 */
@Mapper
@Component(value = "CategoryMapper")
public interface CategoryMapper {
    @Select("select * from category")
    List<Category> findAll();

    @Insert("insert into category (name,lev) values (#{name},#{lev})")
    public int save(Category category);

    @Delete("delete from category where id= #{id}")
    public void delete(int id);

    @Select("select * from category where id= #{id}")
    public Category get(int id);

    @Update("update category set name= #{name} where id=#{id}")
    public int update(Category category);
}
