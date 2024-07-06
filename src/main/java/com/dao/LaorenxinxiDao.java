package com.dao;

import com.entity.LaorenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LaorenxinxiVO;
import com.entity.view.LaorenxinxiView;


/**
 * 老人信息
 * 
 * @author 
 * @email 
 * @date 2021-05-28 13:20:53
 */
public interface LaorenxinxiDao extends BaseMapper<LaorenxinxiEntity> {
	
	List<LaorenxinxiVO> selectListVO(@Param("ew") Wrapper<LaorenxinxiEntity> wrapper);
	
	LaorenxinxiVO selectVO(@Param("ew") Wrapper<LaorenxinxiEntity> wrapper);
	
	List<LaorenxinxiView> selectListView(@Param("ew") Wrapper<LaorenxinxiEntity> wrapper);

	List<LaorenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LaorenxinxiEntity> wrapper);
	
	LaorenxinxiView selectView(@Param("ew") Wrapper<LaorenxinxiEntity> wrapper);
	
}
