package com.lohtech.model.user.entity;

import javax.persistence.*;

@Table(name = "ums_member_member_tag_relation")
public class UmsMemberMemberTagRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "tag_id")
    private Long tagId;

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
     * @return member_id
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * @param memberId
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * @return tag_id
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * @param tagId
     */
    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }
}