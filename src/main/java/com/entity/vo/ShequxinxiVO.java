package com.entity.vo;

import com.entity.ShequxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 社区信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-28 13:20:53
 */
public class ShequxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 隶属街道
	 */
	
	private String lishujiedao;
		
	/**
	 * 社区地址
	 */
	
	private String shequdizhi;
		
	/**
	 * 常住人口
	 */
	
	private Integer changzhurenkou;
		
	/**
	 * 老龄人口
	 */
	
	private Integer laolingrenkou;
		
	/**
	 * 社区介绍
	 */
	
	private String shequjieshao;
		
	/**
	 * 社区邮箱
	 */
	
	private String shequyouxiang;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 社区图片
	 */
	
	private String shequtupian;
				
	
	/**
	 * 设置：隶属街道
	 */
	 
	public void setLishujiedao(String lishujiedao) {
		this.lishujiedao = lishujiedao;
	}
	
	/**
	 * 获取：隶属街道
	 */
	public String getLishujiedao() {
		return lishujiedao;
	}
				
	
	/**
	 * 设置：社区地址
	 */
	 
	public void setShequdizhi(String shequdizhi) {
		this.shequdizhi = shequdizhi;
	}
	
	/**
	 * 获取：社区地址
	 */
	public String getShequdizhi() {
		return shequdizhi;
	}
				
	
	/**
	 * 设置：常住人口
	 */
	 
	public void setChangzhurenkou(Integer changzhurenkou) {
		this.changzhurenkou = changzhurenkou;
	}
	
	/**
	 * 获取：常住人口
	 */
	public Integer getChangzhurenkou() {
		return changzhurenkou;
	}
				
	
	/**
	 * 设置：老龄人口
	 */
	 
	public void setLaolingrenkou(Integer laolingrenkou) {
		this.laolingrenkou = laolingrenkou;
	}
	
	/**
	 * 获取：老龄人口
	 */
	public Integer getLaolingrenkou() {
		return laolingrenkou;
	}
				
	
	/**
	 * 设置：社区介绍
	 */
	 
	public void setShequjieshao(String shequjieshao) {
		this.shequjieshao = shequjieshao;
	}
	
	/**
	 * 获取：社区介绍
	 */
	public String getShequjieshao() {
		return shequjieshao;
	}
				
	
	/**
	 * 设置：社区邮箱
	 */
	 
	public void setShequyouxiang(String shequyouxiang) {
		this.shequyouxiang = shequyouxiang;
	}
	
	/**
	 * 获取：社区邮箱
	 */
	public String getShequyouxiang() {
		return shequyouxiang;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：社区图片
	 */
	 
	public void setShequtupian(String shequtupian) {
		this.shequtupian = shequtupian;
	}
	
	/**
	 * 获取：社区图片
	 */
	public String getShequtupian() {
		return shequtupian;
	}
			
}
