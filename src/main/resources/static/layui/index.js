//JavaScript代码区域
layui.use('element', function(){
    var element = layui.element;

});
layui.use('table', function(){
    var table = layui.table;

    //第一个实例
    table.render({
        elem: '#demo'
        ,height: 315,
        width: 800
        ,url: '/GetUserAll' //数据接口
        ,page: true //开启分页
        ,cols: [[ //表头
            {field: 'id', title: 'ID', width:80, sort: true, fixed: 'left'}
            ,{field: 'name', title: '用户名', width:80, sort:true}
            ,{field: 'pwd', title: '密码', width:80}
            ,{field: 'email', title: '邮箱', width:80}
            ,{field: 'Retime', title: '注册时间', width: 177}
            ,{field: 'rid', title: '用户状态', width: 100, sort: true}
            ,{field: 'logId', title: '授权', width: 80, sort: true}
        ]]
    });

});
