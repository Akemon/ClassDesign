package com.classDesign.controller;

import com.classDesign.bean.LeaveMessage;
import com.classDesign.bean.Message;
import com.classDesign.service.LeaveMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
public class LeaveMessageController {

    @Autowired
    LeaveMessageService leaveMessageService;

    /**
     * 给某人留言
     * @param leaveMessage
     */
    @RequestMapping("/leaveMessageToSomeone")
    public Message leaveMessageToSomeone(LeaveMessage leaveMessage){
        leaveMessageService.leaveMessagetoSomeOne(leaveMessage);
        return Message.success();
    }

    @RequestMapping("/getSomeoneAllLeaveMessage")
    public Message getSomeoneAllLeaveMessage(@RequestParam int userId){
        List<LeaveMessage> someoneAllLeaveMessage = leaveMessageService.getSomeoneAllLeaveMessage(userId);
        return Message.success().add("messageList",someoneAllLeaveMessage);
    }

}
