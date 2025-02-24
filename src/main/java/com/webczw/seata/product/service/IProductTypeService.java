package com.webczw.seata.product.service;

import com.webczw.seata.product.vo.*;

public interface IProductTypeService {
    ResultVO<ProductTypeVO> getProductType(ProductTypeQueryVO queryVO);

    ResultVO<ProductVO> getProductById(ProductQueryVO queryVO);

    ResultVO<Integer> deductionProductQty(DeductionVO vo);
}
