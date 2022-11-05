/**
 * TomoFolioBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.interoperabilidad.ws.sunarp.service;

public class TomoFolioBean  implements java.io.Serializable {
    private java.math.BigDecimal idImgFolio;

    private java.lang.String nroPagRef;

    private java.lang.String pagina;

    private java.lang.String tipo;

    public TomoFolioBean() {
    }

    public TomoFolioBean(
           java.math.BigDecimal idImgFolio,
           java.lang.String nroPagRef,
           java.lang.String pagina,
           java.lang.String tipo) {
           this.idImgFolio = idImgFolio;
           this.nroPagRef = nroPagRef;
           this.pagina = pagina;
           this.tipo = tipo;
    }


    /**
     * Gets the idImgFolio value for this TomoFolioBean.
     * 
     * @return idImgFolio
     */
    public java.math.BigDecimal getIdImgFolio() {
        return idImgFolio;
    }


    /**
     * Sets the idImgFolio value for this TomoFolioBean.
     * 
     * @param idImgFolio
     */
    public void setIdImgFolio(java.math.BigDecimal idImgFolio) {
        this.idImgFolio = idImgFolio;
    }


    /**
     * Gets the nroPagRef value for this TomoFolioBean.
     * 
     * @return nroPagRef
     */
    public java.lang.String getNroPagRef() {
        return nroPagRef;
    }


    /**
     * Sets the nroPagRef value for this TomoFolioBean.
     * 
     * @param nroPagRef
     */
    public void setNroPagRef(java.lang.String nroPagRef) {
        this.nroPagRef = nroPagRef;
    }


    /**
     * Gets the pagina value for this TomoFolioBean.
     * 
     * @return pagina
     */
    public java.lang.String getPagina() {
        return pagina;
    }


    /**
     * Sets the pagina value for this TomoFolioBean.
     * 
     * @param pagina
     */
    public void setPagina(java.lang.String pagina) {
        this.pagina = pagina;
    }


    /**
     * Gets the tipo value for this TomoFolioBean.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this TomoFolioBean.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TomoFolioBean)) return false;
        TomoFolioBean other = (TomoFolioBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idImgFolio==null && other.getIdImgFolio()==null) || 
             (this.idImgFolio!=null &&
              this.idImgFolio.equals(other.getIdImgFolio()))) &&
            ((this.nroPagRef==null && other.getNroPagRef()==null) || 
             (this.nroPagRef!=null &&
              this.nroPagRef.equals(other.getNroPagRef()))) &&
            ((this.pagina==null && other.getPagina()==null) || 
             (this.pagina!=null &&
              this.pagina.equals(other.getPagina()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo())));
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
        if (getIdImgFolio() != null) {
            _hashCode += getIdImgFolio().hashCode();
        }
        if (getNroPagRef() != null) {
            _hashCode += getNroPagRef().hashCode();
        }
        if (getPagina() != null) {
            _hashCode += getPagina().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TomoFolioBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.sunarp.ws.interoperabilidad.oefa.gob.pe/", "tomoFolioBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idImgFolio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idImgFolio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
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
