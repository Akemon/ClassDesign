package com.classDesign.bean;

import java.util.Date;

public class Journal {
    private Integer journalId;

    private Integer journalUserid;

    private String journalTitle;

    private String journalContent;

    private Date publishTime;

    public Integer getJournalId() {
        return journalId;
    }

    public void setJournalId(Integer journalId) {
        this.journalId = journalId;
    }

    public Integer getJournalUserid() {
        return journalUserid;
    }

    public void setJournalUserid(Integer journalUserid) {
        this.journalUserid = journalUserid;
    }

    public String getJournalTitle() {
        return journalTitle;
    }

    public void setJournalTitle(String journalTitle) {
        this.journalTitle = journalTitle == null ? null : journalTitle.trim();
    }

    public String getJournalContent() {
        return journalContent;
    }

    public void setJournalContent(String journalContent) {
        this.journalContent = journalContent == null ? null : journalContent.trim();
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public Journal() {
    }

    public Journal(Integer journalId, Integer journalUserid, String journalTitle, String journalContent, Date publishTime) {
        this.journalId = journalId;
        this.journalUserid = journalUserid;
        this.journalTitle = journalTitle;
        this.journalContent = journalContent;
        this.publishTime = publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }
}