package com.hafu.domain;
// Generated 2017-8-10 10:33:21 by Hibernate Tools 5.2.3.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * HafuStoreComment generated by hbm2java
 */
public class HafuStoreComment implements java.io.Serializable {

	private Integer sid;
	private String storename;
	private String storeAddress;
	private String storeProfile;
	private Integer type;
	private Integer status;
	private String icon;
	private Double fee;
	private double minPrice;
	private double rating;
	private int ratingUserNum;
	private int boughtUserNum;
	private int isZhuan;
	private int isSu;
	private int isPiao;
	private int isMan;
	private int manTotal;
	private int manSale;
	private int diNum;
	private Double deliveryRange;
	private Date openingTime;
	private Set hafuGoodComments = new HashSet(0);

	public HafuStoreComment() {
	}

	public HafuStoreComment(double minPrice, double rating, int ratingUserNum, int boughtUserNum, int isZhuan, int isSu,
			int isPiao, int isMan, int manTotal, int manSale, int diNum) {
		this.minPrice = minPrice;
		this.rating = rating;
		this.ratingUserNum = ratingUserNum;
		this.boughtUserNum = boughtUserNum;
		this.isZhuan = isZhuan;
		this.isSu = isSu;
		this.isPiao = isPiao;
		this.isMan = isMan;
		this.manTotal = manTotal;
		this.manSale = manSale;
		this.diNum = diNum;
	}

	public HafuStoreComment(String storename, String storeAddress, String storeProfile, Integer type, Integer status,
			String icon, Double fee, double minPrice, double rating, int ratingUserNum, int boughtUserNum, int isZhuan,
			int isSu, int isPiao, int isMan, int manTotal, int manSale, int diNum, Double deliveryRange,
			Date openingTime, Set hafuGoodComments) {
		this.storename = storename;
		this.storeAddress = storeAddress;
		this.storeProfile = storeProfile;
		this.type = type;
		this.status = status;
		this.icon = icon;
		this.fee = fee;
		this.minPrice = minPrice;
		this.rating = rating;
		this.ratingUserNum = ratingUserNum;
		this.boughtUserNum = boughtUserNum;
		this.isZhuan = isZhuan;
		this.isSu = isSu;
		this.isPiao = isPiao;
		this.isMan = isMan;
		this.manTotal = manTotal;
		this.manSale = manSale;
		this.diNum = diNum;
		this.deliveryRange = deliveryRange;
		this.openingTime = openingTime;
		this.hafuGoodComments = hafuGoodComments;
	}

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getStorename() {
		return this.storename;
	}

	public void setStorename(String storename) {
		this.storename = storename;
	}

	public String getStoreAddress() {
		return this.storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStoreProfile() {
		return this.storeProfile;
	}

	public void setStoreProfile(String storeProfile) {
		this.storeProfile = storeProfile;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Double getFee() {
		return this.fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public double getMinPrice() {
		return this.minPrice;
	}

	public void setMinPrice(double minPrice) {
		this.minPrice = minPrice;
	}

	public double getRating() {
		return this.rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getRatingUserNum() {
		return this.ratingUserNum;
	}

	public void setRatingUserNum(int ratingUserNum) {
		this.ratingUserNum = ratingUserNum;
	}

	public int getBoughtUserNum() {
		return this.boughtUserNum;
	}

	public void setBoughtUserNum(int boughtUserNum) {
		this.boughtUserNum = boughtUserNum;
	}

	public int getIsZhuan() {
		return this.isZhuan;
	}

	public void setIsZhuan(int isZhuan) {
		this.isZhuan = isZhuan;
	}

	public int getIsSu() {
		return this.isSu;
	}

	public void setIsSu(int isSu) {
		this.isSu = isSu;
	}

	public int getIsPiao() {
		return this.isPiao;
	}

	public void setIsPiao(int isPiao) {
		this.isPiao = isPiao;
	}

	public int getIsMan() {
		return this.isMan;
	}

	public void setIsMan(int isMan) {
		this.isMan = isMan;
	}

	public int getManTotal() {
		return this.manTotal;
	}

	public void setManTotal(int manTotal) {
		this.manTotal = manTotal;
	}

	public int getManSale() {
		return this.manSale;
	}

	public void setManSale(int manSale) {
		this.manSale = manSale;
	}

	public int getDiNum() {
		return this.diNum;
	}

	public void setDiNum(int diNum) {
		this.diNum = diNum;
	}

	public Double getDeliveryRange() {
		return this.deliveryRange;
	}

	public void setDeliveryRange(Double deliveryRange) {
		this.deliveryRange = deliveryRange;
	}

	public Date getOpeningTime() {
		return this.openingTime;
	}

	public void setOpeningTime(Date openingTime) {
		this.openingTime = openingTime;
	}

	public Set getHafuGoodComments() {
		return this.hafuGoodComments;
	}

	public void setHafuGoodComments(Set hafuGoodComments) {
		this.hafuGoodComments = hafuGoodComments;
	}

}
