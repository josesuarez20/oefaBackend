/**
 * Politica.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.ws.seguridad.bean;

public class Politica  implements java.io.Serializable {
    private java.lang.Integer IDLongMinima_Contrasena;

    private java.lang.Integer IDVigencia_Contrasena;

    private java.lang.Integer IDDiferencia_ContrasenaUsuario;

    private java.lang.Integer IDNroMaximoIntentos;

    private java.lang.Integer IDDiasBloqueoUsuario;

    private java.lang.Integer IDComplejidadContrasena;

    private java.lang.Integer IDCantidadContrasenaHist;

    public Politica() {
    }

    public Politica(
           java.lang.Integer IDLongMinima_Contrasena,
           java.lang.Integer IDVigencia_Contrasena,
           java.lang.Integer IDDiferencia_ContrasenaUsuario,
           java.lang.Integer IDNroMaximoIntentos,
           java.lang.Integer IDDiasBloqueoUsuario,
           java.lang.Integer IDComplejidadContrasena,
           java.lang.Integer IDCantidadContrasenaHist) {
           this.IDLongMinima_Contrasena = IDLongMinima_Contrasena;
           this.IDVigencia_Contrasena = IDVigencia_Contrasena;
           this.IDDiferencia_ContrasenaUsuario = IDDiferencia_ContrasenaUsuario;
           this.IDNroMaximoIntentos = IDNroMaximoIntentos;
           this.IDDiasBloqueoUsuario = IDDiasBloqueoUsuario;
           this.IDComplejidadContrasena = IDComplejidadContrasena;
           this.IDCantidadContrasenaHist = IDCantidadContrasenaHist;
    }


    /**
     * Gets the IDLongMinima_Contrasena value for this Politica.
     * 
     * @return IDLongMinima_Contrasena
     */
    public java.lang.Integer getIDLongMinima_Contrasena() {
        return IDLongMinima_Contrasena;
    }


    /**
     * Sets the IDLongMinima_Contrasena value for this Politica.
     * 
     * @param IDLongMinima_Contrasena
     */
    public void setIDLongMinima_Contrasena(java.lang.Integer IDLongMinima_Contrasena) {
        this.IDLongMinima_Contrasena = IDLongMinima_Contrasena;
    }


    /**
     * Gets the IDVigencia_Contrasena value for this Politica.
     * 
     * @return IDVigencia_Contrasena
     */
    public java.lang.Integer getIDVigencia_Contrasena() {
        return IDVigencia_Contrasena;
    }


    /**
     * Sets the IDVigencia_Contrasena value for this Politica.
     * 
     * @param IDVigencia_Contrasena
     */
    public void setIDVigencia_Contrasena(java.lang.Integer IDVigencia_Contrasena) {
        this.IDVigencia_Contrasena = IDVigencia_Contrasena;
    }


    /**
     * Gets the IDDiferencia_ContrasenaUsuario value for this Politica.
     * 
     * @return IDDiferencia_ContrasenaUsuario
     */
    public java.lang.Integer getIDDiferencia_ContrasenaUsuario() {
        return IDDiferencia_ContrasenaUsuario;
    }


    /**
     * Sets the IDDiferencia_ContrasenaUsuario value for this Politica.
     * 
     * @param IDDiferencia_ContrasenaUsuario
     */
    public void setIDDiferencia_ContrasenaUsuario(java.lang.Integer IDDiferencia_ContrasenaUsuario) {
        this.IDDiferencia_ContrasenaUsuario = IDDiferencia_ContrasenaUsuario;
    }


    /**
     * Gets the IDNroMaximoIntentos value for this Politica.
     * 
     * @return IDNroMaximoIntentos
     */
    public java.lang.Integer getIDNroMaximoIntentos() {
        return IDNroMaximoIntentos;
    }


    /**
     * Sets the IDNroMaximoIntentos value for this Politica.
     * 
     * @param IDNroMaximoIntentos
     */
    public void setIDNroMaximoIntentos(java.lang.Integer IDNroMaximoIntentos) {
        this.IDNroMaximoIntentos = IDNroMaximoIntentos;
    }


    /**
     * Gets the IDDiasBloqueoUsuario value for this Politica.
     * 
     * @return IDDiasBloqueoUsuario
     */
    public java.lang.Integer getIDDiasBloqueoUsuario() {
        return IDDiasBloqueoUsuario;
    }


    /**
     * Sets the IDDiasBloqueoUsuario value for this Politica.
     * 
     * @param IDDiasBloqueoUsuario
     */
    public void setIDDiasBloqueoUsuario(java.lang.Integer IDDiasBloqueoUsuario) {
        this.IDDiasBloqueoUsuario = IDDiasBloqueoUsuario;
    }


    /**
     * Gets the IDComplejidadContraseña value for this Politica.
     * 
     * @return IDComplejidadContraseña
     */
    public java.lang.Integer getIDComplejidadContrasena() {
        return IDComplejidadContrasena;
    }


    /**
     * Sets the IDComplejidadContraseña value for this Politica.
     * 
     * @param IDComplejidadContraseña
     */
    public void setIDComplejidadContrasena(java.lang.Integer IDComplejidadContrasena) {
        this.IDComplejidadContrasena = IDComplejidadContrasena;
    }


    /**
     * Gets the IDCantidadContrasenaHist value for this Politica.
     * 
     * @return IDCantidadContrasenaHist
     */
    public java.lang.Integer getIDCantidadContrasenaHist() {
        return IDCantidadContrasenaHist;
    }


    /**
     * Sets the IDCantidadContrasenaHist value for this Politica.
     * 
     * @param IDCantidadContrasenaHist
     */
    public void setIDCantidadContrasenaHist(java.lang.Integer IDCantidadContrasenaHist) {
        this.IDCantidadContrasenaHist = IDCantidadContrasenaHist;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Politica)) return false;
        Politica other = (Politica) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IDLongMinima_Contrasena==null && other.getIDLongMinima_Contrasena()==null) || 
             (this.IDLongMinima_Contrasena!=null &&
              this.IDLongMinima_Contrasena.equals(other.getIDLongMinima_Contrasena()))) &&
            ((this.IDVigencia_Contrasena==null && other.getIDVigencia_Contrasena()==null) || 
             (this.IDVigencia_Contrasena!=null &&
              this.IDVigencia_Contrasena.equals(other.getIDVigencia_Contrasena()))) &&
            ((this.IDDiferencia_ContrasenaUsuario==null && other.getIDDiferencia_ContrasenaUsuario()==null) || 
             (this.IDDiferencia_ContrasenaUsuario!=null &&
              this.IDDiferencia_ContrasenaUsuario.equals(other.getIDDiferencia_ContrasenaUsuario()))) &&
            ((this.IDNroMaximoIntentos==null && other.getIDNroMaximoIntentos()==null) || 
             (this.IDNroMaximoIntentos!=null &&
              this.IDNroMaximoIntentos.equals(other.getIDNroMaximoIntentos()))) &&
            ((this.IDDiasBloqueoUsuario==null && other.getIDDiasBloqueoUsuario()==null) || 
             (this.IDDiasBloqueoUsuario!=null &&
              this.IDDiasBloqueoUsuario.equals(other.getIDDiasBloqueoUsuario()))) &&
            ((this.IDComplejidadContrasena==null && other.getIDComplejidadContrasena()==null) || 
             (this.IDComplejidadContrasena!=null &&
              this.IDComplejidadContrasena.equals(other.getIDComplejidadContrasena()))) &&
            ((this.IDCantidadContrasenaHist==null && other.getIDCantidadContrasenaHist()==null) || 
             (this.IDCantidadContrasenaHist!=null &&
              this.IDCantidadContrasenaHist.equals(other.getIDCantidadContrasenaHist())));
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
        if (getIDLongMinima_Contrasena() != null) {
            _hashCode += getIDLongMinima_Contrasena().hashCode();
        }
        if (getIDVigencia_Contrasena() != null) {
            _hashCode += getIDVigencia_Contrasena().hashCode();
        }
        if (getIDDiferencia_ContrasenaUsuario() != null) {
            _hashCode += getIDDiferencia_ContrasenaUsuario().hashCode();
        }
        if (getIDNroMaximoIntentos() != null) {
            _hashCode += getIDNroMaximoIntentos().hashCode();
        }
        if (getIDDiasBloqueoUsuario() != null) {
            _hashCode += getIDDiasBloqueoUsuario().hashCode();
        }
        if (getIDComplejidadContrasena() != null) {
            _hashCode += getIDComplejidadContrasena().hashCode();
        }
        if (getIDCantidadContrasenaHist() != null) {
            _hashCode += getIDCantidadContrasenaHist().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Politica.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Politica"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDLongMinima_Contrasena");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IDLongMinima_Contrasena"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDVigencia_Contrasena");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IDVigencia_Contrasena"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDDiferencia_ContrasenaUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IDDiferencia_ContrasenaUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDNroMaximoIntentos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IDNroMaximoIntentos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDDiasBloqueoUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IDDiasBloqueoUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDComplejidadContraseña");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IDComplejidadContraseña"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDCantidadContrasenaHist");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IDCantidadContrasenaHist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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