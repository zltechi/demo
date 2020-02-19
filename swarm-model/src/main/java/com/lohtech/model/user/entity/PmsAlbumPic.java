package com.lohtech.model.user.entity;

import javax.persistence.*;

@Table(name = "pms_album_pic")
public class PmsAlbumPic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "album_id")
    private Long albumId;

    private String pic;

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
     * @return album_id
     */
    public Long getAlbumId() {
        return albumId;
    }

    /**
     * @param albumId
     */
    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    /**
     * @return pic
     */
    public String getPic() {
        return pic;
    }

    /**
     * @param pic
     */
    public void setPic(String pic) {
        this.pic = pic;
    }
}