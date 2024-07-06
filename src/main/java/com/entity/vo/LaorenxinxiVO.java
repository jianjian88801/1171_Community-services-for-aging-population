package com.entity.vo;

import com.entity.LaorenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 老人信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-28 13:20:53
 */
public class LaorenxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private Integer nianling;
		
	/**
	 * 住址
	 */
	
	private String zhuzhi;
		
	/**
	 * 家属信息
	 */
	
	private String jiashuxinxi;
		
	/**
	 * 是否独居
	 */
	
	private String shifouduju;
		
	/**
	 * 是否生病
	 */
	
	private String shifoushengbing;
		
	/**
	 * 访问周期
	 */
	
	private String fangwenzhouqi;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 员工工号
	 */
	
	private String yuangonggonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：住址
	 */
	 
	public void setZhuzhi(String zhuzhi) {
		this.zhuzhi = zhuzhi;
	}
	
	/**
	 * 获取：住址
	 */
	public String getZhuzhi() {
		return zhuzhi;
	}
				
	
	/**
	 * 设置：家属信息
	 */
	 
	public void setJiashuxinxi(String jiashuxinxi) {
		this.jiashuxinxi = jiashuxinxi;
	}
	
	/**
	 * 获取：家属信息
	 */
	public String getJiashuxinxi() {
		return jiashuxinxi;
	}
				
	
	/**
	 * 设置：是否独居
	 */
	 
	public void setShifouduju(String shifouduju) {
		this.shifouduju = shifouduju;
	}
	
	/**
	 * 获取：是否独居
	 */
	public String getShifouduju() {
		return shifouduju;
	}
				
	
	/**
	 * 设置：是否生病
	 */
	 
	public void setShifoushengbing(String shifoushengbing) {
		this.shifoushengbing = shifoushengbing;
	}
	
	/**
	 * 获取：是否生病
	 */
	public String getShifoushengbing() {
		return shifoushengbing;
	}
				
	
	/**
	 * 设置：访问周期
	 */
	 
	public void setFangwenzhouqi(String fangwenzhouqi) {
		this.fangwenzhouqi = fangwenzhouqi;
	}
	
	/**
	 * 获取：访问周期
	 */
	public String getFangwenzhouqi() {
		return fangwenzhouqi;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
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
