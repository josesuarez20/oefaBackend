/**
 * Consulta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.interoperabilidad.ws.migraciones.service;

public abstract class Consulta  implements java.io.Serializable {
    private java.lang.String strCodInstitucion;

    private java.lang.String strMac;

    private java.lang.String strNroIp;

    private java.lang.String strNumDocumento;

    private java.lang.String strTipoDocumento;

    public Consulta() {
    }

    public Consulta(
           java.lang.String strCodInstitucion,
           java.lang.String strMac,
           java.lang.String strNroIp,
           java.lang.String strNumDocumento,
           java.lang.String strTipoDocumento) {
           this.strCodInstitucion = strCodInstitucion;
           this.strMac = strMac;
           this.strNroIp = strNroIp;
           this.strNumDocumento = strNumDocumento;
           this.strTipoDocumento = strTipoDocumento;
    }


    /**
     * Gets the strCodInstitucion value for this Consulta.
     * 
     * @return strCodInstitucion
     */
    public java.lang.String getStrCodInstitucion() {
        return strCodInstitucion;
    }


    /**
     * Sets the strCodInstitucion value for this Consulta.
     * 
     * @param strCodInstitucion
     */
    public void setStrCodInstitucion(java.lang.String strCodInstitucion) {
        this.strCodInstitucion = strCodInstitucion;
    }


    /**
     * Gets the strMac value for this Consulta.
     * 
     * @return strMac
     */
    public java.lang.String getStrMac() {
        return strMac;
    }


    /**
     * Sets the strMac value for this Consulta.
     * 
     * @param strMac
     */
    public void setStrMac(java.lang.String strMac) {
        this.strMac = strMac;
    }


    /**
     * Gets the strNroIp value for this Consulta.
     * 
     * @return strNroIp
     */
    public java.lang.String getStrNroIp() {
        return strNroIp;
    }


    /**
     * Sets the strNroIp value for this Consulta.
     * 
     * @param strNroIp
     */
    public void setStrNroIp(java.lang.String strNroIp) {
        this.strNroIp = strNroIp;
    }


    /**
     * Gets the strNumDocumento value for this Consulta.
     * 
     * @return strNumDocumento
     */
    public java.lang.String getStrNumDocumento() {
        return strNumDocumento;
    }


    /**
     * Sets the strNumDocumento value for this Consulta.
     * 
     * @param strNumDocumento
     */
    public void setStrNumDocumento(java.lang.String strNumDocumento) {
        this.strNumDocumento = strNumDocumento;
    }


    /**
     * Gets the strTipoDocumento value for this Consulta.
     * 
     * @return strTipoDocumento
     */
    public java.lang.String getStrTipoDocumento() {
        return strTipoDocumento;
    }


    /**
     * Sets the strTipoDocumento value for this Consulta.
     * 
     * @param strTipoDocumento
     */
    public void setStrTipoDocumento(java.lang.String strTipoDocumento) {
        this.strTipoDocumento = strTipoDocumento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Consulta)) return false;
        Consulta other = (Consulta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strCodInstitucion==null && other.getStrCodInstitucion()==null) || 
             (this.strCodInstitucion!=null &&
              this.strCodInstitucion.equals(other.getStrCodInstitucion()))) &&
            ((this.strMac==null && other.getStrMac()==null) || 
             (this.strMac!=null &&
              this.strMac.equals(other.getStrMac()))) &&
            ((this.strNroIp==null && other.getStrNroIp()==null) || 
             (this.strNroIp!=null &&
              this.strNroIp.equals(other.getStrNroIp()))) &&
            ((this.strNumDocumento==null && other.getStrNumDocumento()==null) || 
             (this.strNumDocumento!=null &&
              this.strNumDocumento.equals(other.getStrNumDocumento()))) &&
            ((this.strTipoDocumento==null && other.getStrTipoDocumento()==null) || 
             (this.strTipoDocumento!=null &&
              this.strTipoDocumento.equals(other.getStrTipoDocumento())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getStrCodInstitucion() != null) {
            _hashCode += getStrCodInstitucion().hashCode();
        }
        if (getStrMac() != null) {
            _hashCode += getStrMac().hashCode();
        }
        if (getStrNroIp() != null) {
            _hashCode += getStrNroIp().hashCode();
        }
        if (getStrNumDocumento() != null) {
            _hashCode += getStrNumDocumento().hashCode();
        }
        if (getStrTipoDocumento() != null) {
            _hashCode += getStrTipoDocumento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Consulta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.migraciones.ws.interoperabilidad.oefa.gob.pe/", "consulta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCodInstitucion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strCodInstitucion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strMac");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strMac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strNroIp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strNroIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strNumDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strNumDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strTipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strTipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
