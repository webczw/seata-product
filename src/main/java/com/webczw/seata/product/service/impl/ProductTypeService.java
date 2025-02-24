package com.webczw.seata.product.service.impl;

import com.alibaba.fastjson.JSON;
import com.webczw.seata.product.dao.IProductDao;
import com.webczw.seata.product.service.IProductTypeService;
import com.webczw.seata.product.util.ResultUtils;
import com.webczw.seata.product.vo.*;
import io.seata.spring.annotation.GlobalTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class ProductTypeService implements IProductTypeService {

    private Logger LOG = LoggerFactory.getLogger(ProductTypeService.class);
    @Value("${seata-product.app.productTypeName}")
    private String productTypeName;

    @Resource
    private IProductDao productDao;

    @Override
    public ResultVO<ProductTypeVO> getProductType(ProductTypeQueryVO queryVO) {
        LOG.info("queryVO:{}", JSON.toJSONString(queryVO));
        ProductTypeVO typeVO = new ProductTypeVO();
        typeVO.setTypeCode("TC0233");
        typeVO.setTypeName(productTypeName);
        typeVO.setTypeId(4344444089L);
        return ResultUtils.success(typeVO);
    }

    @Override
    public ResultVO<ProductVO> getProductById(ProductQueryVO queryVO) {
        ProductVO productVO = productDao.selectProductById(queryVO.getProductId());
        return ResultUtils.success(productVO);
    }

    @Override
    public ResultVO<Integer> deductionProductQty(DeductionVO vo) {
        Integer updateCount = productDao.deductionProductQty(vo);
        return ResultUtils.success(updateCount);
    }
}
