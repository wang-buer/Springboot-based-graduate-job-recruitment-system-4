package com.entity.vo;

import com.entity.GangweiyingpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 岗位应聘
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-04 10:02:53
 */
public class GangweiyingpinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 行业
	 */
	
	private String xingye;
		
	/**
	 * 企业编号
	 */
	
	private String qiyebianhao;
		
	/**
	 * 企业名称
	 */
	
	private String qiyemingcheng;
		
	/**
	 * 城市
	 */
	
	private String chengshi;
		
	/**
	 * 应聘内容
	 */
	
	private String yingpinneirong;
		
	/**
	 * 求职简历
	 */
	
	private String qiuzhijianli;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 专业
	 */
	
	private String zhuanye;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：行业
	 */
	 
	public void setXingye(String xingye) {
		this.xingye = xingye;
	}
	
	/**
	 * 获取：行业
	 */
	public String getXingye() {
		return xingye;
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
	 * 设置：城市
	 */
	 
	public void setChengshi(String chengshi) {
		this.chengshi = chengshi;
	}
	
	/**
	 * 获取：城市
	 */
	public String getChengshi() {
		return chengshi;
	}
				
	
	/**
	 * 设置：应聘内容
	 */
	 
	public void setYingpinneirong(String yingpinneirong) {
		this.yingpinneirong = yingpinneirong;
	}
	
	/**
	 * 获取：应聘内容
	 */
	public String getYingpinneirong() {
		return yingpinneirong;
	}
				
	
	/**
	 * 设置：求职简历
	 */
	 
	public void setQiuzhijianli(String qiuzhijianli) {
		this.qiuzhijianli = qiuzhijianli;
	}
	
	/**
	 * 获取：求职简历
	 */
	public String getQiuzhijianli() {
		return qiuzhijianli;
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
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
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
	 * 设置：专业
	 */
	 
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
