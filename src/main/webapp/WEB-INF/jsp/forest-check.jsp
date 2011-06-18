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

                <form action="/forest/forest-check" method="post">
                    <input type="hidden" name="verdict" value="false"/>
                    <input type="submit" value="nu"/>
                </form>
            </td>
        </tr>
    </table>

</div>

<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false"></script>
<script type="text/javascript" src="http://geoxml3.googlecode.com/svn/branches/polys/geoxml3.js"></script>

<script type="text/javascript">

    function initialize() {
        var myOptions = {
            mapTypeId: google.maps.MapTypeId.SATELLITE
        };
        var myMap = new google.maps.Map(document.getElementById("map_canvas"), myOptions);

        var myParser = new geoXML3.parser({map: myMap, zoom: true, processStyles: true});
        myParser.parse('/static/one-forest.xml');
    }

</script>
</body>
</html>
