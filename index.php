
<hmtl>
<head>
<title>
Eulerian Path and Circuit
</title>
</head>
<body>
<applet code="hachi" width=1250 height=650>
<param name="img0" value="house1.jpg">
<param name="img1" value="house2.jpg">
<param name="img2" value="house3.jpg">
<param name="img3" value="house4.jpg">
<param name="img4" value="house5.jpg">
<param name="img5" value="house6.jpg">
<param name="img6" value="house7.jpg">
<param name="img7" value="house8.jpg">
<param name="img8" value="post_office.jpg">
<param name="img9" value="postman.jpg">
</applet>

   <u> <h3 style="color: red;font: caption;font-weight: bolder">Task:</h3></u>
    <p style="font-style: Times New Roman;font-size: medium;font-weight: bold">Given an undirected graph
       , find a path or circuit that passes through each edge exactly once.</p>

<u><h3 style="color: red;font: caption;font-weight: bolder">Algorithm:</h3></u>
<p style="font-style: Times New Roman;font-size: medium;font-weight: bold"></p>
<ul>
    <li><p style="font-style: Times New Roman;font-size: medium;font-weight: bold"> Start with an empty stack and an empty circuit (eulerian path).</p></li>
    <li><p style="font-style: Times New Roman;font-size: medium;font-weight: bold">If all vertices have even degree - choose any of them.</p></li>
    <li><p style="font-style: Times New Roman;font-size: medium;font-weight: bold">If there are exactly 2 vertices having an odd degree - choose one of them.</p></li>
    <li><p style="font-style: Times New Roman;font-size: medium;font-weight: bold">Otherwise no euler circuit or path exists.</p></li>
    <li><p style="font-style: Times New Roman;font-size: medium;font-weight: bold">If current vertex has no neighbors - add it to circuit, remove the last vertex from the stack and set it as the current one.</p></li>
    <li><p style="font-style: Times New Roman;font-size: medium;font-weight: bold">Otherwise (in case it has neighbors) - add the vertex to the stack, take any of its neighbors, remove the edge between selected neighbor and that vertex,
            and set that neighbor as the current vertex.</p></li>
    <li><p style="font-style: Times New Roman;font-size: medium;font-weight: bold"> Repeat step 2 until the current vertex has no more neighbors and the stack is empty.</p></li></ul>

<h2 style="color: blue;font-style:algeria ">&gt;&gt;Note that obtained circuit will be in reverse order from end vertex to start vertex.</h2>

<u><h3 style="color: red;font: caption;font-weight: bolder" >Applications:</h3></u>
<p style="font-style: Times New Roman;font-size: medium;font-weight: bold">
A postman has to visit a set of streets in order to deliver mails and packages.
It is needed to find a path that starts and ends at the post-office, and that passes through each street (edge) exactly once.
This way the postman will deliver mails and packages to all streets he has to, and in the same time will spend minimum efforts/time for the road.
</p>
</body>
</html>