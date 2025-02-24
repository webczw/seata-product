package com.webczw.seata.product.dao;

import com.webczw.seata.product.vo.ProductVO;
import com.webczw.seata.product.vo.DeductionVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IProductDao {
    ProductVO selectProductById(Long productId);

    Integer deductionProductQty(DeductionVO vo);
}
