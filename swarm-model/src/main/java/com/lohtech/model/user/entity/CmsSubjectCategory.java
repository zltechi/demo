package com.lohtech.model.user.entity;

import javax.persistence.*;

@Table(name = "cms_subject_category")
public class CmsSubjectCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    /**
     * 分类图标
     */
    private String icon;

    /**
     * 专题数量
     */
    @Column(name = "subject_count")
    private Integer subjectCount;

    @Column(name = "show_status")
    private Integer showStatus;

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
     * 获取分类图标
     *
     * @return icon - 分类图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置分类图标
     *
     * @param icon 分类图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取专题数量
     *
     * @return subject_count - 专题数量
     */
    public Integer getSubjectCount() {
        return subjectCount;
    }

    /**
     * 设置专题数量
     *
     * @param subjectCount 专题数量
     */
    public void setSubjectCount(Integer subjectCount) {
        this.subjectCount = subjectCount;
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