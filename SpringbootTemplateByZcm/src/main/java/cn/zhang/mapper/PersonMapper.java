package cn.zhang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

import cn.zhang.model.Person;
/**
 * 分页查询测试
 * @author zcm
 * 2017年5月3日下午5:36:35
 */
@CacheNamespace(size = 512)  
public interface PersonMapper {
	@Options(useCache=true,timeout=10000)
	@Select("select count(1) from zcmTest")
	public Integer getCount();
	/**
	 * 全部查询
	 * @return
	 */
	@Select("select * from zcmTest a")
	public List<Person> getAll();
	
	@Transactional
	@Delete("delete from zcmtest a where a.xm='江洋' and a.sfzh='511302760229071' and to_char(a.zjqfrq,'yyyymmdd')='20040108'")
	public void del();
	/**
	 * 分页查询
	 * @param startRowNum开始row
	 * @param endRowNum 结束row
	 * @return
	 */
	@Results({
		@Result(property="name",column="XM"),
		@Result(property="idNum",column="SFZH"),
		@Result(property="gender",column="XB"),
		@Result(property="birthday",column="CSRQ")
	})
	@Select("select * from (select t.*,rownum rn from (select * from zcmtest a)t where rownum <=#{1})where rn >#{0}")
	public List<Person> getAll2(Integer startRowNum,Integer endRowNum);
}
