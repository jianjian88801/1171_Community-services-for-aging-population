package com.dao;

import com.entity.ShequwenjianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShequwenjianVO;
import com.entity.view.ShequwenjianView;


/**
 * 社区文件
 * 
 * @author 
 * @email 
 * @date 2021-05-28 13:20:53
 */
public interface ShequwenjianDao extends BaseMapper<ShequwenjianEntity> {
	
	List<ShequwenjianVO> selectListVO(@Param("ew") Wrapper<ShequwenjianEntity> wrapper);
	
	ShequwenjianVO selectVO(@Param("ew") Wrapper<ShequwenjianEntity> wrapper);
	
	List<ShequwenjianView> selectListView(@Param("ew") Wrapper<ShequwenjianEntity> wrapper);

	List<ShequwenjianView> selectListView(Pagination page,@Param("ew") Wrapper<ShequwenjianEntity> wrapper);
	
	ShequwenjianView selectView(@Param("ew") Wrapper<ShequwenjianEntity> wrapper);
	
}
