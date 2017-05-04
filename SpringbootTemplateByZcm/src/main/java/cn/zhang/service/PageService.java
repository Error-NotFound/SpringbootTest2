package cn.zhang.service;

import java.util.List;

import cn.zhang.model.Person;
import cn.zhang.util.PageModel;

public interface PageService {
	public Integer getCount();
	public List<Person> getAll(Integer startRowNum,Integer endRowNum);
	public PageModel getAllByPage(Integer pageNo,Integer pageSize);
	void del();
}
