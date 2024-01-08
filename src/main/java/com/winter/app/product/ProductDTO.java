package com.winter.app.product;

public class ProductDTO {
	private Long productNum;
	private String productName;
	private String productContents;
	private double productRate;
	private double productJumsu;
	/**
	 * @return the productNum
	 */
	public Long getProductNum() {
		return productNum;
	}
	/**
	 * @param productNum the productNum to set
	 */
	public void setProductNum(Long productNum) {
		this.productNum = productNum;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the productContents
	 */
	public String getProductContents() {
		return productContents;
	}
	/**
	 * @param productContents the productContents to set
	 */
	public void setProductContents(String productContents) {
		this.productContents = productContents;
	}
	/**
	 * @return the productRate
	 */
	public double getProductRate() {
		return productRate;
	}
	/**
	 * @param productRate the productRate to set
	 */
	public void setProductRate(double productRate) {
		this.productRate = productRate;
	}
	/**
	 * @return the productJumsu
	 */
	public double getProductJumsu() {
		return productJumsu;
	}
	/**
	 * @param productJumsu the productJumsu to set
	 */
	public void setProductJumsu(double productJumsu) {
		this.productJumsu = productJumsu;
	}
}