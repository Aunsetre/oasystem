//JavaScript代码区域
layui.use('element', function(){
    var element = layui.element;

});
layui.use(['layer', 'form'], function(){
    var layer = layui.layer
        ,form = layui.form;

form.on('submit(add)', function(){
    layer.open({
        type: 2,
        title: '新增信息',
        shadeClose: false,
        shade: 0.5,
        area: ['40%','40%'],
        content: localhostPath+"/common/Detail.html"
    });

});

});