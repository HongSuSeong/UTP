package com.main.one.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.one.dao.BoardDao;
import com.main.one.vo.boardVO;

@Service
public class BoardService {
	
	@Autowired BoardDao boardDao;

	public ArrayList<HashMap<String,Object>> getBoardList(HashMap<String,Object> map) {
		return boardDao.getBoardList(map);
	}

	public void newWrite(boardVO board) {
		boardDao.newWrite(board);
	}

}
