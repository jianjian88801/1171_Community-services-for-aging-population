package com.dao;

import com.entity.ZoufangrenwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZoufangrenwuVO;
import com.entity.view.ZoufangrenwuView;


/**
 * 走访任务
 * 
 * @author 
 * @email 
 * @date 2021-05-28 13:20:53
 */
public interface ZoufangrenwuDao extends BaseMapper<ZoufangrenwuEntity> {
	
	List<ZoufangrenwuVO> selectListVO(@Param("ew") Wrapper<ZoufangrenwuEntity> wrapper);
	
	ZoufangrenwuVO selectVO(@Param("ew") Wrapper<ZoufangrenwuEntity> wrapper);
	
	List<ZoufangrenwuView> selectListView(@Param("ew") Wrapper<ZoufangrenwuEntity> wrapper);

	List<ZoufangrenwuView> selectListView(Pagination page,@Param("ew") Wrapper<ZoufangrenwuEntity> wrapper);
	
	ZoufangrenwuView selectView(@Param("ew") Wrapper<ZoufangrenwuEntity> wrapper);
	
}
