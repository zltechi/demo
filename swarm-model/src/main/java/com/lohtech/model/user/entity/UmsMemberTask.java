package com.lohtech.model.user.entity;

import javax.persistence.*;

@Table(name = "ums_member_task")
public class UmsMemberTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    /**
     * 赠送成长值
     */
    private Integer growth;

    /**
     * 赠送积分
     */
    private Integer intergration;

    /**
     * 任务类型：0->新手任务；1->日常任务
     */
    private Integer type;

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
     * 获取赠送成长值
     *
     * @return growth - 赠送成长值
     */
    public Integer getGrowth() {
        return growth;
    }

    /**
     * 设置赠送成长值
     *
     * @param growth 赠送成长值
     */
    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    /**
     * 获取赠送积分
     *
     * @return intergration - 赠送积分
     */
    public Integer getIntergration() {
        return intergration;
    }

    /**
     * 设置赠送积分
     *
     * @param intergration 赠送积分
     */
    public void setIntergration(Integer intergration) {
        this.intergration = intergration;
    }

    /**
     * 获取任务类型：0->新手任务；1->日常任务
     *
     * @return type - 任务类型：0->新手任务；1->日常任务
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置任务类型：0->新手任务；1->日常任务
     *
     * @param type 任务类型：0->新手任务；1->日常任务
     */
    public void setType(Integer type) {
        this.type = type;
    }
}