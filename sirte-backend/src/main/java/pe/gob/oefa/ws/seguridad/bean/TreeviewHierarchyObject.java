/**
 * TreeviewHierarchyObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.ws.seguridad.bean;

public class TreeviewHierarchyObject  implements java.io.Serializable {
    private java.lang.Integer id;

    private java.lang.String nombre;

    private java.lang.Integer idPadre;

    private java.lang.Integer nivel;

    private java.lang.Integer nivelPagina;

    private java.lang.Integer idPaginaPadre;

    private java.lang.Boolean check;

    public TreeviewHierarchyObject() {
    }

    public TreeviewHierarchyObject(
           java.lang.Integer id,
           java.lang.String nombre,
           java.lang.Integer idPadre,
           java.lang.Integer nivel,
           java.lang.Integer nivelPagina,
           java.lang.Integer idPaginaPadre,
           java.lang.Boolean check) {
           this.id = id;
           this.nombre = nombre;
           this.idPadre = idPadre;
           this.nivel = nivel;
           this.nivelPagina = nivelPagina;
           this.idPaginaPadre = idPaginaPadre;
           this.check = check;
    }


    /**
     * Gets the id value for this TreeviewHierarchyObject.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this TreeviewHierarchyObject.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the nombre value for this TreeviewHierarchyObject.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this TreeviewHierarchyObject.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the idPadre value for this TreeviewHierarchyObject.
     * 
     * @return idPadre
     */
    public java.lang.Integer getIdPadre() {
        return idPadre;
    }


    /**
     * Sets the idPadre value for this TreeviewHierarchyObject.
     * 
     * @param idPadre
     */
    public void setIdPadre(java.lang.Integer idPadre) {
        this.idPadre = idPadre;
    }


    /**
     * Gets the nivel value for this TreeviewHierarchyObject.
     * 
     * @return nivel
     */
    public java.lang.Integer getNivel() {
        return nivel;
    }


    /**
     * Sets the nivel value for this TreeviewHierarchyObject.
     * 
     * @param nivel
     */
    public void setNivel(java.lang.Integer nivel) {
        this.nivel = nivel;
    }


    /**
     * Gets the nivelPagina value for this TreeviewHierarchyObject.
     * 
     * @return nivelPagina
     */
    public java.lang.Integer getNivelPagina() {
        return nivelPagina;
    }


    /**
     * Sets the nivelPagina value for this TreeviewHierarchyObject.
     * 
     * @param nivelPagina
     */
    public void setNivelPagina(java.lang.Integer nivelPagina) {
        this.nivelPagina = nivelPagina;
    }


    /**
     * Gets the idPaginaPadre value for this TreeviewHierarchyObject.
     * 
     * @return idPaginaPadre
     */
    public java.lang.Integer getIdPaginaPadre() {
        return idPaginaPadre;
    }


    /**
     * Sets the idPaginaPadre value for this TreeviewHierarchyObject.
     * 
     * @param idPaginaPadre
     */
    public void setIdPaginaPadre(java.lang.Integer idPaginaPadre) {
        this.idPaginaPadre = idPaginaPadre;
    }


    /**
     * Gets the check value for this TreeviewHierarchyObject.
     * 
     * @return check
     */
    public java.lang.Boolean getCheck() {
        return check;
    }


    /**
     * Sets the check value for this TreeviewHierarchyObject.
     * 
     * @param check
     */
    public void setCheck(java.lang.Boolean check) {
        this.check = check;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TreeviewHierarchyObject)) return false;
        TreeviewHierarchyObject other = (TreeviewHierarchyObject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.idPadre==null && other.getIdPadre()==null) || 
             (this.idPadre!=null &&
              this.idPadre.equals(other.getIdPadre()))) &&
            ((this.nivel==null && other.getNivel()==null) || 
             (this.nivel!=null &&
              this.nivel.equals(other.getNivel()))) &&
            ((this.nivelPagina==null && other.getNivelPagina()==null) || 
             (this.nivelPagina!=null &&
              this.nivelPagina.equals(other.getNivelPagina()))) &&
            ((this.idPaginaPadre==null && other.getIdPaginaPadre()==null) || 
             (this.idPaginaPadre!=null &&
              this.idPaginaPadre.equals(other.getIdPaginaPadre()))) &&
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getIdPadre() != null) {
            _hashCode += getIdPadre().hashCode();
        }
        if (getNivel() != null) {
            _hashCode += getNivel().hashCode();
        }
        if (getNivelPagina() != null) {
            _hashCode += getNivelPagina().hashCode();
        }
        if (getIdPaginaPadre() != null) {
            _hashCode += getIdPaginaPadre().hashCode();
        }
        if (getCheck() != null) {
            _hashCode += getCheck().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TreeviewHierarchyObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "TreeviewHierarchyObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Id"));
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
        elemField.setFieldName("idPadre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdPadre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nivel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Nivel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nivelPagina");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "NivelPagina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPaginaPadre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdPaginaPadre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
