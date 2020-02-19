package com.lohtech.model.user.entity;

import javax.persistence.*;

@Table(name = "cms_prefrence_area")
public class CmsPrefrenceArea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "sub_title")
    private String subTitle;

    private Integer sort;

    @Column(name = "show_status")
    private Integer showStatus;

    /**
     * 展示图片
     */
    private byte[] pic;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return sub_title
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * @param subTitle
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
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

    /**
     * @return show_status
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * @param showStatus
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * 获取展示图片
     *
     * @return pic - 展示图片
     */
    public byte[] getPic() {
        return pic;
    }

    /**
     * 设置展示图片
     *
     * @param pic 展示图片
     */
    public void setPic(byte[] pic) {
        this.pic = pic;
    }
}