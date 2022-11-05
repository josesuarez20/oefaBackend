/**
 * Grupo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.ws.seguridad.bean;

public class Grupo  implements java.io.Serializable {
    private java.lang.Integer idGrupo;

    private java.lang.String codigo;

    private java.lang.String nombre;

    private java.lang.String abreviatura;

    private pe.gob.oefa.ws.seguridad.bean.Estado estado;

    private java.lang.String idsGrupo;

    private java.lang.Boolean check;

    public Grupo() {
    }

    public Grupo(
           java.lang.Integer idGrupo,
           java.lang.String codigo,
           java.lang.String nombre,
           java.lang.String abreviatura,
           pe.gob.oefa.ws.seguridad.bean.Estado estado,
           java.lang.String idsGrupo,
           java.lang.Boolean check) {
           this.idGrupo = idGrupo;
           this.codigo = codigo;
           this.nombre = nombre;
           this.abreviatura = abreviatura;
           this.estado = estado;
           this.idsGrupo = idsGrupo;
           this.check = check;
    }


    /**
     * Gets the idGrupo value for this Grupo.
     * 
     * @return idGrupo
     */
    public java.lang.Integer getIdGrupo() {
        return idGrupo;
    }


    /**
     * Sets the idGrupo value for this Grupo.
     * 
     * @param idGrupo
     */
    public void setIdGrupo(java.lang.Integer idGrupo) {
        this.idGrupo = idGrupo;
    }


    /**
     * Gets the codigo value for this Grupo.
     * 
     * @return codigo
     */
    public java.lang.String getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this Grupo.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.String codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the nombre value for this Grupo.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Grupo.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the abreviatura value for this Grupo.
     * 
     * @return abreviatura
     */
    public java.lang.String getAbreviatura() {
        return abreviatura;
    }


    /**
     * Sets the abreviatura value for this Grupo.
     * 
     * @param abreviatura
     */
    public void setAbreviatura(java.lang.String abreviatura) {
        this.abreviatura = abreviatura;
    }


    /**
     * Gets the estado value for this Grupo.
     * 
     * @return estado
     */
    public pe.gob.oefa.ws.seguridad.bean.Estado getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this Grupo.
     * 
     * @param estado
     */
    public void setEstado(pe.gob.oefa.ws.seguridad.bean.Estado estado) {
        this.estado = estado;
    }


    /**
     * Gets the idsGrupo value for this Grupo.
     * 
     * @return idsGrupo
     */
    public java.lang.String getIdsGrupo() {
        return idsGrupo;
    }


    /**
     * Sets the idsGrupo value for this Grupo.
     * 
     * @param idsGrupo
     */
    public void setIdsGrupo(java.lang.String idsGrupo) {
        this.idsGrupo = idsGrupo;
    }


    /**
     * Gets the check value for this Grupo.
     * 
     * @return check
     */
    public java.lang.Boolean getCheck() {
        return check;
    }


    /**
     * Sets the check value for this Grupo.
     * 
     * @param check
     */
    public void setCheck(java.lang.Boolean check) {
        this.check = check;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Grupo)) return false;
        Grupo other = (Grupo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idGrupo==null && other.getIdGrupo()==null) || 
             (this.idGrupo!=null &&
              this.idGrupo.equals(other.getIdGrupo()))) &&
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.abreviatura==null && other.getAbreviatura()==null) || 
             (this.abreviatura!=null &&
              this.abreviatura.equals(other.getAbreviatura()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.idsGrupo==null && other.getIdsGrupo()==null) || 
             (this.idsGrupo!=null &&
              this.idsGrupo.equals(other.getIdsGrupo()))) &&
            ((this.check==null && other.getCheck()==null) || 
             (this.check!=null &&
              this.check.equals(other.getCheck())));
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
        if (getIdGrupo() != null) {
            _hashCode += getIdGrupo().hashCode();
        }
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
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
        if (getIdsGrupo() != null) {
            _hashCode += getIdsGrupo().hashCode();
        }
        if (getCheck() != null) {
            _hashCode += getCheck().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Grupo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Grupo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idGrupo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdGrupo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("idsGrupo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdsGrupo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
