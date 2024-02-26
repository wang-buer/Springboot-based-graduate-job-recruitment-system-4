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
 * 空中宣讲会
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-04 10:02:53
 */
@TableName("kongzhongxuanjianghui")
public class KongzhongxuanjianghuiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KongzhongxuanjianghuiEntity() {
		
	}
	
	public KongzhongxuanjianghuiEntity(T t) {
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
	 * 企业编号
	 */
					
	private String qiyebianhao;
	
	/**
	 * 企业名称
	 */
					
	private String qiyemingcheng;
	
	/**
	 * 规模
	 */
					
	private String guimo;
	
	/**
	 * 性质
	 */
					
	private String xingzhi;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 联系人
	 */
					
	private String lianxiren;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 宣传视频
	 */
					
	private String xuanchuanshipin;
	
	/**
	 * 办公地址
	 */
					
	private String bangongdizhi;
	
	/**
	 * 宣讲内容
	 */
					
	private String xuanjiangneirong;
	
	
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
	 * 设置：企业编号
	 */
	public void setQiyebianhao(String qiyebianhao) {
		this.qiyebianhao = qiyebianhao;
	}
	/**
	 * 获取：企业编号
	 */
	public String getQiyebianhao() {
		return qiyebianhao;
	}
	/**
	 * 设置：企业名称
	 */
	public void setQiyemingcheng(String qiyemingcheng) {
		this.qiyemingcheng = qiyemingcheng;
	}
	/**
	 * 获取：企业名称
	 */
	public String getQiyemingcheng() {
		return qiyemingcheng;
	}
	/**
	 * 设置：规模
	 */
	public void setGuimo(String guimo) {
		this.guimo = guimo;
	}
	/**
	 * 获取：规模
	 */
	public String getGuimo() {
		return guimo;
	}
	/**
	 * 设置：性质
	 */
	public void setXingzhi(String xingzhi) {
		this.xingzhi = xingzhi;
	}
	/**
	 * 获取：性质
	 */
	public String getXingzhi() {
		return xingzhi;
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
	/**
	 * 设置：联系人
	 */
	public void setLianxiren(String lianxiren) {
		this.lianxiren = lianxiren;
	}
	/**
	 * 获取：联系人
	 */
	public String getLianxiren() {
		return lianxiren;
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
	 * 设置：宣传视频
	 */
	public void setXuanchuanshipin(String xuanchuanshipin) {
		this.xuanchuanshipin = xuanchuanshipin;
	}
	/**
	 * 获取：宣传视频
	 */
	public String getXuanchuanshipin() {
		return xuanchuanshipin;
	}
	/**
	 * 设置：办公地址
	 */
	public void setBangongdizhi(String bangongdizhi) {
		this.bangongdizhi = bangongdizhi;
	}
	/**
	 * 获取：办公地址
	 */
	public String getBangongdizhi() {
		return bangongdizhi;
	}
	/**
	 * 设置：宣讲内容
	 */
	public void setXuanjiangneirong(String xuanjiangneirong) {
		this.xuanjiangneirong = xuanjiangneirong;
	}
	/**
	 * 获取：宣讲内容
	 */
	public String getXuanjiangneirong() {
		return xuanjiangneirong;
	}

}
