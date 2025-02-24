package com.webczw.seata.product.vo;

import lombok.Data;

@Data
public class ProductVO {
    private Long productId;
    private String productCode;
    private String productName;
    private Integer productQty;
    private Long createdBy;
    private String creationDate;
    private Long lastUpdatedBy;
    private String lastUpdateDate;
}
