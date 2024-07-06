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
 * 走访信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-28 13:20:53
 */
@TableName("zoufangxinxi")
public class ZoufangxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZoufangxinxiEntity() {
		
	}
	
	public ZoufangxinxiEntity(T t) {
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
	 * 走访对象
	 */
					
	private String zoufangduixiang;
	
	/**
	 * 走访地址
	 */
					
	private String zoufangdizhi;
	
	/**
	 * 基本情况
	 */
					
	private String jibenqingkuang;
	
	/**
	 * 访问内容
	 */
					
	private String fangwenneirong;
	
	/**
	 * 待解决问题
	 */
					
	private String daijiejuewenti;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 走访日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date zoufangriqi;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
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
	 * 设置：走访对象
	 */
	public void setZoufangduixiang(String zoufangduixiang) {
		this.zoufangduixiang = zoufangduixiang;
	}
	/**
	 * 获取：走访对象
	 */
	public String getZoufangduixiang() {
		return zoufangduixiang;
	}
	/**
	 * 设置：走访地址
	 */
	public void setZoufangdizhi(String zoufangdizhi) {
		this.zoufangdizhi = zoufangdizhi;
	}
	/**
	 * 获取：走访地址
	 */
	public String getZoufangdizhi() {
		return zoufangdizhi;
	}
	/**
	 * 设置：基本情况
	 */
	public void setJibenqingkuang(String jibenqingkuang) {
		this.jibenqingkuang = jibenqingkuang;
	}
	/**
	 * 获取：基本情况
	 */
	public String getJibenqingkuang() {
		return jibenqingkuang;
	}
	/**
	 * 设置：访问内容
	 */
	public void setFangwenneirong(String fangwenneirong) {
		this.fangwenneirong = fangwenneirong;
	}
	/**
	 * 获取：访问内容
	 */
	public String getFangwenneirong() {
		return fangwenneirong;
	}
	/**
	 * 设置：待解决问题
	 */
	public void setDaijiejuewenti(String daijiejuewenti) {
		this.daijiejuewenti = daijiejuewenti;
	}
	/**
	 * 获取：待解决问题
	 */
	public String getDaijiejuewenti() {
		return daijiejuewenti;
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
	 * 设置：走访日期
	 */
	public void setZoufangriqi(Date zoufangriqi) {
		this.zoufangriqi = zoufangriqi;
	}
	/**
	 * 获取：走访日期
	 */
	public Date getZoufangriqi() {
		return zoufangriqi;
	}
	/**
	 * 设置：照片
	 */
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
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
