<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: coco1
  Date: 2017/2/13
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hbase Cell Commander</title>
</head>
<body>
    <h1>Hbase Cell table</h1>
`<table>
        <tr>
            <th>rowKey</th>
            <th>userName</th>
            <th>picUrl</th>
            <th>gender</th>
            <th>content</th>
            <th>otherInform</th>
        </tr>
        <c:forEach var="hbaseCell" items="${hbaseCellList}">
        <tr>
            <td>${rowKey}</td>
            <td>${userName}</td>
            <td>${picUrl}</td>
            <td>${gender}</td>
            <td>${content}</td>
            <td>${otherInform}</td>
            <td>
                <a herf="${BASE}/HbaseCell_Edit"?id="${hbaseCell.rowKey}">delete</a>
                <a herf="${BASE}/HbaseCell_Delete"?id="${hbaseCell.rowKey}">delete</a>
            </td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
