package com.classDesign.service;

import com.classDesign.bean.Journal;
import com.classDesign.bean.JournalExample;
import com.classDesign.dao.JournalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class JournalService {
    @Autowired
    JournalMapper journalMapper;

    /**
     * 获取固定用户的所有日志
     * @param userId
     * @return
     */
    public List<Journal> getAllJournal(Integer userId){
        JournalExample journalExample =new JournalExample();
        JournalExample.Criteria criteria =journalExample.createCriteria();
        criteria.andJournalUseridEqualTo(userId);
        return journalMapper.selectByExample(journalExample);
    }

    public void publishJournal(Journal journal){
        Date date =new Date();
        journal.setPublishTime(date);
        journalMapper.insertSelective(journal);
    }

}
