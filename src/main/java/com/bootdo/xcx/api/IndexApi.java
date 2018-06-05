package com.bootdo.xcx.api;

import com.bootdo.xcx.api.support.AbstractApi;
import com.bootdo.xcx.api.support.ApiResponse;
import com.bootdo.xcx.domain.WxCategoryDO;
import com.bootdo.xcx.domain.WxSlideShowDO;
import com.bootdo.xcx.service.WxCategoryService;
import com.bootdo.xcx.service.WxGoodsService;
import com.bootdo.xcx.service.WxSlideShowService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: bufoon
 * @Email: 285395841@qq.com
 * @Datetime: Created In 2018/6/3 16:39
 * @Desc: as follows.
 */
@RestController
@RequestMapping(value = "/api/index")
@Api(tags = "首页相关接口")
public class IndexApi extends AbstractApi {

    @Autowired
    private WxSlideShowService wxSlideShowService;
    @Autowired
    private WxCategoryService wxCategoryService;
    @Autowired
    private WxGoodsService wxGoodsService;

    @ApiOperation(value = "首页信息接口", notes = "首页所有信息，通知信息，轮播图数据，各分类九张图信息")
    @ApiResponses({
            @io.swagger.annotations.ApiResponse(code=1, message = "成功")
    })
    @RequestMapping(value = "/allInfo", method = {RequestMethod.POST, RequestMethod.GET})
    public ApiResponse allInfo(){
        // 获取轮播图数据
        Map<String, Object> tempMap = new HashMap<>();
        tempMap.put("status", 1);
        List<WxSlideShowDO> wxSlideShowDOList = wxSlideShowService.list(tempMap);
        //获取所有分类

        List<WxCategoryDO> wxCategoryDOList = wxCategoryService.list(tempMap);
        tempMap.clear();
        tempMap.put("status", 1);
        tempMap.put("offset", 0);
        tempMap.put("limit", 9);
        for (WxCategoryDO wxCategoryDO : wxCategoryDOList) {
            tempMap.put("catId", wxCategoryDO.getCatId());
            wxCategoryDO.setWxGoodsDOList(wxGoodsService.list(tempMap));
        }
        tempMap.clear();
        tempMap.put("slideShow", wxSlideShowDOList);
        tempMap.put("notice", "大甩卖，大酬宾");
        tempMap.put("catGoods", wxCategoryDOList);
        return new ApiResponse(1, "succcess", tempMap);
    }
}
