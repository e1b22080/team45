package oit.is.z2636.dai5.team4.team45.model;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FruitMapper {
  @Select("SELECT * FROM fruit;")
  ArrayList<Fruit> selectAllFruit();
}
