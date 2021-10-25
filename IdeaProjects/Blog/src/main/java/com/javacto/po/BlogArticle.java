package com.javacto.po;

import java.util.Date;

/**
 * 
 * Title:BlogArticle
 * describe:文章表
 * @author 曾老师 javacto.ke.qq.com
 * @version 1.0
 */
public class BlogArticle {
	private Integer baId;//
	private String   baTitle;//--文章标题
	private String   baDescription;//--描述
	private Integer   bacId;//--商品父分类id
	private Integer   bacChildId;//--商品分类子id

	@Override
	public String toString() {
		return "BlogArticle{" +
				"baId=" + baId +
				", baTitle='" + baTitle + '\'' +
				", baDescription='" + baDescription + '\'' +
				", bacId=" + bacId +
				", bacChildId=" + bacChildId +
				", createtime=" + createtime +
				", bacName='" + bacName + '\'' +
				", reserve1='" + reserve1 + '\'' +
				", reserve2='" + reserve2 + '\'' +
				", reserve3='" + reserve3 + '\'' +
				", reserve4='" + reserve4 + '\'' +
				", reserve5='" + reserve5 + '\'' +
				'}';
	}

	private Date createtime;//创建日期
	private String bacName;//关联分类查询出的分类名称
	private String reserve1;//
	private String reserve2;//
	private String reserve3;//
	private String reserve4;//
	private String reserve5;//
	public Integer getBaId() {
		return baId;
	}
	public void setBaId(Integer baId) {
		this.baId = baId;
	}
	public String getBaTitle() {
		return baTitle;
	}
	public void setBaTitle(String baTitle) {
		this.baTitle = baTitle;
	}
	public String getBaDescription() {
		return baDescription;
	}
	public void setBaDescription(String baDescription) {
		this.baDescription = baDescription;
	}
	public Integer getBacId() {
		return bacId;
	}
	public void setBacId(Integer bacId) {
		this.bacId = bacId;
	}
	public Integer getBacChildId() {
		return bacChildId;
	}
	public void setBacChildId(Integer bacChildId) {
		this.bacChildId = bacChildId;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getBacName() {
		return bacName;
	}
	public void setBacName(String bacName) {
		this.bacName = bacName;
	}
	public String getReserve1() {
		return reserve1;
	}
	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}
	public String getReserve2() {
		return reserve2;
	}
	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}
	public String getReserve3() {
		return reserve3;
	}
	public void setReserve3(String reserve3) {
		this.reserve3 = reserve3;
	}
	public String getReserve4() {
		return reserve4;
	}
	public void setReserve4(String reserve4) {
		this.reserve4 = reserve4;
	}
	public String getReserve5() {
		return reserve5;
	}
	public void setReserve5(String reserve5) {
		this.reserve5 = reserve5;
	}
	
	
	
	
}
