package cn.zhang.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.zhang.service.PageService;
import cn.zhang.util.PageModel;

@RestController
@RequestMapping("/pageController")
public class PageController {
	@Resource
	PageService pageService;
	@RequestMapping(value="getAllByPage",method=RequestMethod.GET)
	public Map<String,Object> getAllByPage(@RequestParam("pageNo")Integer pageNo,@RequestParam("pageSize")Integer pageSize){
		Map<String,Object> map=new HashMap<String,Object>();
		PageModel pageModel= pageService.getAllByPage(pageNo, pageSize);
		map.put("pageModel", pageModel);
		return map;
	}
	
	@RequestMapping(value="del",method=RequestMethod.GET)
	public Map<String,Object> delTest(){
		pageService.del();
		return null;
	}
}
