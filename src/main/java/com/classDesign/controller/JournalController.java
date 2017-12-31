package com.classDesign.controller;

import com.classDesign.bean.Journal;
import com.classDesign.bean.Message;
import com.classDesign.dao.JournalMapper;
import com.classDesign.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class JournalController {
    @Autowired
    JournalService journalService;

    @RequestMapping("/getAllJournalByUserID")
    @ResponseBody
    public Message getAllJournalByUserID(Journal journal){
        return Message.success().add("result",journalService.getAllJournal(journal.getJournalUserid()));
    }

    @RequestMapping("/publishJournal")
    @ResponseBody
    public Message publicshJournal(Journal journal){
        journalService.publishJournal(journal);
        return Message.success();
    }
}
