package com.main.one.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.main.one.vo.boardVO;

@Repository
public interface BoardDao {

	public ArrayList<boardVO> getBoardList();

	public ArrayList<boardVO> getBoardDetail(String no);

	public void newWriteSave(boardVO boardVO);

	

}
