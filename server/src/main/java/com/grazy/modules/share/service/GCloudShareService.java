package com.grazy.modules.share.service;

import com.grazy.modules.share.context.CancelShareContext;
import com.grazy.modules.share.context.CheckShareCodeContext;
import com.grazy.modules.share.context.CreateShareUrlContext;
import com.grazy.modules.share.context.QueryShareListContext;
import com.grazy.modules.share.domain.GCloudShare;
import com.baomidou.mybatisplus.extension.service.IService;
import com.grazy.modules.share.vo.GCloudShareUrlListVo;
import com.grazy.modules.share.vo.GCloudShareUrlVo;

import java.util.List;

/**
* @author gaofu
* @description 针对表【g_cloud_share(用户分享表)】的数据库操作Service
* @createDate 2024-01-24 17:43:16
*/
public interface GCloudShareService extends IService<GCloudShare> {

    /**
     * 创建分享链接
     *
     * @param context
     * @return
     */
    GCloudShareUrlVo create(CreateShareUrlContext context);


    /**
     * 查询分享链接列表
     *
     * @param context
     * @return
     */
    List<GCloudShareUrlListVo> getShares(QueryShareListContext context);


    /**
     * 取消分享链接
     *
     * @param context
     */
    void cancelShare(CancelShareContext context);


    /**
     * 校验分享提取码
     *
     * @param context
     * @return
     */
    String checkShareCode(CheckShareCodeContext context);
}
