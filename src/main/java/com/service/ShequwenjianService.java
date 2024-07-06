package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShequwenjianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShequwenjianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShequwenjianView;


/**
 * 社区文件
 *
 * @author 
 * @email 
 * @date 2021-05-28 13:20:53
 */
public interface ShequwenjianService extends IService<ShequwenjianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShequwenjianVO> selectListVO(Wrapper<ShequwenjianEntity> wrapper);
   	
   	ShequwenjianVO selectVO(@Param("ew") Wrapper<ShequwenjianEntity> wrapper);
   	
   	List<ShequwenjianView> selectListView(Wrapper<ShequwenjianEntity> wrapper);
   	
   	ShequwenjianView selectView(@Param("ew") Wrapper<ShequwenjianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShequwenjianEntity> wrapper);
   	
}

