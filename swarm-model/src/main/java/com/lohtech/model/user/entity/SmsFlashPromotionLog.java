package com.lohtech.model.user.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sms_flash_promotion_log")
public class SmsFlashPromotionLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "member_id")
    private Integer memberId;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "member_phone")
    private String memberPhone;

    @Column(name = "product_name")
    private String productName;

    /**
     * 会员订阅时间
     */
    @Column(name = "subscribe_time")
    private Date subscribeTime;

    @Column(name = "send_time")
    private Date sendTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return member_id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * @param memberId
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * @return product_id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * @return member_phone
     */
    public String getMemberPhone() {
        return memberPhone;
    }

    /**
     * @param memberPhone
     */
    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    /**
     * @return product_name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获取会员订阅时间
     *
     * @return subscribe_time - 会员订阅时间
     */
    public Date getSubscribeTime() {
        return subscribeTime;
    }

    /**
     * 设置会员订阅时间
     *
     * @param subscribeTime 会员订阅时间
     */
    public void setSubscribeTime(Date subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    /**
     * @return send_time
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * @param sendTime
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
}