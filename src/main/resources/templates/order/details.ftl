<html>
<head>
    <meta charset="utf-8">
    <title>订单详情</title>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-4 column">
            <table class="table table-bordered">
                <thead>
                <tr>
                    <th>
                        订单id
                    </th>
                    <th>
                        订单总金额
                    </th>
                </tr>
                <tr>
                    <th>
                        ${orderDTO.orderId}
                    </th>
                    <th>
                        ${orderDTO.orderAmount}
                    </th>
                </tr>
                </thead>
            </table>
        </div>
        <#--订单详情表数据-->
        <div class="col-md-12 column">
            <table class="table table-bordered">
                <thead>
                <tr>
                    <th>
                        商品id
                    </th>
                    <th>
                        商品名称
                    </th>
                    <th>
                        价格
                    </th>
                    <th>
                        数量
                    </th>
                    <th>
                        总额
                    </th>
                </tr>
                </thead>

                <thead>
                <#list orderDTO.orderDetailList as orderDetail>
                <tr>
                    <th>
                        ${orderDetail.orderId}
                    </th>
                    <th>
                        ${orderDetail.productName}
                    </th>
                    <th>
                        ${orderDetail.productPrice}
                    </th>
                    <th>
                        ${orderDetail.productQuantity}
                    </th>
                    <th>
                        ${orderDetail.productQuantity * orderDetail.productPrice}
                    </th>
                </tr>
                </#list>
                </thead>
            </table>
        </div>
        <#--操作-->
        <div class="col-md-12 column">
            <#if orderDTO.getOrderStatusEnum().message=="新订单">
            <a href="/sell/seller/order/finish?orderId=${orderDTO.orderId}" type="button" class="btn btn-default btn-primary">完结订单</a>
            <a href="/sell/seller/order/cancel?orderId=${orderDTO.orderId}" type="button" class="btn btn-default btn-danger">取消订单</a>
            </#if>
        </div>
    </div>
</div>
</body>
</html>