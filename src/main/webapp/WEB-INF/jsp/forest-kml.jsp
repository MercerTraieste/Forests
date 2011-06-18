<?xml version="1.0" encoding="UTF-8"?>
<kml xmlns="http://www.opengis.net/kml/2.2">
    <Document>
        <name>Forests</name>
        <Style id="yellowLineGreenPoly">
            <LineStyle>
                <color>ffff66bb</color>
                <width>4</width>
            </LineStyle>
            <PolyStyle>
                <color>ffff66bb</color>
            </PolyStyle>
        </Style>
        <Placemark>
            <name>Forest</name>
            <styleUrl>#yellowLineGreenPoly</styleUrl>
            <LineString>
                <extrude>1</extrude>
                <tessellate>1</tessellate>
                <altitudeMode>absolute</altitudeMode>
                <coordinates>
                    ${coordinates}
                </coordinates>
            </LineString>
        </Placemark>
    </Document>
</kml>