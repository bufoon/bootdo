package com.bootdo.xcx.api;

import com.bootdo.xcx.api.support.ApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: bufoon
 * @Email: 285395841@qq.com
 * @Datetime: Created In 2018/5/27 18:19
 * @Desc: as follows.
 */
@RestController
@RequestMapping("/api/favorite")
public class FavoriteApi {
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ApiResponse list(){

        return null;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ApiResponse add(){

        return null;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ApiResponse update(){

        return null;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ApiResponse delete(){

        return null;
    }
}
