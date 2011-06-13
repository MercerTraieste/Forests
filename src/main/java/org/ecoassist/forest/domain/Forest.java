package org.ecoassist.forest.domain;

import org.eclipse.persistence.oxm.annotations.XmlPath;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Placemark")
public class Forest {
    private String id;
    private String name;

    @XmlElement()
    @XmlPath("LineString/coordinates/text()")
    private String coordinates;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Forest{" +
                "name='" + name + '\'' +
                ", coordinates='" + coordinates + '\'' +
                '}';
    }
}
