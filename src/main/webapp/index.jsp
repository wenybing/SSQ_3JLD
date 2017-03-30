<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/11/27
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/script/jquery-1.7.2.js"></script>
    <script type="text/javascript">
        $(function () {
            //加载省份信息
            /**
             *jQuery.post(url, [data], [callback], [type])
             *
             */
            var url = "${pageContext.request.contextPath}/ProvinceServlet";
            $.post(url, null, function (data) {
                for (var i = 0; i < data.length; i++) {
                    var id = data[i].id;
                    var name = data[i].provinceName;
                    /**
                     *获取省份select
                     */
                    var provinceSelect = $("select[name='province']");
                    /**
                     *为省份添加option
                     */
                    provinceSelect.append("<option value=" + id + ">"+name+"</option>");

                }
            }, "json");
            /**
            *为省份的下拉列表绑定一个change事件
             */
            $("select[name='province']").change(function(){
               /**
               * 省份改变时清空城市的下拉列表和区县的下拉列表
                */
                /**
                 *获取城市的select并移除下标大于0的option
                 */
                 $("select[name = 'city'] option:gt(0)").remove();
                /**
                 *获取区县的select并移除下标大于0的option
                 */
                $("select[name = 'district'] option:gt(0)").remove();
                url = "${pageContext.request.contextPath}/CityServlet";

                /**
                 *获取所选省份的id
                 */
                var id = this.value;
                $.getJSON(url,{"id":id},function(data){
                  for(var i = 0; i < data.length;i++ ){
                      //获取城市的id
                      var id = data[i].id;
                      //获取城市的城市
                      var name = data[i].cityName;
                      $("select[name='city']").append("<option value="+id+">"+name+"</option>");
                  }

                });

            });

            /**
             *为city下拉列表绑定一个change事件
             */
            $("select[name='city']").change(function(){
                //获取去区县的下拉列表并清空索引大于0的option
                $("select[name='district'] option:gt(0)").remove();
                //获取city的id
                var cid = this.value;
                //获取区县的url
                var url = "${pageContext.request.contextPath}/DistrictServlet";
                $.getJSON(url,{"cid":cid},function(data){
                    for(var i = 0; i < data.length; i++){
                        //获取district的id
                        var id = data[i].id;
                        //获取district的name
                        var name = data[i].districtName;
                        //将区县列表加入到区县下拉列表
                        $("select[name='district']").append("<option value="+id+">"+name+"</option>");
                    }
                });
            });
        });
    </script>
</head>
<body>
<h4>三级联动</h4>
<select name="province">
    <option>请选择省份...</option>
</select>
<select name="city">
    <option>请选择城市...</option>
</select>
<select name="district">
    <option>请选择区县...</option>
</select>
</body>
</html>
