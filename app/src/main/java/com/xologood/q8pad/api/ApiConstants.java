/*
 * Copyright (c) 2016 咖枯 <kaku201313@163.com | 3772304@qq.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.xologood.q8pad.api;

import com.xologood.q8pad.Config;

public class ApiConstants {


    public static final String ACCOUNT_PADLOGINON = "/Account/PDALoginOn?";
    public static final String BEAN = "/api/GetFeeds?column=7&PageSize=20&pageIndex=1&val=100511D3BE5301280E0992C73A9DEC41";

    public static final String BASEHOST = "http://litchiapi.jstv.com";  //测试


    //入库功能
    /**
     * 1.新建订单入库
     */
    //获取仓库列表
    public static final String WAREHOUSE_GETLIST = "/Warehouse/GetList";
    //获取产品列表
    public static final String PRODUCT_GET_PRODUCT_LIST = "/Product/GetProductList";
    //根据产品id获取产品批次
    public static final String PRODUCT_GET_PRODUCT_BATCH_BY_PRODUCTID = "/Product/GetProductBatchByProductId";
    //根据产品id获取单位
    public static final String PRODUCT_GET_STANDARDUNIT_BY_PRODUCTID = "/Product/GetStandardUnitByProductId";
    //添加批次
    public static final String PRODUCT_INSERT_PRODUCT_BATCH = "/Product/InsertProductBatch";

    //保存入库主表
    public static final String INVOICING_INSERTINV = "/Invoicing/InsertInv";
    //保存入库主表2
    public static final String INVOICING_INSERTINV2="/Invoicing/Invoicing";

    //获取单位比例
    public static final String PROPORTION_GET_PROPORTIONCONVERSION = "/Proportion/GetProportionConversion";
    //验证入库明细
    public static final String INVOICING_GET_INVOICINGDETAIL = "/Invoicing/GetInvoicingDetaiL";
    //增加入库明细
    public static final String INVOICING_INSERT_DETAIL = "/Invoicing/InsertDetail";
    //更新入库明细
    public static final String INVOICING_UPDATE_INVOICINGDETAIL = "/Invoicing/UpdateInvoicingDetail";
    //获取单据信息
    public static final String INVOICING_INVMSG = "/Invoicing/InvMsg";
    //获取单据明细信息
    public static final String INVOICING_INVDETAIL = "/Invoicing/InvDetail";
    //确认提交
    public static final String INVOICINT_COMPLETESAVE = "/Invoicing/CompleteSave";

    /**
     * 2.已有订单入库
     */
    //获取单号
    public static final String INVOICING_INVLIST = "/Invoicing/InvList";
    //获取单据信息
    // public static final String INVOICING_INVMSG= "Invoicing/InvMsg";
    //获取单据明细信息
    //public static final String INVOICING_INVDETAIL="Invoicing/InvoicingDetail";
    //确认提交
    // public static final String INVOICINT_COMPLETESAVE= "Invoicing/CompleteSave";
    //上传
    public static final String NEW_ORDINARY_OUTSCANBARCODE = "/NewScanBarCode/NewOrdinaryOutScanBarCode";


    //出库功能
    /**
     * 1.新建订单出库
     */
    //获取仓库列表
    //public static final String WAREHOUSE_GETLIST = "Warehouse/GetList";
    //获取机构列表
    public static final String COMPANY_GET_ALLCOPLIST = "/Company/GetAllCompList";
    //保存出库主表
    //public static final String INVOICING_INSERTINV= "/Invoicing/InsertInv";
    //
    /**
     * 2.已有订单出库
     */
    //获取单号
    //public static final String INVOICING_INVLIST = "Invoicing/InvList";
    //获取单据信息
    // public static final String INVOICING_INVMSG= "/Invoicing/InvMsg";
    //获取单据明细信息
    //public static final String INVOICING_INVDETAIL = "/Invoicing/InvDetail";
    //根据机构key获取单个用户信息
    public static final String USER_GET_FIRSTUSER_BY_COMKEY = "/User/GetFirstUserByComKey";
    //确认提交
    //public static final String INVOICINT_COMPLETESAVE = "/Invoicing/CompleteSave";


    public static final String NEWSCANBARCODE_NEWORDINARY_IN_SCANBARCODE = "/NewScanBarCode/NewOrdinaryInScanBarCode";


    public static final String NEWSCANBARCODE_NEWORDINARY_OUT_SCANBARCODE = "/NewScanBarCode/NewOrdinaryOutScanBarCode";


    //替换功能
    public static final String INVOICING_REPLACECODE = "/Invoicing/ReplaceCode";

    //快捷出库
    public static final String INVOICING_QUICKINVLIST="/Invoicing/QuickInvList";

    //快捷出库之获取快捷出库单据明细
    public static final String FAST_OUT_INVOICING_INVDETAIL="/Invoicing/InvDetail";

    //新建快捷出库
    public static final String NEWSCANBARCODE_NEWQUICKSCANBARCODE= "/NewScanBarCode/NewQuickScanBarCode";

    /**
     * 获取用户
     */
    public static final String USER_GET_FIRSTUSER_BY_COMKE="/User/GetFirstUserByComKe";
    /**
     * 获取Host
     *
     * @param hostType
     * @return
     */

    /**
     * sysKey=”160530104723186i5ya” 用下面这个退货接口：
     */
    public static final String RETURNGOODS_DEFAULT="/Returngoods/HeadquartersScanReturngoods";

    /**
     * 否则用这个退货接口
     */
    public static final String RETURNGOODS= "/Returngoods/ScanReturngoods";


    /**
     * 作废接口
     */

    public static final String INVOICING_ABOLISHCODE="/Invoicing/AbolishCode";

    public static String getHost(int hostType) {
        String host;
        switch (hostType) {
            case HostType.USERURL:
                host = Config.userUrl;
                break;
            case HostType.SYSTEMURL:
                host = Config.systemUrl;
                break;
            case HostType.BEANHOST:
                host = "http://litchiapi.jstv.com";    //测试
                break;
            default:
                host = "";
                break;
        }
        return host;
    }
}