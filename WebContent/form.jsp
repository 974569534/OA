<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/css/style.css" />
<link rel="stylesheet" type="text/css" href="css/css/WdatePicker.css" />
<link rel="stylesheet" type="text/css" href="css/css/skin_/form.css" />
<link href="umeditor/themes/default/_css/umeditor.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="js/js/jquery.js"></script>
<script type="text/javascript" src="js/js/global.js"></script>
<script type="text/javascript" src="js/js/jquery.select.js"></script>
<script type="text/javascript" src="js/js/WdatePicker.js"></script>
<script type="text/javascript">
window.UMEDITOR_HOME_URL = 'umeditor/';  // 请换成绝对路径
</script>
<script type="text/javascript" src="js/js/umeditor.config.js"></script>
<script type="text/javascript" src="js/js/editor_api.js"></script>
<script type="text/javascript" src="umeditor/lang/zh-cn/zh-cn.js"></script>
<title>Insert title here</title>
</head>
<body>
<div id="container">
	<div id="hd">
    </div>
    <div id="bd">
    	<div id="main">
            <h2 class="subfild">
            	<span>基本信息</span>
            </h2>
            <div class="subfild-content base-info">
            	<div class="kv-item ue-clear">
                	<label><span class="impInfo">*</span>文章标题</label>
                	<div class="kv-item-content">
                    	<input type="text" placeholder="文章标题" />
                    </div>
                    <span class="kv-item-tip">标题字数限制在35个字符</span>
                </div>
                <div class="kv-item ue-clear time">
                	<label><span class="impInfo">*</span>发布时间</label>
                	<div class="kv-item-content">
                    	<input type="text" placeholder="文章标题" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" />
                        <i class="time-icon"></i>
                    </div>
                    <span class="kv-item-tip error">这是一个错误信息</span>
                </div>
                
                <div class="kv-item ue-clear">
                	<label>所在栏目</label>
                	<div class="kv-item-content">
                    	<select>
                        	<option>新闻资讯</option>
                            <option>新闻资讯</option>
                            <option>新闻资讯</option>
                        </select>
                    </div>
                    <span class="kv-item-tip success">成功信息</span>
                </div>
                
                <div class="kv-item ue-clear">
                	<label>是否审核</label>
                	<div class="kv-item-content">
                    	<span class="choose">
                            <span class="checkboxouter">
                                <input type="radio" name="need" />
                                <span class="radio"></span>
                            </span>
                            <span class="text">是</span>
                        </span>
                    	<span class="choose">
                            <span class="checkboxouter">
                                <input type="radio" name="need" />
                                <span class="radio"></span>
                            </span>
                            <span class="text">否</span>
                        </span>
                        
                    </div>
                    <span class="kv-item-tip">标题字数限制在35个字符</span>
                </div>
                
                
                <div class="kv-item ue-clear">
                	<label><span class="impInfo">*</span>缩略图</label>
                	<div class="kv-item-content file">
						<span class="text"></span>
                        <input type="file" />
                        <input type="button" class="button normal long2" value="浏览.." />
                    </div>
                    <span class="kv-item-tip">标题字数限制在35个字符</span>
                </div>
            </div>
            
            <h2 class="subfild">
            	<span>备注资料</span>
            </h2>
            
            <div class="subfild-content remarkes-info">
            	<div class="kv-item ue-clear">
                	<label><span class="impInfo">*</span>文章内容</label>
                	<div class="kv-item-content">
                    	<textarea placeholder="文章内容" id="content" style="width:800px;height:240px;"></textarea>
                    </div>
                </div>
            </div>
            
            <div class="buttons">
                <input class="button" type="button" value="确认修改" />
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
	$('select').select();
	showRemind('input[type=text],textarea','color5');
	UM.getEditor('content');
</script>
</html>