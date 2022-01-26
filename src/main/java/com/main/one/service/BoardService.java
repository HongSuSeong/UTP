package com.main.one.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.one.dao.BoardDao;

@Service
public class BoardService {
	
	@Autowired BoardDao boardDao;

	public Object getBoardList() {
		return boardDao.getBoardList();
	}

}
