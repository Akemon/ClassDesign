package com.classDesign.service;

import com.classDesign.bean.LeaveMessage;
import com.classDesign.bean.LeaveMessageExample;
import com.classDesign.dao.LeaveMessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveMessageService {

    @Autowired
    LeaveMessageMapper leaveMessageMapper;

    /**
     * 树洞留言
     * @param leaveMessage
     */
    public void leaveMessagetoSomeOne(LeaveMessage leaveMessage){
        leaveMessageMapper.insertSelective(leaveMessage);
    }

    /**
     * 获取某人的树洞所有留言
     * @param userId
     * @return
     */
    public List<LeaveMessage> getSomeoneAllLeaveMessage(int userId){
        LeaveMessageExample leaveMessageExample =new LeaveMessageExample();
        LeaveMessageExample.Criteria criteria =leaveMessageExample.createCriteria();
        criteria.andUseridEqualTo(userId);
        return leaveMessageMapper.selectByExample(leaveMessageExample);
    }
}
