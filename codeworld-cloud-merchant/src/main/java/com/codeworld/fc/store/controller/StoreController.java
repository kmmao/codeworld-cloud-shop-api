package com.codeworld.fc.store.controller;

import com.codeworld.fc.common.response.DataResponse;
import com.codeworld.fc.common.response.FCResponse;
import com.codeworld.fc.store.request.StoreSearchRequest;
import com.codeworld.fc.store.response.StorePageResponse;
import com.codeworld.fc.store.service.StoreService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName StoreController
 * Description TODO
 * Author Lenovo
 * Date 2021/3/1
 * Version 1.0
 **/
@RestController
@RequestMapping("codeworld-store")
@ApiOperation("店铺接口管理")
public class StoreController {

    @Autowired(required = false)
    private StoreService storeService;

    @PostMapping("/web/get-merchant-store-page")
    @ApiOperation("分页获取商户店铺列表")
    public FCResponse<DataResponse<List<StorePageResponse>>> getMerchantStoreByPage(@RequestBody StoreSearchRequest storeSearchRequest){
        return this.storeService.getMerchantStoreByPage(storeSearchRequest);
    }
}
