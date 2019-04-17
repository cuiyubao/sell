<script>
    function onBridgeReady(){
        WeixinJSBridge.invoke(
                'getBrandWCPayRequest', {
                    "appId":"wxd898fcb01713c658",     //公众号名称，由商户传入
                    "timeStamp":"1499569906",         //时间戳，自1970年以来的秒数
                    "nonceStr":"bVsQpcfsKUAzO8r0", //随机串
                    "package":"prepay_id=wx2017070911112036b51eaddc0529394957",
                    "signType":"MD5",         //微信签名方式：
                    "paySign":"78CA85306AB823156E1032EFB5BB1C76" //微信签名
                },
                function(res){
                    // if(res.err_msg == "get_brand_wcpay_request:ok" ) {}     // 使用以上方式判断前端返回,微信团队郑重提示：res.err_msg将在用户支付成功后返回    ok，但并不保证它绝对可靠。
                   location.href="${returnUrl}";
                }
        );
    }
    if (typeof WeixinJSBridge == "undefined"){
        if( document.addEventListener ){
            document.addEventListener('WeixinJSBridgeReady', onBridgeReady, false);
        }else if (document.attachEvent){
            document.attachEvent('WeixinJSBridgeReady', onBridgeReady);
            document.attachEvent('onWeixinJSBridgeReady', onBridgeReady);
        }
    }else{
        onBridgeReady();
    }
</script>