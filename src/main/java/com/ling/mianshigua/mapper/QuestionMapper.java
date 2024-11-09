package com.ling.mianshigua.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ling.mianshigua.model.entity.Question;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

/**
* @author ling
* @description 针对表【question(题目)】的数据库操作Mapper
* @createDate 2024-10-21 23:51:54
* @Entity generator.domain.Question
*/
public interface QuestionMapper extends BaseMapper<Question> {

    /**
     * 查询题目列表（包括已被删除的数据）
     */
    @Select("select * from question where updateTime >= #{minUpdateTime}")
    List<Question> listQuestionWithDelete(Date minUpdateTime);

}




