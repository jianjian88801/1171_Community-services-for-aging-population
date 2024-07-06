package com.entity.model;

import com.entity.ZoufangrenwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 走访任务
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-28 13:20:53
 */
public class ZoufangrenwuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 任务类型
	 */
	
	private String renwuleixing;
		
	/**
	 * 任务地点
	 */
	
	private String renwudidian;
		
	/**
	 * 任务目标
	 */
	
	private String renwumubiao;
		
	/**
	 * 任务内容
	 */
	
	private String renwuneirong;
		
	/**
	 * 任务日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date renwuriqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 员工工号
	 */
	
	private String yuangonggonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
				
	
	/**
	 * 设置：任务类型
	 */
	 
	public void setRenwuleixing(String renwuleixing) {
		this.renwuleixing = renwuleixing;
	}
	
	/**
	 * 获取：任务类型
	 */
	public String getRenwuleixing() {
		return renwuleixing;
	}
				
	
	/**
	 * 设置：任务地点
	 */
	 
	public void setRenwudidian(String renwudidian) {
		this.renwudidian = renwudidian;
	}
	
	/**
	 * 获取：任务地点
	 */
	public String getRenwudidian() {
		return renwudidian;
	}
				
	
	/**
	 * 设置：任务目标
	 */
	 
	public void setRenwumubiao(String renwumubiao) {
		this.renwumubiao = renwumubiao;
	}
	
	/**
	 * 获取：任务目标
	 */
	public String getRenwumubiao() {
		return renwumubiao;
	}
				
	
	/**
	 * 设置：任务内容
	 */
	 
	public void setRenwuneirong(String renwuneirong) {
		this.renwuneirong = renwuneirong;
	}
	
	/**
	 * 获取：任务内容
	 */
	public String getRenwuneirong() {
		return renwuneirong;
	}
				
	
	/**
	 * 设置：任务日期
	 */
	 
	public void setRenwuriqi(Date renwuriqi) {
		this.renwuriqi = renwuriqi;
	}
	
	/**
	 * 获取：任务日期
	 */
	public Date getRenwuriqi() {
		return renwuriqi;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：员工工号
	 */
	 
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	
	/**
	 * 获取：员工工号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
	}
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
			
}
