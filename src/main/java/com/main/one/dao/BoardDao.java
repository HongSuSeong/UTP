package com.main.one.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.main.one.vo.boardVO;

@Repository
public interface BoardDao {

	public ArrayList<HashMap<String,Object>> getBoardList(HashMap<String,Object>map);

	public Object newWrite(boardVO board);

}
