/**
 * BeanT362.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.interoperabilidad.ws.sunat.service;

public class BeanT362  implements java.io.Serializable {
    private java.lang.String desc_numreg;

    private java.lang.String t362_fecact;

    private java.lang.String t362_fecbaj;

    private int t362_indice;

    private java.lang.String t362_nombre;

    private java.lang.String t362_numreg;

    private java.lang.String t362_numruc;

    private java.lang.String t362_userna;

    public BeanT362() {
    }

    public BeanT362(
           java.lang.String desc_numreg,
           java.lang.String t362_fecact,
           java.lang.String t362_fecbaj,
           int t362_indice,
           java.lang.String t362_nombre,
           java.lang.String t362_numreg,
           java.lang.String t362_numruc,
           java.lang.String t362_userna) {
           this.desc_numreg = desc_numreg;
           this.t362_fecact = t362_fecact;
           this.t362_fecbaj = t362_fecbaj;
           this.t362_indice = t362_indice;
           this.t362_nombre = t362_nombre;
           this.t362_numreg = t362_numreg;
           this.t362_numruc = t362_numruc;
           this.t362_userna = t362_userna;
    }


    /**
     * Gets the desc_numreg value for this BeanT362.
     * 
     * @return desc_numreg
     */
    public java.lang.String getDesc_numreg() {
        return desc_numreg;
    }


    /**
     * Sets the desc_numreg value for this BeanT362.
     * 
     * @param desc_numreg
     */
    public void setDesc_numreg(java.lang.String desc_numreg) {
        this.desc_numreg = desc_numreg;
    }


    /**
     * Gets the t362_fecact value for this BeanT362.
     * 
     * @return t362_fecact
     */
    public java.lang.String getT362_fecact() {
        return t362_fecact;
    }


    /**
     * Sets the t362_fecact value for this BeanT362.
     * 
     * @param t362_fecact
     */
    public void setT362_fecact(java.lang.String t362_fecact) {
        this.t362_fecact = t362_fecact;
    }


    /**
     * Gets the t362_fecbaj value for this BeanT362.
     * 
     * @return t362_fecbaj
     */
    public java.lang.String getT362_fecbaj() {
        return t362_fecbaj;
    }


    /**
     * Sets the t362_fecbaj value for this BeanT362.
     * 
     * @param t362_fecbaj
     */
    public void setT362_fecbaj(java.lang.String t362_fecbaj) {
        this.t362_fecbaj = t362_fecbaj;
    }


    /**
     * Gets the t362_indice value for this BeanT362.
     * 
     * @return t362_indice
     */
    public int getT362_indice() {
        return t362_indice;
    }


    /**
     * Sets the t362_indice value for this BeanT362.
     * 
     * @param t362_indice
     */
    public void setT362_indice(int t362_indice) {
        this.t362_indice = t362_indice;
    }


    /**
     * Gets the t362_nombre value for this BeanT362.
     * 
     * @return t362_nombre
     */
    public java.lang.String getT362_nombre() {
        return t362_nombre;
    }


    /**
     * Sets the t362_nombre value for this BeanT362.
     * 
     * @param t362_nombre
     */
    public void setT362_nombre(java.lang.String t362_nombre) {
        this.t362_nombre = t362_nombre;
    }


    /**
     * Gets the t362_numreg value for this BeanT362.
     * 
     * @return t362_numreg
     */
    public java.lang.String getT362_numreg() {
        return t362_numreg;
    }


    /**
     * Sets the t362_numreg value for this BeanT362.
     * 
     * @param t362_numreg
     */
    public void setT362_numreg(java.lang.String t362_numreg) {
        this.t362_numreg = t362_numreg;
    }


    /**
     * Gets the t362_numruc value for this BeanT362.
     * 
     * @return t362_numruc
     */
    public java.lang.String getT362_numruc() {
        return t362_numruc;
    }


    /**
     * Sets the t362_numruc value for this BeanT362.
     * 
     * @param t362_numruc
     */
    public void setT362_numruc(java.lang.String t362_numruc) {
        this.t362_numruc = t362_numruc;
    }


    /**
     * Gets the t362_userna value for this BeanT362.
     * 
     * @return t362_userna
     */
    public java.lang.String getT362_userna() {
        return t362_userna;
    }


    /**
     * Sets the t362_userna value for this BeanT362.
     * 
     * @param t362_userna
     */
    public void setT362_userna(java.lang.String t362_userna) {
        this.t362_userna = t362_userna;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BeanT362)) return false;
        BeanT362 other = (BeanT362) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.desc_numreg==null && other.getDesc_numreg()==null) || 
             (this.desc_numreg!=null &&
              this.desc_numreg.equals(other.getDesc_numreg()))) &&
            ((this.t362_fecact==null && other.getT362_fecact()==null) || 
             (this.t362_fecact!=null &&
              this.t362_fecact.equals(other.getT362_fecact()))) &&
            ((this.t362_fecbaj==null && other.getT362_fecbaj()==null) || 
             (this.t362_fecbaj!=null &&
              this.t362_fecbaj.equals(other.getT362_fecbaj()))) &&
            this.t362_indice == other.getT362_indice() &&
            ((this.t362_nombre==null && other.getT362_nombre()==null) || 
             (this.t362_nombre!=null &&
              this.t362_nombre.equals(other.getT362_nombre()))) &&
            ((this.t362_numreg==null && other.getT362_numreg()==null) || 
             (this.t362_numreg!=null &&
              this.t362_numreg.equals(other.getT362_numreg()))) &&
            ((this.t362_numruc==null && other.getT362_numruc()==null) || 
             (this.t362_numruc!=null &&
              this.t362_numruc.equals(other.getT362_numruc()))) &&
            ((this.t362_userna==null && other.getT362_userna()==null) || 
             (this.t362_userna!=null &&
              this.t362_userna.equals(other.getT362_userna())));
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
        if (getDesc_numreg() != null) {
            _hashCode += getDesc_numreg().hashCode();
        }
        if (getT362_fecact() != null) {
            _hashCode += getT362_fecact().hashCode();
        }
        if (getT362_fecbaj() != null) {
            _hashCode += getT362_fecbaj().hashCode();
        }
        _hashCode += getT362_indice();
        if (getT362_nombre() != null) {
            _hashCode += getT362_nombre().hashCode();
        }
        if (getT362_numreg() != null) {
            _hashCode += getT362_numreg().hashCode();
        }
        if (getT362_numruc() != null) {
            _hashCode += getT362_numruc().hashCode();
        }
        if (getT362_userna() != null) {
            _hashCode += getT362_userna().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BeanT362.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.sunat.ws.interoperabilidad.oefa.gob.pe/", "beanT362"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desc_numreg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "desc_numreg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("t362_fecact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "t362_fecact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("t362_fecbaj");
        elemField.setXmlName(new javax.xml.namespace.QName("", "t362_fecbaj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("t362_indice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "t362_indice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("t362_nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "t362_nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("t362_numreg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "t362_numreg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("t362_numruc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "t362_numruc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("t362_userna");
        elemField.setXmlName(new javax.xml.namespace.QName("", "t362_userna"));
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
