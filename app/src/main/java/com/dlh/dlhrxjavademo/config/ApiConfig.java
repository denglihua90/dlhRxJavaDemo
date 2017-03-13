package com.dlh.dlhrxjavademo.config;


/**
 * Created by dlh on 2016/12/2.
 */

public class ApiConfig {

    public static String getApi() {
        return "http://dapi.ddangzh.com";
    }
    /**
     * 接口操作定义
     */
//    public static final String API = "https://dapi.ddangzh.com";
//    public static final String API = "https://api.ddangzh.com";
    /**
     * 登录 OK
     */
    public static final String UserLogin = getApi() + "/user/login";
    /**
     * 登出 OK
     */
    public static final String UserLogout = getApi() + "/user/logout";

    /**
     * 获取当前用户资料 ok
     */
    public static final String UserInfo = getApi() + "/user/user-info";
    /**
     * - [x] [罗江涛] 2.3.14 APP版本检测 `/app/check-update`
     */
    public static final String checkUpdate = getApi() + "/app/check-update";

    /**
     * 获取用户头像地址
     *
     * @param uid
     * @return
     */
    public static String getUserPhoto(String uid) {
        return getApi() + "/user/" + uid;
    }

    /**
     * 上传用户头像`/user/upload-portrait`注意：这里不能用Content-Type:application/json
     */
    public static final String uploadUserPhoto = getApi() + "/user/upload-portrait";
    /**
     * 上传文件 `/asset/upload` 注意：这里不能用Content-Type:application/json
     */
    public static final String upload = getApi() + "/asset/upload";

    /**
     * 读取文件 `/asset/{accessName}`
     */
    public static String getFile(String fileName) {
        return getApi() + "/asset/" + fileName;
    }

    /**
     * 获取消息列表 Ok
     */
    public static final String MessageList = getApi() + "/message/list";

    /**
     * 标记消息为已读
     */
    public static final String MessageSetRead = getApi() + "/message/set-read";
    /**
     * 删除消息
     */
    public static final String MessageDelete = getApi() + "/message/delete-message";
    /**
     * 修改用户资料 ok
     */
    public static final String UpdateUserInfo = getApi() + "/user/update-user-info";
    /**
     * 发送手机验证码  OK
     */
    public static final String UserSendVerify = getApi() + "/user/send-verify";
    /**
     * 找回密码
     * SPSW 重置密码
     */
    public static final String UserfindPassWord = getApi() + "/user/find-password";
    /**
     * 获取收租帐号
     * - [x] [罗江涛] 2.4.1  获取收租帐号 `/hr-transfer/get-receiv-account`
     */
    public static final String hrTransferGetReceivAccount = getApi() + "/hr-transfer/get-receiv-account";
    /**
     * 获取收租帐号
     * todo 废弃
     */
    public static final String HrCommunityGetReceivAccount = getApi() + "/hr-community/get-receiv-account";
    /**
     * 更新收租帐号
     */
    public static final String HrCommunityUpdateReceivAccount = getApi() + "/hr-community/update-receiv-account";

    /**
     * 获取物业统计 /hr-community/get-community`
     * hr-community/get-community
     */
    public static final String GetHrCommunity = getApi() + "/hr-community/get-community";

    /**
     * 获取物业概况 /hr-community/get-community-status`
     */
    public static final String GetHrCommunityStatus = getApi() + "/hr-community/get-community-status";


    /**
     * - [x] [罗江涛] 2.4.5	获取合同概况 `/hr-community/get-contract-status`
     */
    public static final String GetContractStatus = getApi() + "/hr-community/get-contract-status";


    /**
     * [罗江涛] 2.4.6	获取物业列表 `/hr-house/get-house-list`
     */
    public static final String GetHouseList = getApi() + "/hr-house/get-house-list";


