package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShequfuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShequfuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShequfuwuView;


/**
 * 社区服务
 *
 * @author 
 * @email 
 * @date 2021-05-28 13:20:53
 */
public interface ShequfuwuService extends IService<ShequfuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShequfuwuVO> selectListVO(Wrapper<ShequfuwuEntity> wrapper);
   	
   	ShequfuwuVO selectVO(@Param("ew") Wrapper<ShequfuwuEntity> wrapper);
   	
   	List<ShequfuwuView> selectListView(Wrapper<ShequfuwuEntity> wrapper);
   	
   	ShequfuwuView selectView(@Param("ew") Wrapper<ShequfuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShequfuwuEntity> wrapper);
   	
}

