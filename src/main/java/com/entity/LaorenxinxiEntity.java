package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 老人信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-28 13:20:53
 */
@TableName("laorenxinxi")
public class LaorenxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LaorenxinxiEntity() {
		
	}
	
	public LaorenxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 老人姓名
	 */
					
	private String laorenxingming;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：老人姓名
	 */
	public void setLaorenxingming(String laorenxingming) {
		this.laorenxingming = laorenxingming;
	}
	/**
	 * 获取：老人姓名
	 */
	public String getLaorenxingming() {
		return laorenxingming;
	}
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
