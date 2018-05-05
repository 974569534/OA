<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
		<link rel="shortcut icon" href="../favicon.ico">
		<link rel="stylesheet" type="text/css" href="css/normalize.css" />
		<link rel="stylesheet" type="text/css" href="css/demo.css" />
		<link rel="stylesheet" type="text/css" href="css/component.css" />
<style type="text/css">
	#btn1{
		margin-top:15px;
		font-size:15px;
		
	}
	#tab tr th{
		
	}			
</style>
</head>
<body>
	<div class="container">
			<div class="component">
				<h4>收件箱（共xx消息）</h>
				<div id="btn1"><button>删除</button>&nbsp;&nbsp;<button>转发</button>&nbsp;&nbsp;<button>举报</button>&nbsp;&nbsp;<button>全部标为已读</button>&nbsp;&nbsp;<button>标记为已读邮件</button>&nbsp;&nbsp;</div>
				<table id="tab">
					<thead>
						<tr>
							<th><input type="checkbox" class="checks" />&nbsp;&nbsp;&nbsp;全选</th>
							<th>状态</th>
							<th>发件人</th>
							<th>主题</th>
							<th>时间</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<th><input type="checkbox" class="check"/></th>
							<td>40</td>
							<td>9</td>
							<td>47</td>
							<td>31</td>
							<td>31</td>
						</tr>
						<tr>
							<th><input type="checkbox" class="check" /></th>
							<td>27</td>
							<td>55</td>
							<td>97</td>
							<td>52</td>
							<td>19</td>
						</tr>
						<tr>
							<th><input type="checkbox" /></th>
							<td>27</td>
							<td>55</td>
							<td>97</td>
							<td>52</td>
							<td>19</td>
						</tr>
					</tbody>
				</table>			</div>
			
		</div><!-- /container -->
		<script src="js/jquery-1.10.1.js"></script>
		<script src="js/jquery.ba-throttle-debounce.min.js"></script>
		<script src="js/jquery.stickyheader.js"></script>
	
<script type="text/javascript">
	$(function(){
		$(".checks").click(function(){

			
			
		})
	});
</script>	
</body>
</html>