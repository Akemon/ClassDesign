package com.classDesign.dao;

import com.classDesign.bean.Journal;
import com.classDesign.bean.JournalExample;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface JournalMapper {
    long countByExample(JournalExample example);

    int deleteByExample(JournalExample example);

    int deleteByPrimaryKey(Integer journalId);

    int insert(Journal record);

    int insertSelective(Journal record);

    List<Journal> selectByExample(JournalExample example);

    Journal selectByPrimaryKey(Integer journalId);

    int updateByExampleSelective(@Param("record") Journal record, @Param("example") JournalExample example);

    int updateByExample(@Param("record") Journal record, @Param("example") JournalExample example);

    int updateByPrimaryKeySelective(Journal record);

    int updateByPrimaryKey(Journal record);

}