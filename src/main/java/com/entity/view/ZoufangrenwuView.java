package com.entity.view;

import com.entity.ZoufangrenwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 走访任务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-28 13:20:53
 */
@TableName("zoufangrenwu")
public class ZoufangrenwuView  extends ZoufangrenwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZoufangrenwuView(){
	}
 
 	public ZoufangrenwuView(ZoufangrenwuEntity zoufangrenwuEntity){
 	try {
			BeanUtils.copyProperties(this, zoufangrenwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
