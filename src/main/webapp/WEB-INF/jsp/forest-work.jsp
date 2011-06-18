<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:v="urn:schemas-microsoft-com:vml">
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <title>We Planned Good Deeds Demo</title>
    <script src="http://maps.google.com/maps?file=api&amp;v=2&amp;key=ABQIAAAAa9YIhkENxlvVUiE_FRbMIhT7LZyszQRJ46b20IZuwhAIp39cNBS35hV8KvRpxSYB7huMfS8r-c8ADg"
            type="text/javascript"></script>
    <script type="text/javascript">

        var map;
        var geoXml;
        var toggleState = 1;

        function initialize() {
            if (GBrowserIsCompatible()) {
                geoXml = new GGeoXml("https://gist.github.com/raw/972532/5f9245a407e9f38fada918f9e257bc4c0dd86da2/pucioasa-forests.kml");
//                geoXml = new GGeoXml("http://plantamfaptebune.appspot.com/forest/forest.kml");
                map = new GMap2(document.getElementById("map_canvas"));
                map.setCenter(new GLatLng(45.206768, 25.207272), 15);
                map.setUIToDefault();
                map.setMapType(G_SATELLITE_MAP);
                map.addOverlay(geoXml);
            }
        }

        function toggleMyKml() {
            if (toggleState == 1) {
                map.removeOverlay(geoXml);
                toggleState = 0;
            } else {
                map.addOverlay(geoXml);
                toggleState = 1;
            }
        }
    </script>
</head>
<body onload="initialize()">
<%@ include file="menu.jspf" %>

<div id="map_canvas" style="width: 800px; height: 615px; float:left; border: 1px solid black;"></div>
<div style="float:right">
    <ul>
        <c:forEach items="${forests}" var="forest" varStatus="status">
            <li><a href="/${forest.id}">Forest ${forest.id}</a></li>
        </c:forEach>
    </ul>
</div>
<br style="clear:both;"/>
<br/>
<br/>

</body>
</html>
