package se.west.gnat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="RenamedFoo")
@XmlAccessorType(XmlAccessType.FIELD)
public class Foo {

    /**
     * This is a Bar.
     */
    @XmlAttribute(name = "renamedBar")
    private String bar;
}
