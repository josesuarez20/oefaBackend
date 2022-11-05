/**
 * RespuestaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.interoperabilidad.ws.sunedu.service;

public class RespuestaType  implements java.io.Serializable {
    private java.lang.String CGenerico;

    private java.lang.String DGenerica;

    private java.lang.String fechaSunedu;

    private java.lang.String horaSunedu;

    public RespuestaType() {
    }

    public RespuestaType(
           java.lang.String CGenerico,
           java.lang.String DGenerica,
           java.lang.String fechaSunedu,
           java.lang.String horaSunedu) {
           this.CGenerico = CGenerico;
           this.DGenerica = DGenerica;
           this.fechaSunedu = fechaSunedu;
           this.horaSunedu = horaSunedu;
    }


    /**
     * Gets the CGenerico value for this RespuestaType.
     * 
     * @return CGenerico
     */
    public java.lang.String getCGenerico() {
        return CGenerico;
    }


    /**
     * Sets the CGenerico value for this RespuestaType.
     * 
     * @param CGenerico
     */
    public void setCGenerico(java.lang.String CGenerico) {
        this.CGenerico = CGenerico;
    }


    /**
     * Gets the DGenerica value for this RespuestaType.
     * 
     * @return DGenerica
     */
    public java.lang.String getDGenerica() {
        return DGenerica;
    }


    /**
     * Sets the DGenerica value for this RespuestaType.
     * 
     * @param DGenerica
     */
    public void setDGenerica(java.lang.String DGenerica) {
        this.DGenerica = DGenerica;
    }


    /**
     * Gets the fechaSunedu value for this RespuestaType.
     * 
     * @return fechaSunedu
     */
    public java.lang.String getFechaSunedu() {
        return fechaSunedu;
    }


    /**
     * Sets the fechaSunedu value for this RespuestaType.
     * 
     * @param fechaSunedu
     */
    public void setFechaSunedu(java.lang.String fechaSunedu) {
        this.fechaSunedu = fechaSunedu;
    }


    /**
     * Gets the horaSunedu value for this RespuestaType.
     * 
     * @return horaSunedu
     */
    public java.lang.String getHoraSunedu() {
        return horaSunedu;
    }


    /**
     * Sets the horaSunedu value for this RespuestaType.
     * 
     * @param horaSunedu
     */
    public void setHoraSunedu(java.lang.String horaSunedu) {
        this.horaSunedu = horaSunedu;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaType)) return false;
        RespuestaType other = (RespuestaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CGenerico==null && other.getCGenerico()==null) || 
             (this.CGenerico!=null &&
              this.CGenerico.equals(other.getCGenerico()))) &&
            ((this.DGenerica==null && other.getDGenerica()==null) || 
             (this.DGenerica!=null &&
              this.DGenerica.equals(other.getDGenerica()))) &&
            ((this.fechaSunedu==null && other.getFechaSunedu()==null) || 
             (this.fechaSunedu!=null &&
              this.fechaSunedu.equals(other.getFechaSunedu()))) &&
            ((this.horaSunedu==null && other.getHoraSunedu()==null) || 
             (this.horaSunedu!=null &&
              this.horaSunedu.equals(other.getHoraSunedu())));
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
        if (getCGenerico() != null) {
            _hashCode += getCGenerico().hashCode();
        }
        if (getDGenerica() != null) {
            _hashCode += getDGenerica().hashCode();
        }
        if (getFechaSunedu() != null) {
            _hashCode += getFechaSunedu().hashCode();
        }
        if (getHoraSunedu() != null) {
            _hashCode += getHoraSunedu().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuestaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.sunedu.ws.interoperabilidad.oefa.gob.pe/", "respuestaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CGenerico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CGenerico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DGenerica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DGenerica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaSunedu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaSunedu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horaSunedu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "horaSunedu"));
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
