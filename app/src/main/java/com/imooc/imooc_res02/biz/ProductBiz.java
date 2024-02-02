package com.imooc.imooc_res02.biz;

import com.imooc.imooc_res02.bean.Product;
import com.imooc.imooc_res02.config.Config;
import com.imooc.imooc_res02.net.CommonCallback;
import com.zhy.http.okhttp.OkHttpUtils;

import java.util.List;

/**
 * Created by zhy on 16/10/23.
 */
public class ProductBiz {

    public void listByPage(int currentPage, CommonCallback<List<Product>> callback) {
        OkHttpUtils
                .post()
                .url(Config.baseUrl + "product_find")
                .tag(this)
                .addParams("currentPage", currentPage + "")
                .build()
                .execute(callback);
    }

}
