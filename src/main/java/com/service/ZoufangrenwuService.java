package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZoufangrenwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZoufangrenwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZoufangrenwuView;


/**
 * 走访任务
 *
 * @author 
 * @email 
 * @date 2021-05-28 13:20:53
 */
public interface ZoufangrenwuService extends IService<ZoufangrenwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZoufangrenwuVO> selectListVO(Wrapper<ZoufangrenwuEntity> wrapper);
   	
   	ZoufangrenwuVO selectVO(@Param("ew") Wrapper<ZoufangrenwuEntity> wrapper);
   	
   	List<ZoufangrenwuView> selectListView(Wrapper<ZoufangrenwuEntity> wrapper);
   	
   	ZoufangrenwuView selectView(@Param("ew") Wrapper<ZoufangrenwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZoufangrenwuEntity> wrapper);
   	
}

