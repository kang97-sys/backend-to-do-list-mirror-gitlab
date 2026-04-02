package com.kdh.todo.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class TodoDTO {
    private Long goalSeq;        // GOAL_SEQ
    private String userId;       // USER_ID
    private String goalDate;     // GOAL_DATE (YYYYMMDD)
    private String title;        // TITLE
    private String content;      // CONTENT
    private Integer achieveRate; // ACHIEVE_RATE
    private String statusYn;     // STATUS_YN
    private String insertId;     // INSERT_ID
    private LocalDateTime insertDts; // INSERT_DTS
    private String updateId;     // UPDATE_ID
    private LocalDateTime updateDts; // UPDATE_DTS
	public Long getGoalSeq() {
		return goalSeq;
	}
	public void setGoalSeq(Long goalSeq) {
		this.goalSeq = goalSeq;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getGoalDate() {
		return goalDate;
	}
	public void setGoalDate(String goalDate) {
		this.goalDate = goalDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getAchieveRate() {
		return achieveRate;
	}
	public void setAchieveRate(Integer achieveRate) {
		this.achieveRate = achieveRate;
	}
	public String getStatusYn() {
		return statusYn;
	}
	public void setStatusYn(String statusYn) {
		this.statusYn = statusYn;
	}
	public String getInsertId() {
		return insertId;
	}
	public void setInsertId(String insertId) {
		this.insertId = insertId;
	}
	public LocalDateTime getInsertDts() {
		return insertDts;
	}
	public void setInsertDts(LocalDateTime insertDts) {
		this.insertDts = insertDts;
	}
	public String getUpdateId() {
		return updateId;
	}
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}
	public LocalDateTime getUpdateDts() {
		return updateDts;
	}
	public void setUpdateDts(LocalDateTime updateDts) {
		this.updateDts = updateDts;
	}
    
}