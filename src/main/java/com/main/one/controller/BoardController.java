package com.main.one.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.main.one.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired BoardService boardService;
	
	public ModelAndView boardList() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("board",boardService.getBoardList());
		mv.setViewName("board/boardList");
		return mv;
	} 
}
