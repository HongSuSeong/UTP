package com.main.one.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.main.one.service.BoardService;
import com.main.one.vo.boardVO;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired BoardService boardService;
	
	@GetMapping("/list")
	public String boardList(Model model) {
		HashMap<String,Object> map = new HashMap<String,Object>();
		ArrayList<HashMap<String,Object>> list = boardService.getBoardList(map);
		model.addAttribute("list", list);
		return "board/list";
	} 
	public String write(boardVO board) {
		boardService.newWrite(board);
		return "redirect:/board/list";
	}
}
