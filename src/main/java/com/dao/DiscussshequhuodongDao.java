package com.dao;

import com.entity.DiscussshequhuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshequhuodongVO;
import com.entity.view.DiscussshequhuodongView;


/**
 * 社区活动评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-28 13:20:53
 */
public interface DiscussshequhuodongDao extends BaseMapper<DiscussshequhuodongEntity> {
	
	List<DiscussshequhuodongVO> selectListVO(@Param("ew") Wrapper<DiscussshequhuodongEntity> wrapper);
	
	DiscussshequhuodongVO selectVO(@Param("ew") Wrapper<DiscussshequhuodongEntity> wrapper);
	
	List<DiscussshequhuodongView> selectListView(@Param("ew") Wrapper<DiscussshequhuodongEntity> wrapper);

	List<DiscussshequhuodongView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshequhuodongEntity> wrapper);
	
	DiscussshequhuodongView selectView(@Param("ew") Wrapper<DiscussshequhuodongEntity> wrapper);
	
}
