/**
 * GetDatosT362.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.interoperabilidad.ws.sunat.service;

public class GetDatosT362  implements java.io.Serializable {
    private java.lang.String numruc;

    private java.lang.String usuarioOEFA;

    private java.lang.String ip;

    private java.lang.String mcAddress;

    public GetDatosT362() {
    }

    public GetDatosT362(
           java.lang.String numruc,
           java.lang.String usuarioOEFA,
           java.lang.String ip,
           java.lang.String mcAddress) {
           this.numruc = numruc;
           this.usuarioOEFA = usuarioOEFA;
           this.ip = ip;
           this.mcAddress = mcAddress;
    }


    /**
     * Gets the numruc value for this GetDatosT362.
     * 
     * @return numruc
     */
    public java.lang.String getNumruc() {
        return numruc;
    }


    /**
     * Sets the numruc value for this GetDatosT362.
     * 
     * @param numruc
     */
    public void setNumruc(java.lang.String numruc) {
        this.numruc = numruc;
    }


    /**
     * Gets the usuarioOEFA value for this GetDatosT362.
     * 
     * @return usuarioOEFA
     */
    public java.lang.String getUsuarioOEFA() {
        return usuarioOEFA;
    }


    /**
     * Sets the usuarioOEFA value for this GetDatosT362.
     * 
     * @param usuarioOEFA
     */
    public void setUsuarioOEFA(java.lang.String usuarioOEFA) {
        this.usuarioOEFA = usuarioOEFA;
    }


    /**
     * Gets the ip value for this GetDatosT362.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this GetDatosT362.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }


    /**
     * Gets the mcAddress value for this GetDatosT362.
     * 
     * @return mcAddress
     */
    public java.lang.String getMcAddress() {
        return mcAddress;
    }


    /**
     * Sets the mcAddress value for this GetDatosT362.
     * 
     * @param mcAddress
     */
    public void setMcAddress(java.lang.String mcAddress) {
        this.mcAddress = mcAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDatosT362)) return false;
        GetDatosT362 other = (GetDatosT362) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numruc==null && other.getNumruc()==null) || 
             (this.numruc!=null &&
              this.numruc.equals(other.getNumruc()))) &&
            ((this.usuarioOEFA==null && other.getUsuarioOEFA()==null) || 
             (this.usuarioOEFA!=null &&
              this.usuarioOEFA.equals(other.getUsuarioOEFA()))) &&
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp()))) &&
            ((this.mcAddress==null && other.getMcAddress()==null) || 
             (this.mcAddress!=null &&
              this.mcAddress.equals(other.getMcAddress())));
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
        if (getNumruc() != null) {
            _hashCode += getNumruc().hashCode();
        }
        if (getUsuarioOEFA() != null) {
            _hashCode += getUsuarioOEFA().hashCode();
        }
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        if (getMcAddress() != null) {
            _hashCode += getMcAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDatosT362.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.sunat.ws.interoperabilidad.oefa.gob.pe/", "getDatosT362"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numruc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numruc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioOEFA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioOEFA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mcAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mcAddress"));
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
