/**
 * PaginaAccion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.ws.seguridad.bean;

public class PaginaAccion  implements java.io.Serializable {
    private java.lang.Integer idPaginaAccion;

    private java.lang.Boolean chkAgregar;

    private pe.gob.oefa.ws.seguridad.bean.Accion accion;

    private pe.gob.oefa.ws.seguridad.bean.Pagina pagina;

    public PaginaAccion() {
    }

    public PaginaAccion(
           java.lang.Integer idPaginaAccion,
           java.lang.Boolean chkAgregar,
           pe.gob.oefa.ws.seguridad.bean.Accion accion,
           pe.gob.oefa.ws.seguridad.bean.Pagina pagina) {
           this.idPaginaAccion = idPaginaAccion;
           this.chkAgregar = chkAgregar;
           this.accion = accion;
           this.pagina = pagina;
    }


    /**
     * Gets the idPaginaAccion value for this PaginaAccion.
     * 
     * @return idPaginaAccion
     */
    public java.lang.Integer getIdPaginaAccion() {
        return idPaginaAccion;
    }


    /**
     * Sets the idPaginaAccion value for this PaginaAccion.
     * 
     * @param idPaginaAccion
     */
    public void setIdPaginaAccion(java.lang.Integer idPaginaAccion) {
        this.idPaginaAccion = idPaginaAccion;
    }


    /**
     * Gets the chkAgregar value for this PaginaAccion.
     * 
     * @return chkAgregar
     */
    public java.lang.Boolean getChkAgregar() {
        return chkAgregar;
    }


    /**
     * Sets the chkAgregar value for this PaginaAccion.
     * 
     * @param chkAgregar
     */
    public void setChkAgregar(java.lang.Boolean chkAgregar) {
        this.chkAgregar = chkAgregar;
    }


    /**
     * Gets the accion value for this PaginaAccion.
     * 
     * @return accion
     */
    public pe.gob.oefa.ws.seguridad.bean.Accion getAccion() {
        return accion;
    }


    /**
     * Sets the accion value for this PaginaAccion.
     * 
     * @param accion
     */
    public void setAccion(pe.gob.oefa.ws.seguridad.bean.Accion accion) {
        this.accion = accion;
    }


    /**
     * Gets the pagina value for this PaginaAccion.
     * 
     * @return pagina
     */
    public pe.gob.oefa.ws.seguridad.bean.Pagina getPagina() {
        return pagina;
    }


    /**
     * Sets the pagina value for this PaginaAccion.
     * 
     * @param pagina
     */
    public void setPagina(pe.gob.oefa.ws.seguridad.bean.Pagina pagina) {
        this.pagina = pagina;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaginaAccion)) return false;
        PaginaAccion other = (PaginaAccion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idPaginaAccion==null && other.getIdPaginaAccion()==null) || 
             (this.idPaginaAccion!=null &&
              this.idPaginaAccion.equals(other.getIdPaginaAccion()))) &&
            ((this.chkAgregar==null && other.getChkAgregar()==null) || 
             (this.chkAgregar!=null &&
              this.chkAgregar.equals(other.getChkAgregar()))) &&
            ((this.accion==null && other.getAccion()==null) || 
             (this.accion!=null &&
              this.accion.equals(other.getAccion()))) &&
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
        if (getIdPaginaAccion() != null) {
            _hashCode += getIdPaginaAccion().hashCode();
        }
        if (getChkAgregar() != null) {
            _hashCode += getChkAgregar().hashCode();
        }
        if (getAccion() != null) {
            _hashCode += getAccion().hashCode();
        }
        if (getPagina() != null) {
            _hashCode += getPagina().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaginaAccion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "PaginaAccion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPaginaAccion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdPaginaAccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chkAgregar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "ChkAgregar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Accion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Accion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagina");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Pagina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Pagina"));
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
