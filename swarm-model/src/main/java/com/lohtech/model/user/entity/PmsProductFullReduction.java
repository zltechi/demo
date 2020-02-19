package com.lohtech.model.user.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "pms_product_full_reduction")
public class PmsProductFullReduction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "full_price")
    private BigDecimal fullPrice;

    @Column(name = "reduce_price")
    private BigDecimal reducePrice;

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
     * @return full_price
     */
    public BigDecimal getFullPrice() {
        return fullPrice;
    }

    /**
     * @param fullPrice
     */
    public void setFullPrice(BigDecimal fullPrice) {
        this.fullPrice = fullPrice;
    }

    /**
     * @return reduce_price
     */
    public BigDecimal getReducePrice() {
        return reducePrice;
    }

    /**
     * @param reducePrice
     */
    public void setReducePrice(BigDecimal reducePrice) {
        this.reducePrice = reducePrice;
    }
}