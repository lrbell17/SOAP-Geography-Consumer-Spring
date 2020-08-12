//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.12 at 12:26:05 PM PDT 
//


package com.spring.consumer.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for region.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="region"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="West"/&gt;
 *     &lt;enumeration value="Southwest"/&gt;
 *     &lt;enumeration value="Midwest"/&gt;
 *     &lt;enumeration value="Southeast"/&gt;
 *     &lt;enumeration value="Northeast"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "region")
@XmlEnum
public enum Region {

    @XmlEnumValue("West")
    WEST("West"),
    @XmlEnumValue("Southwest")
    SOUTHWEST("Southwest"),
    @XmlEnumValue("Midwest")
    MIDWEST("Midwest"),
    @XmlEnumValue("Southeast")
    SOUTHEAST("Southeast"),
    @XmlEnumValue("Northeast")
    NORTHEAST("Northeast");
    private final String value;

    Region(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Region fromValue(String v) {
        for (Region c: Region.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
