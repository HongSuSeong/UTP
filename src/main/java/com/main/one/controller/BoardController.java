package com.main.one.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.main.one.service.BoardService;
import com.main.one.vo.boardVO;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired BoardService boardService;
	
	@GetMapping("/list")
	public String list(Model model) {
		ArrayList<boardVO> list = boardService.getBoardList();
		model.addAttribute("list", list);
		return "board/list";
	} 
	
	@GetMapping("/detail")
	public ModelAndView detail(@RequestParam String no) {
		ModelAndView mv = new ModelAndView();
		ArrayList<boardVO> list = boardService.getBoardDetail(no);
		mv.addObject("list", list);
		mv.setViewName("board/detail");
		return mv;
	}
	
	@GetMapping("/newWrite")
	public ModelAndView newWrite(@RequestParam boardVO boardVO) {
		ModelAndView mv = new ModelAndView();
		ArrayList<boardVO> list = boardService.getBoardList();
		mv.addObject("list", list);
		mv.setViewName("board/newWrite");
		return mv;
	}
	
	@PostMapping("/newWriteSave")
	public String newWriteSave(@RequestBody boardVO boardVO) {
		boardService.newWriteSave(boardVO);
		return "redirect:/board/list";
	} 
}