    /**
     * - [x] [钟仁海] 2.4.17	收租总览 `/rent/income-summary`
     */
    public static final String IncomeSummary = getApi() + "/rent/income-summary";
    /**
     * - [x] [罗江涛] 2.4.13 创建/修改账单 `/hr-bill/save-bill`
     */
    public static final String SaveBill = getApi() + "/hr-bill/save-bill";
    /**
     * //    - [x] [罗江涛] 2.4.14 确认账单已收租 `/hr-bill/confirm-bill-receive`
     */
    public static final String ConfirmBillReceive = getApi() + "/hr-bill/confirm-bill-receive";
    /**
     * //   - [x] [罗江涛] 2.4.16 获取账单列表 `/hr-bill/get-bill-list`
     */
    public static final String getBillList = getApi() + "/hr-bill/get-bill-list";


    /**
     * - [x] [罗江涛] 2.4.7	 获取出租合同列表 `/contract/get-a-contract-list`
     */
    public static final String getContractList = getApi() + "/contract/get-a-contract-list";

    /**
     * 获取合同内容
     */
    public static final String getContract = getApi() + "/contract/content";
    /**
     * 获取承租合同列表 `/contract/get-b-contract-list`
     */
    public static final String getBContractList = getApi() + "/contract/get-b-contract-list";
    /**
     * - [x] [罗江涛] 2.4.14 确认账单已收租 `/hr-bill/confirm-bill-receive`
     */
    public static final String confirmBillReceive = getApi() + "/hr-bill/confirm-bill-receive";


    /**
     * - [ ] [罗江涛] 2.4.12 锁定/解锁门禁卡 `/hr-lock/operation-lock`
     */
    public static final String openOrLockDoor = getApi() + "/hr-lock/operation-lock";


    /**
     * 2.4.15 获取账单详情 `/hr-bill/get-bill-detail
     */
    public static final String getBillDetail = getApi() + "/hr-bill/get-bill-detail";
    /**
     * - [x] [钟仁海] 2.5.3  创建（修改）承租续签合同  `/contract/applycont`
     */
    public static final String applycont = getApi() + "/contract/applycont";

    /**
     * - [x] [罗江涛] 2.5.4  确认房东发回的续租合同 `/contract/b-confirm-contract`
     */
    public static final String BConfirmContract = getApi() + "/contract/b-confirm-contract";

    /**
     * - [x] [钟仁海] 2.5.10 获取用户卡的门禁信息 `/rent/card-info`
     */
    public static final String cardInfo = getApi() + "/rent/card-info";
    /**
     * - [x] [钟仁海] 2.5.11 使用门禁卡开门 `/hr-house/lock-open`
     */
    public static final String lockOpen = getApi() + "/hr-house/lock-open";

    /**
     * - [x] [钟仁海] 2.5.12 获取用户卡的开门记录 `/hr-house/get-lock-open-log`
     */
    public static final String getLockOpenLog = getApi() + "/hr-house/get-lock-open-log";
    /**
     * 选择交租方式 `/hr-bill/change-state-to2`
     */
    public static final String changeStateTo2 = getApi() + "/hr-bill/change-state-to2";

    /**
     * 已交租通知 `/hr-bill/change-state-to3`
     */
    public static final String changeStateTo3 = getApi() + "/hr-bill/change-state-to3";

    /**
     * - [x] [罗江涛] 2.5.7  撤回退租申请 `/hr-checkout/return-checkout`
     */
    public static final String returnCheckout = getApi() + "/hr-checkout/return-checkout";
    /**
     * - [x] [罗江涛] 2.5.5	 查询退租请求 `/hr-checkout/get-checkout-detail`
     */
    public static final String getCheckoutDetail = getApi() + "/hr-checkout/get-checkout-detail";
    /**
     * * - [x] [罗江涛] 2.5.6	 退租 `/hr-checkout/save-checkout`
     */
    public static final String saveCheckout = getApi() + "/hr-checkout/save-checkout";

    /**
     * - [x] [罗江涛] 2.5.1  获取社区信息 `/hr-community/get-community-detail`
     */

    public static final String getCommunityDetail = getApi() + "/hr-community/get-community-detail";


}
