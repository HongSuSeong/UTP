package com.main.one.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.one.dao.BoardDao;
import com.main.one.vo.boardVO;

@Service
public class BoardService {
	
	@Autowired BoardDao boardDao;

	public ArrayList<boardVO> getBoardList() {
		return boardDao.getBoardList();
	}

	public ArrayList<boardVO> getBoardDetail(String no) {
		return boardDao.getBoardDetail(no);
	}
	
	public void newWriteSave(boardVO boardVO) {
		boardDao.newWriteSave(boardVO);
	}

}
