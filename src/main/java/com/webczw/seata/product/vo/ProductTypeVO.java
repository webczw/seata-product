package com.webczw.seata.product.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductTypeVO {
    private Long typeId;
    private String typeCode;
    private String typeName;
}
