<%--
  Created by IntelliJ IDEA.
  User: Angelika
  Date: 18.06.2021
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<jsp:include page="WEB-INF/fragments/header.jsp"/>
<head>
    <title>EPAM: XML\XSD & Web-parsing</title>
</head>
<body>
<form method="POST" action="${pageContext.request.contextPath}/main" enctype="multipart/form-data">
    <h2>JWD Task8: XML\XSD & Web-parsing</h2>
    <img src="images/cat.jpg" align="left" width="450" height="281"/>
    <P></P>
    <h4>Компьютерные комплектующие имеют следующие характеристики:</h4>
    <h6>Name - название комплектующего.<br/>
        Origin - страна производства.<br/>
        Price - цена (0-n рублей).<br/>
        Type (должно быть несколько) - перифирийное либо нет, энергопотребление (ватт), наличие кулера (есть либо нет),
        группа комплектующих (устройства ввода-вывода, мультимедийные), порты (COM, USB, LPT).<br/>
        Critical - критично ли наличие комплектующего для работы компьютера.</h6>
    <p>

        <label class="radio-inline"><input type="radio" name="parserType" value="dom" checked>DOM-parser</label>
        <label class="radio-inline"><input type="radio" name="parserType" value="sax">SAX-parser</label>
        <label class="radio-inline"><input type="radio" name="parserType" value="stax">StAX-parser</label>

        <br/>
    <div class="form-group">
        <label for="exampleFormControlFile1">Choose file</label>
        <input type="file" class="form-control-file" name="file" id="exampleFormControlFile1" required>
    </div>
    <br/>

    <button type="submit" class="btn btn-primary">Parse</button>
</form>
<jsp:include page="WEB-INF/fragments/footer.jsp"/>
</body>
</html>
