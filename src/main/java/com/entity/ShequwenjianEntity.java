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
 * 社区文件
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-28 13:20:53
 */
@TableName("shequwenjian")
public class ShequwenjianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShequwenjianEntity() {
		
	}
	
	public ShequwenjianEntity(T t) {
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
	 * 文件编号
	 */
					
	private String wenjianbianhao;
	
	/**
	 * 文件名称
	 */
					
	private String wenjianmingcheng;
	
	/**
	 * 文件内容
	 */
					
	private String wenjianneirong;
	
	/**
	 * 文件下载
	 */
					
	private String wenjianxiazai;
	
	/**
	 * 发布人
	 */
					
	private String faburen;
	
	/**
	 * 发布日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	
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
	 * 设置：文件编号
	 */
	public void setWenjianbianhao(String wenjianbianhao) {
		this.wenjianbianhao = wenjianbianhao;
	}
	/**
	 * 获取：文件编号
	 */
	public String getWenjianbianhao() {
		return wenjianbianhao;
	}
	/**
	 * 设置：文件名称
	 */
	public void setWenjianmingcheng(String wenjianmingcheng) {
		this.wenjianmingcheng = wenjianmingcheng;
	}
	/**
	 * 获取：文件名称
	 */
	public String getWenjianmingcheng() {
		return wenjianmingcheng;
	}
	/**
	 * 设置：文件内容
	 */
	public void setWenjianneirong(String wenjianneirong) {
		this.wenjianneirong = wenjianneirong;
	}
	/**
	 * 获取：文件内容
	 */
	public String getWenjianneirong() {
		return wenjianneirong;
	}
	/**
	 * 设置：文件下载
	 */
	public void setWenjianxiazai(String wenjianxiazai) {
		this.wenjianxiazai = wenjianxiazai;
	}
	/**
	 * 获取：文件下载
	 */
	public String getWenjianxiazai() {
		return wenjianxiazai;
	}
	/**
	 * 设置：发布人
	 */
	public void setFaburen(String faburen) {
		this.faburen = faburen;
	}
	/**
	 * 获取：发布人
	 */
	public String getFaburen() {
		return faburen;
	}
	/**
	 * 设置：发布日期
	 */
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}

}
