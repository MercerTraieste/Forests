<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<%@ include file="include-html-head.jspf" %>
<body onload="initialize()">
<%@ include file="include-menu.jspf" %>
<div id="main">
    <table>
        <tr valign="top">
            <td>
                <div id="map_canvas" style="width: 800px; height: 615px; float:left; border: 1px solid black;"></div>
            </td>
            <td>
                <form action="/forest/forest-check" method="post">
                    <input type="hidden" name="verdict" value="true"/>
                    <input type="submit" value="da"/>
                </form>
                <br/>

                <form action="forest-check" method="post">
                    <input type="hidden" name="verdict" value="false"/>
                    <input type="submit" value="nu"/>
                </form>
            </td>
        </tr>
    </table>

</div>

<%--<script src="http://maps.google.com/maps?file=api&amp;v=2&amp;key=ABQIAAAAa9YIhkENxlvVUiE_FRbMIhT7LZyszQRJ46b20IZuwhAIp39cNBS35hV8KvRpxSYB7huMfS8r-c8ADg"
        type="text/javascript"></script>--%>
<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false"></script>
<%--<script src="/static/geoxml3.js" type="text/javascript"></script>--%>
<%--<script src="/static/ProjectedOverlay.js" type="text/javascript"></script>--%>
<script type="text/javascript" src="http://geoxml3.googlecode.com/svn/branches/polys/geoxml3.js"></script>

<script type="text/javascript">

    // v2 example
    //var map;
    //var geoXml;
    //var toggleState = 1;

    /*    function initialize() {
     if (GBrowserIsCompatible()) {
     //geoXml = new GGeoXml("https://gist.github.com/raw/972532/5f9245a407e9f38fada918f9e257bc4c0dd86da2/pucioasa-forests.kml");
     //                geoXml = new GGeoXml("http://plantamfaptebune.appspot.com/forest/forest.kml");

     var mymap = new GMap2(document.getElementById("map_canvas"));
     mymap.setCenter(new GLatLng(45.206768, 25.207272), 15);
     mymap.setUIToDefault();
     mymap.setMapType(G_SATELLITE_MAP);
     map.addOverlay(geoXml);

     }
     }  */

    function initialize() {

        var myLatlng = new google.maps.LatLng(45.207115, 25.209042);
        var myOptions = {
            zoom: 15,
            center: myLatlng,
            mapTypeId: google.maps.MapTypeId.SATELLITE
        };
        var myMap = new google.maps.Map(document.getElementById("map_canvas"), myOptions);

        var myParser = new geoXML3.parser({map: myMap, zoom: true, processStyles: true});
        myParser.parse('/static/one-forest.xml');
    }

</script>
</body>
</html>
