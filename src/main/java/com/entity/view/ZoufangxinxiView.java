package com.entity.view;

import com.entity.ZoufangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 走访信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-28 13:20:53
 */
@TableName("zoufangxinxi")
public class ZoufangxinxiView  extends ZoufangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZoufangxinxiView(){
	}
 
 	public ZoufangxinxiView(ZoufangxinxiEntity zoufangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zoufangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
