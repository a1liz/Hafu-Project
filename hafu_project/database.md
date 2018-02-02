# hafu数据库说明文档

## 商品表

表名：hafu_good_comment

|名称|类型|注释|
|---|----|---|
|gid|int|商品id（主键）|
|sid|int|商店id（外键）|
|goodname|varchar(16)|商品名|
|goodPrice|double|商品价格|
|icon|varchar(255)|商品图片|
|goodProfile|text|商品详细信息|
|goodStatus|int|商品状态 0->无法使用 1->正常|

## 订单表

表名：hafu_order_comment

|名称|类型|注释|
|---|---|----|
|orderid|int|订单号（主键）|
|pid|int|客户信息id（外键）|
|gid|int|商品id（外键）|
|orderTime|date|下单时间|
|orderStatus|int|订单状态 0->购物车 1->已下单 2->已完成 3->取消下单|

## 订单商品表

表名：hafu_orderGood_comment

|名称|类型|注释|
|---|---|---|
|orderid|int|订单号（主键、外键）|
|gid|int|商品id（主键、外键）|
|goodnumber|int|商品数量|

商店表

表名：hafu_store_comment

|名称|类型|注释|
|----|---|---|
|sid|int|商店id（主键）|
|storename|varchar(16)|商店名称|
|storeAddress|varchar(255)|商店地址|
|storeProfile|text|商店具体信息|
|type|int|商店所属类型|
|status|int|商店状态 0->休息 1->正常营业|
|icon|varchar(255)|商店图片|
|fee|double|配送费用|
|min_price|double|起送价格|
|rating|double|评分|
|ratingUserNum|int|评分人数|
|boughtUserNum|int|购买人数|
|isZhuan|int|是否参加专送 0->不参加 1->参加|
|isSu|int|是否参加速送 0->不参加 1->参加|
|isPiao|int|是否开发票 0->不参加 1->参加|
|isMan|int|是否参与满减 0->不参加 1->参加|
|ManTotal|int|参与满减所需最低金额|
|ManSale|int|参与满减折扣金额|
|DiNum|unsigned int|抵金券活动可抵金额|
|deliveryRange|double|配送范围|
|openingTime|date|营业时间|

## 用户表

表名：hafu_user_comment

|名称|类型|注释|
|---|----|---|
|uid|int|用户id（主键）|
|username|varchar(16)|用户名|
|password|varchar(16)|密码|
|regtime|date|注册时间|
|regphone|varchar(11)|注册手机号|
|mainAddress|unsigned int|默认地址 0->无默认地址 其余对应pid|
|icon|varchar(255)|用户头像|

## 用户信息表

表名：hafu_userProfile_comment

|名称|类型|注释|
|----|---|---|
|pid|int|用户信息id（主键）|
|uid|int|用户id（外键）|
|name|varchar(16)|用户姓名|
|gender|int|用户性别 0->男 1->女|
|userAddress|varchar(255)|用户地址|
|phone|varchar(11)|用户手机号|

## 购物车表

表名: hafu_checkout_comment

|名称|类型|注释|
|----|---|---|
|cid|int|购物车id（主键）|
|uid|int|用户id（外键）|

## 购物车商品表

表名：hafu_checkoutGood_comment

|名称|类型|注释|
|---|---|--|
|cid|int|购物车id（主键、外键）|
|gid|int|商品id（主键、外键）|
|goodnumber|int|商品数量|