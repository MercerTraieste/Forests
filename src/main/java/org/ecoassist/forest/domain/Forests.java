package org.ecoassist.forest.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "kml")
public class Forests {

    @XmlElement(name = "Placemark")
    private List<Forest> forests;

    public List<Forest> getForests() {
        return forests;
    }

    public void setForests(List<Forest> forests) {
        this.forests = forests;
    }

    @Override
    public String toString() {
        return "Forests{" +
                "forests=" + forests +
                '}';
    }
}
