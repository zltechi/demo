package com.lohtech.model.user.entity;

import javax.persistence.*;

@Table(name = "sms_home_brand")
public class SmsHomeBrand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "brand_id")
    private Long brandId;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "recommend_status")
    private Integer recommendStatus;

    private Integer sort;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return brand_id
     */
    public Long getBrandId() {
        return brandId;
    }

    /**
     * @param brandId
     */
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    /**
     * @return brand_name
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * @param brandName
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * @return recommend_status
     */
    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    /**
     * @param recommendStatus
     */
    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    /**
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}