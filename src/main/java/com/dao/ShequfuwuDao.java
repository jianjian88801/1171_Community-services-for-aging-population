package com.dao;

import com.entity.ShequfuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShequfuwuVO;
import com.entity.view.ShequfuwuView;


/**
 * 社区服务
 * 
 * @author 
 * @email 
 * @date 2021-05-28 13:20:53
 */
public interface ShequfuwuDao extends BaseMapper<ShequfuwuEntity> {
	
	List<ShequfuwuVO> selectListVO(@Param("ew") Wrapper<ShequfuwuEntity> wrapper);
	
	ShequfuwuVO selectVO(@Param("ew") Wrapper<ShequfuwuEntity> wrapper);
	
	List<ShequfuwuView> selectListView(@Param("ew") Wrapper<ShequfuwuEntity> wrapper);

	List<ShequfuwuView> selectListView(Pagination page,@Param("ew") Wrapper<ShequfuwuEntity> wrapper);
	
	ShequfuwuView selectView(@Param("ew") Wrapper<ShequfuwuEntity> wrapper);
	
}
