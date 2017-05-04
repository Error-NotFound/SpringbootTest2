package cn.zhang.service.dummy;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.zhang.mapper.PersonMapper;
import cn.zhang.model.Person;
import cn.zhang.service.PageService;
import cn.zhang.util.PageModel;
@Service("pageService")
public class PageServiceImpl implements PageService {
	@Resource
	PersonMapper personDao;
	@Resource
	PageModel pageModel;
	@Override
	public Integer getCount() {
		// TODO Auto-generated method stub
		return personDao.getCount();
	}

	@Override
	public List<Person> getAll(Integer startRowNum, Integer endRowNum) {
		// TODO Auto-generated method stub
		return personDao.getAll2(startRowNum, endRowNum);
	}
	@Override
	public PageModel getAllByPage(Integer pageNo,Integer pageSize){
		pageModel.setPageNo(pageNo);
		pageModel.setPageSize(pageSize);
		pageModel.setTotalRecords(getCount());
		
		Integer startRowNum=pageModel.getPreviousPageNo()*pageSize;
		Integer endRowNum=pageSize*pageNo;
		List<Person> list=getAll(startRowNum,endRowNum);
		pageModel.setList(list);
		return pageModel;
	}
	@Override
	public void del() {
		// TODO Auto-generated method stub
		personDao.del();
	}

}
