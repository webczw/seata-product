package com.webczw.seata.product.controller;

import com.webczw.seata.product.service.IProductTypeService;
import com.webczw.seata.product.util.ResultUtils;
import com.webczw.seata.product.vo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/productType")
public class ProductTypeController {

    private Logger LOG = LoggerFactory.getLogger(ProductTypeController.class);

    @Resource
    private IProductTypeService productTypeService;

    @PostMapping("/getInfo")
    public ResultVO<ProductTypeVO> getProductType(@RequestBody ProductTypeQueryVO queryVO) {
        return productTypeService.getProductType(queryVO);
    }

    @PostMapping("/getProductInfo")
    public ResultVO<ProductVO> getProductById(@RequestBody ProductQueryVO queryVO) {
        return productTypeService.getProductById(queryVO);
    }

    @PostMapping("/deduction")
    public ResultVO<Integer> deductionProductQty(@RequestBody DeductionVO vo) {
        try {
            return productTypeService.deductionProductQty(vo);
        } catch (Exception e) {
            LOG.error("deductionProductQty error", e);
        }
        return ResultUtils.error("Abnormal inventory deduction", 0);
    }
}
