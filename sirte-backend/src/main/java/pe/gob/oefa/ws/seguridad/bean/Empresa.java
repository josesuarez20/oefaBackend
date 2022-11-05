/**
 * Empresa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.ws.seguridad.bean;

public class Empresa  implements java.io.Serializable {
    private java.lang.Integer idEmpresa;

    private java.lang.String nombre;

    private java.lang.String abreviatura;

    private pe.gob.oefa.ws.seguridad.bean.Estado estado;

    private java.lang.Boolean check;

    private java.lang.String idsEmpresa;

    private java.lang.String codigoEmpresa;

    private java.lang.String contentStyle;

    public Empresa() {
    }

    public Empresa(
           java.lang.Integer idEmpresa,
           java.lang.String nombre,
           java.lang.String abreviatura,
           pe.gob.oefa.ws.seguridad.bean.Estado estado,
           java.lang.Boolean check,
           java.lang.String idsEmpresa,
           java.lang.String codigoEmpresa,
           java.lang.String contentStyle) {
           this.idEmpresa = idEmpresa;
           this.nombre = nombre;
           this.abreviatura = abreviatura;
           this.estado = estado;
           this.check = check;
           this.idsEmpresa = idsEmpresa;
           this.codigoEmpresa = codigoEmpresa;
           this.contentStyle = contentStyle;
    }


    /**
     * Gets the idEmpresa value for this Empresa.
     * 
     * @return idEmpresa
     */
    public java.lang.Integer getIdEmpresa() {
        return idEmpresa;
    }


    /**
     * Sets the idEmpresa value for this Empresa.
     * 
     * @param idEmpresa
     */
    public void setIdEmpresa(java.lang.Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }


    /**
     * Gets the nombre value for this Empresa.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Empresa.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the abreviatura value for this Empresa.
     * 
     * @return abreviatura
     */
    public java.lang.String getAbreviatura() {
        return abreviatura;
    }


    /**
     * Sets the abreviatura value for this Empresa.
     * 
     * @param abreviatura
     */
    public void setAbreviatura(java.lang.String abreviatura) {
        this.abreviatura = abreviatura;
    }


    /**
     * Gets the estado value for this Empresa.
     * 
     * @return estado
     */
    public pe.gob.oefa.ws.seguridad.bean.Estado getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this Empresa.
     * 
     * @param estado
     */
    public void setEstado(pe.gob.oefa.ws.seguridad.bean.Estado estado) {
        this.estado = estado;
    }


    /**
     * Gets the check value for this Empresa.
     * 
     * @return check
     */
    public java.lang.Boolean getCheck() {
        return check;
    }


    /**
     * Sets the check value for this Empresa.
     * 
     * @param check
     */
    public void setCheck(java.lang.Boolean check) {
        this.check = check;
    }


    /**
     * Gets the idsEmpresa value for this Empresa.
     * 
     * @return idsEmpresa
     */
    public java.lang.String getIdsEmpresa() {
        return idsEmpresa;
    }


    /**
     * Sets the idsEmpresa value for this Empresa.
     * 
     * @param idsEmpresa
     */
    public void setIdsEmpresa(java.lang.String idsEmpresa) {
        this.idsEmpresa = idsEmpresa;
    }


    /**
     * Gets the codigoEmpresa value for this Empresa.
     * 
     * @return codigoEmpresa
     */
    public java.lang.String getCodigoEmpresa() {
        return codigoEmpresa;
    }


    /**
     * Sets the codigoEmpresa value for this Empresa.
     * 
     * @param codigoEmpresa
     */
    public void setCodigoEmpresa(java.lang.String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }


    /**
     * Gets the contentStyle value for this Empresa.
     * 
     * @return contentStyle
     */
    public java.lang.String getContentStyle() {
        return contentStyle;
    }


    /**
     * Sets the contentStyle value for this Empresa.
     * 
     * @param contentStyle
     */
    public void setContentStyle(java.lang.String contentStyle) {
        this.contentStyle = contentStyle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Empresa)) return false;
        Empresa other = (Empresa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idEmpresa==null && other.getIdEmpresa()==null) || 
             (this.idEmpresa!=null &&
              this.idEmpresa.equals(other.getIdEmpresa()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.abreviatura==null && other.getAbreviatura()==null) || 
             (this.abreviatura!=null &&
              this.abreviatura.equals(other.getAbreviatura()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.check==null && other.getCheck()==null) || 
             (this.check!=null &&
              this.check.equals(other.getCheck()))) &&
            ((this.idsEmpresa==null && other.getIdsEmpresa()==null) || 
             (this.idsEmpresa!=null &&
              this.idsEmpresa.equals(other.getIdsEmpresa()))) &&
            ((this.codigoEmpresa==null && other.getCodigoEmpresa()==null) || 
             (this.codigoEmpresa!=null &&
              this.codigoEmpresa.equals(other.getCodigoEmpresa()))) &&
            ((this.contentStyle==null && other.getContentStyle()==null) || 
             (this.contentStyle!=null &&
              this.contentStyle.equals(other.getContentStyle())));
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
        if (getIdEmpresa() != null) {
            _hashCode += getIdEmpresa().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getAbreviatura() != null) {
            _hashCode += getAbreviatura().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getCheck() != null) {
            _hashCode += getCheck().hashCode();
        }
        if (getIdsEmpresa() != null) {
            _hashCode += getIdsEmpresa().hashCode();
        }
        if (getCodigoEmpresa() != null) {
            _hashCode += getCodigoEmpresa().hashCode();
        }
        if (getContentStyle() != null) {
            _hashCode += getContentStyle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Empresa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Empresa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idEmpresa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdEmpresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abreviatura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Abreviatura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Estado"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("check");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Check"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idsEmpresa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdsEmpresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEmpresa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "CodigoEmpresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "ContentStyle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
