package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZoufangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZoufangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZoufangxinxiView;


/**
 * 走访信息
 *
 * @author 
 * @email 
 * @date 2021-05-28 13:20:53
 */
public interface ZoufangxinxiService extends IService<ZoufangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZoufangxinxiVO> selectListVO(Wrapper<ZoufangxinxiEntity> wrapper);
   	
   	ZoufangxinxiVO selectVO(@Param("ew") Wrapper<ZoufangxinxiEntity> wrapper);
   	
   	List<ZoufangxinxiView> selectListView(Wrapper<ZoufangxinxiEntity> wrapper);
   	
   	ZoufangxinxiView selectView(@Param("ew") Wrapper<ZoufangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZoufangxinxiEntity> wrapper);
   	
}

