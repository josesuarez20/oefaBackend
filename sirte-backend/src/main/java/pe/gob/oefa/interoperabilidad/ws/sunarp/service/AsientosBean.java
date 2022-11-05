/**
 * AsientosBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.interoperabilidad.ws.sunarp.service;

public class AsientosBean  implements java.io.Serializable {
    private java.math.BigDecimal idImgAsiento;

    private pe.gob.oefa.interoperabilidad.ws.sunarp.service.NumeroPaginasBean[] listPag;

    private java.math.BigDecimal numPag;

    private java.lang.String tipo;

    public AsientosBean() {
    }

    public AsientosBean(
           java.math.BigDecimal idImgAsiento,
           pe.gob.oefa.interoperabilidad.ws.sunarp.service.NumeroPaginasBean[] listPag,
           java.math.BigDecimal numPag,
           java.lang.String tipo) {
           this.idImgAsiento = idImgAsiento;
           this.listPag = listPag;
           this.numPag = numPag;
           this.tipo = tipo;
    }


    /**
     * Gets the idImgAsiento value for this AsientosBean.
     * 
     * @return idImgAsiento
     */
    public java.math.BigDecimal getIdImgAsiento() {
        return idImgAsiento;
    }


    /**
     * Sets the idImgAsiento value for this AsientosBean.
     * 
     * @param idImgAsiento
     */
    public void setIdImgAsiento(java.math.BigDecimal idImgAsiento) {
        this.idImgAsiento = idImgAsiento;
    }


    /**
     * Gets the listPag value for this AsientosBean.
     * 
     * @return listPag
     */
    public pe.gob.oefa.interoperabilidad.ws.sunarp.service.NumeroPaginasBean[] getListPag() {
        return listPag;
    }


    /**
     * Sets the listPag value for this AsientosBean.
     * 
     * @param listPag
     */
    public void setListPag(pe.gob.oefa.interoperabilidad.ws.sunarp.service.NumeroPaginasBean[] listPag) {
        this.listPag = listPag;
    }

    public pe.gob.oefa.interoperabilidad.ws.sunarp.service.NumeroPaginasBean getListPag(int i) {
        return this.listPag[i];
    }

    public void setListPag(int i, pe.gob.oefa.interoperabilidad.ws.sunarp.service.NumeroPaginasBean _value) {
        this.listPag[i] = _value;
    }


    /**
     * Gets the numPag value for this AsientosBean.
     * 
     * @return numPag
     */
    public java.math.BigDecimal getNumPag() {
        return numPag;
    }


    /**
     * Sets the numPag value for this AsientosBean.
     * 
     * @param numPag
     */
    public void setNumPag(java.math.BigDecimal numPag) {
        this.numPag = numPag;
    }


    /**
     * Gets the tipo value for this AsientosBean.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this AsientosBean.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AsientosBean)) return false;
        AsientosBean other = (AsientosBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idImgAsiento==null && other.getIdImgAsiento()==null) || 
             (this.idImgAsiento!=null &&
              this.idImgAsiento.equals(other.getIdImgAsiento()))) &&
            ((this.listPag==null && other.getListPag()==null) || 
             (this.listPag!=null &&
              java.util.Arrays.equals(this.listPag, other.getListPag()))) &&
            ((this.numPag==null && other.getNumPag()==null) || 
             (this.numPag!=null &&
              this.numPag.equals(other.getNumPag()))) &&
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
        if (getIdImgAsiento() != null) {
            _hashCode += getIdImgAsiento().hashCode();
        }
        if (getListPag() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListPag());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListPag(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumPag() != null) {
            _hashCode += getNumPag().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AsientosBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.sunarp.ws.interoperabilidad.oefa.gob.pe/", "asientosBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idImgAsiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idImgAsiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listPag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listPag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.sunarp.ws.interoperabilidad.oefa.gob.pe/", "numeroPaginasBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numPag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numPag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
