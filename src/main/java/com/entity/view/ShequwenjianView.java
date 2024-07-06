package com.entity.view;

import com.entity.ShequwenjianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 社区文件
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-28 13:20:53
 */
@TableName("shequwenjian")
public class ShequwenjianView  extends ShequwenjianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShequwenjianView(){
	}
 
 	public ShequwenjianView(ShequwenjianEntity shequwenjianEntity){
 	try {
			BeanUtils.copyProperties(this, shequwenjianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
