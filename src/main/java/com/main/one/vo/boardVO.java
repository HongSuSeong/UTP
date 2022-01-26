package com.main.one.vo;

import org.apache.ibatis.type.Alias;

@Alias("boardVO")
public class boardVO {
		
	String no;
	String title;
	String contents;
	String regUser;
	String regDate;
}
