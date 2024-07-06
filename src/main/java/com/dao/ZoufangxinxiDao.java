package com.dao;

import com.entity.ZoufangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZoufangxinxiVO;
import com.entity.view.ZoufangxinxiView;


/**
 * 走访信息
 * 
 * @author 
 * @email 
 * @date 2021-05-28 13:20:53
 */
public interface ZoufangxinxiDao extends BaseMapper<ZoufangxinxiEntity> {
	
	List<ZoufangxinxiVO> selectListVO(@Param("ew") Wrapper<ZoufangxinxiEntity> wrapper);
	
	ZoufangxinxiVO selectVO(@Param("ew") Wrapper<ZoufangxinxiEntity> wrapper);
	
	List<ZoufangxinxiView> selectListView(@Param("ew") Wrapper<ZoufangxinxiEntity> wrapper);

	List<ZoufangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZoufangxinxiEntity> wrapper);
	
	ZoufangxinxiView selectView(@Param("ew") Wrapper<ZoufangxinxiEntity> wrapper);
	
}
