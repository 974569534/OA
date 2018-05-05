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

</head>
<body>
	<div class="container">

			<header>
				<h1>Sticky Table Headers <em>Revisited</em> <span>Creating functional and flexible sticky table headers</span></h1>	
				<nav class="codrops-demos">
					<a href="index.html">Basic Usage</a>
					<a class="current-demo" href="index2.html">Biaxial Headers</a>
					<a href="index3.html">Wide Tables</a>
				</nav>
			</header>
			<div class="component">
				<h2>Biaxial headers</h2>
				<p>Biaxial headers are possible &mdash; this is for situations where both horizontal and vertical headers are needed.</p>
				<p>The example below has the first cell wrapped in &lt;th&gt; instead of &lt;td&gt;:</p>
				<table>
					<thead>
						<tr>
							<th>Sample ID</th>
							<th>状态</th>
							<th>发件人</th>
							<th>主题</th>
							<th>时间</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>52</td>
							<td>40</td>
							<td>9</td>
							<td>47</td>
							<td>31</td>
						</tr>
						<tr>
							<th>Sample #2</th>
							<td>27</td>
							<td>55</td>
							<td>97</td>
							<td>52</td>
							<td>19</td>
						</tr>
					</tbody>
				</table>			</div>
			
		</div><!-- /container -->
		<script src="http://img.htmlsucai.com/cdn/jquery/jquery-1.10.2.js"></script>
		<script src="js/jquery.ba-throttle-debounce.min.js"></script>
		<script src="js/jquery.stickyheader.js"></script>
	
</body>
</html>