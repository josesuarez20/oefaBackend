/**
 * NumeroPaginasBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.interoperabilidad.ws.sunarp.service;

public class NumeroPaginasBean  implements java.io.Serializable {
    private java.lang.String nroPagRef;

    private java.lang.String pagina;

    public NumeroPaginasBean() {
    }

    public NumeroPaginasBean(
           java.lang.String nroPagRef,
           java.lang.String pagina) {
           this.nroPagRef = nroPagRef;
           this.pagina = pagina;
    }


    /**
     * Gets the nroPagRef value for this NumeroPaginasBean.
     * 
     * @return nroPagRef
     */
    public java.lang.String getNroPagRef() {
        return nroPagRef;
    }


    /**
     * Sets the nroPagRef value for this NumeroPaginasBean.
     * 
     * @param nroPagRef
     */
    public void setNroPagRef(java.lang.String nroPagRef) {
        this.nroPagRef = nroPagRef;
    }


    /**
     * Gets the pagina value for this NumeroPaginasBean.
     * 
     * @return pagina
     */
    public java.lang.String getPagina() {
        return pagina;
    }


    /**
     * Sets the pagina value for this NumeroPaginasBean.
     * 
     * @param pagina
     */
    public void setPagina(java.lang.String pagina) {
        this.pagina = pagina;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NumeroPaginasBean)) return false;
        NumeroPaginasBean other = (NumeroPaginasBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nroPagRef==null && other.getNroPagRef()==null) || 
             (this.nroPagRef!=null &&
              this.nroPagRef.equals(other.getNroPagRef()))) &&
            ((this.pagina==null && other.getPagina()==null) || 
             (this.pagina!=null &&
              this.pagina.equals(other.getPagina())));
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
        if (getNroPagRef() != null) {
            _hashCode += getNroPagRef().hashCode();
        }
        if (getPagina() != null) {
            _hashCode += getPagina().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NumeroPaginasBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.sunarp.ws.interoperabilidad.oefa.gob.pe/", "numeroPaginasBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroPagRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nroPagRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagina");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pagina"));
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
