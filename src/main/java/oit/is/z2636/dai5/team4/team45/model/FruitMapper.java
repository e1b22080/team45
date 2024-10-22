package oit.is.z2636.dai5.team4.team45.model;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;

@Mapper
public interface FruitMapper {
  @Select("SELECT * FROM fruit;")
  ArrayList<Fruit> selectAllFruit();

  @Delete("DELETE FROM FRUIT WHERE Id= #{id}")
  boolean deleteById(int id);

  @Select("SELECT * FROM fruit WHERE Id=#{id};")
  Fruit selectById(int id);

}
