package com.main.one.vo;

import org.apache.ibatis.type.Alias;

@Alias("boardVO")
public class boardVO {
		
	String no;
	String title;
	String contents;
	String regUser;
	String regDate;
	int readCount;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getRegUser() {
		return regUser;
	}
	public void setRegUser(String regUser) {
		this.regUser = regUser;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	@Override
	public String toString() {
		return "boardVO [no=" + no + ", title=" + title + ", contents=" + contents + ", regUser=" + regUser
				+ ", regDate=" + regDate + ", readCount=" + readCount + "]";
	}
}
