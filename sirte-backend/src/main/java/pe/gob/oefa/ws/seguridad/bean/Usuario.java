/**
 * Usuario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.ws.seguridad.bean;

public class Usuario  implements java.io.Serializable {
    private java.lang.Integer idUsuario;

    private java.lang.String codigoEmp;

    private java.lang.String emailCoorporativo;

    private java.lang.String nombreApellido;

    private pe.gob.oefa.ws.seguridad.bean.Estado estado;

    private java.lang.String userName;

    private pe.gob.oefa.ws.seguridad.bean.UsuarioTipo usuarioTipo;

    private pe.gob.oefa.ws.seguridad.bean.Rol[] listaRol;

    private java.lang.String contentStyle;

    private java.lang.String sexo;

    private java.lang.String correo;

    private java.lang.String correoBoleta;

    private java.lang.String direccion;

    private java.util.Calendar fechaNacimiento;

    private pe.gob.oefa.ws.seguridad.bean.Empresa empresa;

    private java.lang.String DNI;

    private java.lang.Integer idSociedad;

    private java.lang.String sociedadDescripcionCorta;

    private java.lang.Integer idAreaBU;

    private java.lang.String areaBUDescripcionCorta;

    private java.lang.Integer idCargo;

    private java.lang.String cargoDescripcionCorta;

    private java.lang.Integer idComite;

    private java.lang.Integer activo;

    private java.lang.String siglaUnidadOrganica;

    private java.lang.String siglaArea;

    private java.lang.String siglaCargo;

    private java.lang.String unidadOrganicaDescripcionCorta;

    private java.lang.Integer idAplicacion;

    private java.lang.String contrasena;

    public Usuario() {
    }

    public Usuario(
           java.lang.Integer idUsuario,
           java.lang.String codigoEmp,
           java.lang.String emailCoorporativo,
           java.lang.String nombreApellido,
           pe.gob.oefa.ws.seguridad.bean.Estado estado,
           java.lang.String userName,
           pe.gob.oefa.ws.seguridad.bean.UsuarioTipo usuarioTipo,
           pe.gob.oefa.ws.seguridad.bean.Rol[] listaRol,
           java.lang.String contentStyle,
           java.lang.String sexo,
           java.lang.String correo,
           java.lang.String correoBoleta,
           java.lang.String direccion,
           java.util.Calendar fechaNacimiento,
           pe.gob.oefa.ws.seguridad.bean.Empresa empresa,
           java.lang.String DNI,
           java.lang.Integer idSociedad,
           java.lang.String sociedadDescripcionCorta,
           java.lang.Integer idAreaBU,
           java.lang.String areaBUDescripcionCorta,
           java.lang.Integer idCargo,
           java.lang.String cargoDescripcionCorta,
           java.lang.Integer idComite,
           java.lang.Integer activo,
           java.lang.String siglaUnidadOrganica,
           java.lang.String siglaArea,
           java.lang.String siglaCargo,
           java.lang.String unidadOrganicaDescripcionCorta,
           java.lang.Integer idAplicacion,
           java.lang.String contrasena) {
           this.idUsuario = idUsuario;
           this.codigoEmp = codigoEmp;
           this.emailCoorporativo = emailCoorporativo;
           this.nombreApellido = nombreApellido;
           this.estado = estado;
           this.userName = userName;
           this.usuarioTipo = usuarioTipo;
           this.listaRol = listaRol;
           this.contentStyle = contentStyle;
           this.sexo = sexo;
           this.correo = correo;
           this.correoBoleta = correoBoleta;
           this.direccion = direccion;
           this.fechaNacimiento = fechaNacimiento;
           this.empresa = empresa;
           this.DNI = DNI;
           this.idSociedad = idSociedad;
           this.sociedadDescripcionCorta = sociedadDescripcionCorta;
           this.idAreaBU = idAreaBU;
           this.areaBUDescripcionCorta = areaBUDescripcionCorta;
           this.idCargo = idCargo;
           this.cargoDescripcionCorta = cargoDescripcionCorta;
           this.idComite = idComite;
           this.activo = activo;
           this.siglaUnidadOrganica = siglaUnidadOrganica;
           this.siglaArea = siglaArea;
           this.siglaCargo = siglaCargo;
           this.unidadOrganicaDescripcionCorta = unidadOrganicaDescripcionCorta;
           this.idAplicacion = idAplicacion;
           this.contrasena = contrasena;
    }


    /**
     * Gets the idUsuario value for this Usuario.
     * 
     * @return idUsuario
     */
    public java.lang.Integer getIdUsuario() {
        return idUsuario;
    }


    /**
     * Sets the idUsuario value for this Usuario.
     * 
     * @param idUsuario
     */
    public void setIdUsuario(java.lang.Integer idUsuario) {
        this.idUsuario = idUsuario;
    }


    /**
     * Gets the codigoEmp value for this Usuario.
     * 
     * @return codigoEmp
     */
    public java.lang.String getCodigoEmp() {
        return codigoEmp;
    }


    /**
     * Sets the codigoEmp value for this Usuario.
     * 
     * @param codigoEmp
     */
    public void setCodigoEmp(java.lang.String codigoEmp) {
        this.codigoEmp = codigoEmp;
    }


    /**
     * Gets the emailCoorporativo value for this Usuario.
     * 
     * @return emailCoorporativo
     */
    public java.lang.String getEmailCoorporativo() {
        return emailCoorporativo;
    }


    /**
     * Sets the emailCoorporativo value for this Usuario.
     * 
     * @param emailCoorporativo
     */
    public void setEmailCoorporativo(java.lang.String emailCoorporativo) {
        this.emailCoorporativo = emailCoorporativo;
    }


    /**
     * Gets the nombreApellido value for this Usuario.
     * 
     * @return nombreApellido
     */
    public java.lang.String getNombreApellido() {
        return nombreApellido;
    }


    /**
     * Sets the nombreApellido value for this Usuario.
     * 
     * @param nombreApellido
     */
    public void setNombreApellido(java.lang.String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }


    /**
     * Gets the estado value for this Usuario.
     * 
     * @return estado
     */
    public pe.gob.oefa.ws.seguridad.bean.Estado getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this Usuario.
     * 
     * @param estado
     */
    public void setEstado(pe.gob.oefa.ws.seguridad.bean.Estado estado) {
        this.estado = estado;
    }


    /**
     * Gets the userName value for this Usuario.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this Usuario.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the usuarioTipo value for this Usuario.
     * 
     * @return usuarioTipo
     */
    public pe.gob.oefa.ws.seguridad.bean.UsuarioTipo getUsuarioTipo() {
        return usuarioTipo;
    }


    /**
     * Sets the usuarioTipo value for this Usuario.
     * 
     * @param usuarioTipo
     */
    public void setUsuarioTipo(pe.gob.oefa.ws.seguridad.bean.UsuarioTipo usuarioTipo) {
        this.usuarioTipo = usuarioTipo;
    }


    /**
     * Gets the listaRol value for this Usuario.
     * 
     * @return listaRol
     */
    public pe.gob.oefa.ws.seguridad.bean.Rol[] getListaRol() {
        return listaRol;
    }


    /**
     * Sets the listaRol value for this Usuario.
     * 
     * @param listaRol
     */
    public void setListaRol(pe.gob.oefa.ws.seguridad.bean.Rol[] listaRol) {
        this.listaRol = listaRol;
    }


    /**
     * Gets the contentStyle value for this Usuario.
     * 
     * @return contentStyle
     */
    public java.lang.String getContentStyle() {
        return contentStyle;
    }


    /**
     * Sets the contentStyle value for this Usuario.
     * 
     * @param contentStyle
     */
    public void setContentStyle(java.lang.String contentStyle) {
        this.contentStyle = contentStyle;
    }


    /**
     * Gets the sexo value for this Usuario.
     * 
     * @return sexo
     */
    public java.lang.String getSexo() {
        return sexo;
    }


    /**
     * Sets the sexo value for this Usuario.
     * 
     * @param sexo
     */
    public void setSexo(java.lang.String sexo) {
        this.sexo = sexo;
    }


    /**
     * Gets the correo value for this Usuario.
     * 
     * @return correo
     */
    public java.lang.String getCorreo() {
        return correo;
    }


    /**
     * Sets the correo value for this Usuario.
     * 
     * @param correo
     */
    public void setCorreo(java.lang.String correo) {
        this.correo = correo;
    }


    /**
     * Gets the correoBoleta value for this Usuario.
     * 
     * @return correoBoleta
     */
    public java.lang.String getCorreoBoleta() {
        return correoBoleta;
    }


    /**
     * Sets the correoBoleta value for this Usuario.
     * 
     * @param correoBoleta
     */
    public void setCorreoBoleta(java.lang.String correoBoleta) {
        this.correoBoleta = correoBoleta;
    }


    /**
     * Gets the direccion value for this Usuario.
     * 
     * @return direccion
     */
    public java.lang.String getDireccion() {
        return direccion;
    }


    /**
     * Sets the direccion value for this Usuario.
     * 
     * @param direccion
     */
    public void setDireccion(java.lang.String direccion) {
        this.direccion = direccion;
    }


    /**
     * Gets the fechaNacimiento value for this Usuario.
     * 
     * @return fechaNacimiento
     */
    public java.util.Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }


    /**
     * Sets the fechaNacimiento value for this Usuario.
     * 
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(java.util.Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Gets the empresa value for this Usuario.
     * 
     * @return empresa
     */
    public pe.gob.oefa.ws.seguridad.bean.Empresa getEmpresa() {
        return empresa;
    }


    /**
     * Sets the empresa value for this Usuario.
     * 
     * @param empresa
     */
    public void setEmpresa(pe.gob.oefa.ws.seguridad.bean.Empresa empresa) {
        this.empresa = empresa;
    }


    /**
     * Gets the DNI value for this Usuario.
     * 
     * @return DNI
     */
    public java.lang.String getDNI() {
        return DNI;
    }


    /**
     * Sets the DNI value for this Usuario.
     * 
     * @param DNI
     */
    public void setDNI(java.lang.String DNI) {
        this.DNI = DNI;
    }


    /**
     * Gets the idSociedad value for this Usuario.
     * 
     * @return idSociedad
     */
    public java.lang.Integer getIdSociedad() {
        return idSociedad;
    }


    /**
     * Sets the idSociedad value for this Usuario.
     * 
     * @param idSociedad
     */
    public void setIdSociedad(java.lang.Integer idSociedad) {
        this.idSociedad = idSociedad;
    }


    /**
     * Gets the sociedadDescripcionCorta value for this Usuario.
     * 
     * @return sociedadDescripcionCorta
     */
    public java.lang.String getSociedadDescripcionCorta() {
        return sociedadDescripcionCorta;
    }


    /**
     * Sets the sociedadDescripcionCorta value for this Usuario.
     * 
     * @param sociedadDescripcionCorta
     */
    public void setSociedadDescripcionCorta(java.lang.String sociedadDescripcionCorta) {
        this.sociedadDescripcionCorta = sociedadDescripcionCorta;
    }


    /**
     * Gets the idAreaBU value for this Usuario.
     * 
     * @return idAreaBU
     */
    public java.lang.Integer getIdAreaBU() {
        return idAreaBU;
    }


    /**
     * Sets the idAreaBU value for this Usuario.
     * 
     * @param idAreaBU
     */
    public void setIdAreaBU(java.lang.Integer idAreaBU) {
        this.idAreaBU = idAreaBU;
    }


    /**
     * Gets the areaBUDescripcionCorta value for this Usuario.
     * 
     * @return areaBUDescripcionCorta
     */
    public java.lang.String getAreaBUDescripcionCorta() {
        return areaBUDescripcionCorta;
    }


    /**
     * Sets the areaBUDescripcionCorta value for this Usuario.
     * 
     * @param areaBUDescripcionCorta
     */
    public void setAreaBUDescripcionCorta(java.lang.String areaBUDescripcionCorta) {
        this.areaBUDescripcionCorta = areaBUDescripcionCorta;
    }


    /**
     * Gets the idCargo value for this Usuario.
     * 
     * @return idCargo
     */
    public java.lang.Integer getIdCargo() {
        return idCargo;
    }


    /**
     * Sets the idCargo value for this Usuario.
     * 
     * @param idCargo
     */
    public void setIdCargo(java.lang.Integer idCargo) {
        this.idCargo = idCargo;
    }


    /**
     * Gets the cargoDescripcionCorta value for this Usuario.
     * 
     * @return cargoDescripcionCorta
     */
    public java.lang.String getCargoDescripcionCorta() {
        return cargoDescripcionCorta;
    }


    /**
     * Sets the cargoDescripcionCorta value for this Usuario.
     * 
     * @param cargoDescripcionCorta
     */
    public void setCargoDescripcionCorta(java.lang.String cargoDescripcionCorta) {
        this.cargoDescripcionCorta = cargoDescripcionCorta;
    }


    /**
     * Gets the idComite value for this Usuario.
     * 
     * @return idComite
     */
    public java.lang.Integer getIdComite() {
        return idComite;
    }


    /**
     * Sets the idComite value for this Usuario.
     * 
     * @param idComite
     */
    public void setIdComite(java.lang.Integer idComite) {
        this.idComite = idComite;
    }


    /**
     * Gets the activo value for this Usuario.
     * 
     * @return activo
     */
    public java.lang.Integer getActivo() {
        return activo;
    }


    /**
     * Sets the activo value for this Usuario.
     * 
     * @param activo
     */
    public void setActivo(java.lang.Integer activo) {
        this.activo = activo;
    }


    /**
     * Gets the siglaUnidadOrganica value for this Usuario.
     * 
     * @return siglaUnidadOrganica
     */
    public java.lang.String getSiglaUnidadOrganica() {
        return siglaUnidadOrganica;
    }


    /**
     * Sets the siglaUnidadOrganica value for this Usuario.
     * 
     * @param siglaUnidadOrganica
     */
    public void setSiglaUnidadOrganica(java.lang.String siglaUnidadOrganica) {
        this.siglaUnidadOrganica = siglaUnidadOrganica;
    }


    /**
     * Gets the siglaArea value for this Usuario.
     * 
     * @return siglaArea
     */
    public java.lang.String getSiglaArea() {
        return siglaArea;
    }


    /**
     * Sets the siglaArea value for this Usuario.
     * 
     * @param siglaArea
     */
    public void setSiglaArea(java.lang.String siglaArea) {
        this.siglaArea = siglaArea;
    }


    /**
     * Gets the siglaCargo value for this Usuario.
     * 
     * @return siglaCargo
     */
    public java.lang.String getSiglaCargo() {
        return siglaCargo;
    }


    /**
     * Sets the siglaCargo value for this Usuario.
     * 
     * @param siglaCargo
     */
    public void setSiglaCargo(java.lang.String siglaCargo) {
        this.siglaCargo = siglaCargo;
    }


    /**
     * Gets the unidadOrganicaDescripcionCorta value for this Usuario.
     * 
     * @return unidadOrganicaDescripcionCorta
     */
    public java.lang.String getUnidadOrganicaDescripcionCorta() {
        return unidadOrganicaDescripcionCorta;
    }


    /**
     * Sets the unidadOrganicaDescripcionCorta value for this Usuario.
     * 
     * @param unidadOrganicaDescripcionCorta
     */
    public void setUnidadOrganicaDescripcionCorta(java.lang.String unidadOrganicaDescripcionCorta) {
        this.unidadOrganicaDescripcionCorta = unidadOrganicaDescripcionCorta;
    }


    /**
     * Gets the idAplicacion value for this Usuario.
     * 
     * @return idAplicacion
     */
    public java.lang.Integer getIdAplicacion() {
        return idAplicacion;
    }


    /**
     * Sets the idAplicacion value for this Usuario.
     * 
     * @param idAplicacion
     */
    public void setIdAplicacion(java.lang.Integer idAplicacion) {
        this.idAplicacion = idAplicacion;
    }


    /**
     * Gets the contrasena value for this Usuario.
     * 
     * @return contrasena
     */
    public java.lang.String getContrasena() {
        return contrasena;
    }


    /**
     * Sets the contrasena value for this Usuario.
     * 
     * @param contrasena
     */
    public void setContrasena(java.lang.String contrasena) {
        this.contrasena = contrasena;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Usuario)) return false;
        Usuario other = (Usuario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idUsuario==null && other.getIdUsuario()==null) || 
             (this.idUsuario!=null &&
              this.idUsuario.equals(other.getIdUsuario()))) &&
            ((this.codigoEmp==null && other.getCodigoEmp()==null) || 
             (this.codigoEmp!=null &&
              this.codigoEmp.equals(other.getCodigoEmp()))) &&
            ((this.emailCoorporativo==null && other.getEmailCoorporativo()==null) || 
             (this.emailCoorporativo!=null &&
              this.emailCoorporativo.equals(other.getEmailCoorporativo()))) &&
            ((this.nombreApellido==null && other.getNombreApellido()==null) || 
             (this.nombreApellido!=null &&
              this.nombreApellido.equals(other.getNombreApellido()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.usuarioTipo==null && other.getUsuarioTipo()==null) || 
             (this.usuarioTipo!=null &&
              this.usuarioTipo.equals(other.getUsuarioTipo()))) &&
            ((this.listaRol==null && other.getListaRol()==null) || 
             (this.listaRol!=null &&
              java.util.Arrays.equals(this.listaRol, other.getListaRol()))) &&
            ((this.contentStyle==null && other.getContentStyle()==null) || 
             (this.contentStyle!=null &&
              this.contentStyle.equals(other.getContentStyle()))) &&
            ((this.sexo==null && other.getSexo()==null) || 
             (this.sexo!=null &&
              this.sexo.equals(other.getSexo()))) &&
            ((this.correo==null && other.getCorreo()==null) || 
             (this.correo!=null &&
              this.correo.equals(other.getCorreo()))) &&
            ((this.correoBoleta==null && other.getCorreoBoleta()==null) || 
             (this.correoBoleta!=null &&
              this.correoBoleta.equals(other.getCorreoBoleta()))) &&
            ((this.direccion==null && other.getDireccion()==null) || 
             (this.direccion!=null &&
              this.direccion.equals(other.getDireccion()))) &&
            ((this.fechaNacimiento==null && other.getFechaNacimiento()==null) || 
             (this.fechaNacimiento!=null &&
              this.fechaNacimiento.equals(other.getFechaNacimiento()))) &&
            ((this.empresa==null && other.getEmpresa()==null) || 
             (this.empresa!=null &&
              this.empresa.equals(other.getEmpresa()))) &&
            ((this.DNI==null && other.getDNI()==null) || 
             (this.DNI!=null &&
              this.DNI.equals(other.getDNI()))) &&
            ((this.idSociedad==null && other.getIdSociedad()==null) || 
             (this.idSociedad!=null &&
              this.idSociedad.equals(other.getIdSociedad()))) &&
            ((this.sociedadDescripcionCorta==null && other.getSociedadDescripcionCorta()==null) || 
             (this.sociedadDescripcionCorta!=null &&
              this.sociedadDescripcionCorta.equals(other.getSociedadDescripcionCorta()))) &&
            ((this.idAreaBU==null && other.getIdAreaBU()==null) || 
             (this.idAreaBU!=null &&
              this.idAreaBU.equals(other.getIdAreaBU()))) &&
            ((this.areaBUDescripcionCorta==null && other.getAreaBUDescripcionCorta()==null) || 
             (this.areaBUDescripcionCorta!=null &&
              this.areaBUDescripcionCorta.equals(other.getAreaBUDescripcionCorta()))) &&
            ((this.idCargo==null && other.getIdCargo()==null) || 
             (this.idCargo!=null &&
              this.idCargo.equals(other.getIdCargo()))) &&
            ((this.cargoDescripcionCorta==null && other.getCargoDescripcionCorta()==null) || 
             (this.cargoDescripcionCorta!=null &&
              this.cargoDescripcionCorta.equals(other.getCargoDescripcionCorta()))) &&
            ((this.idComite==null && other.getIdComite()==null) || 
             (this.idComite!=null &&
              this.idComite.equals(other.getIdComite()))) &&
            ((this.activo==null && other.getActivo()==null) || 
             (this.activo!=null &&
              this.activo.equals(other.getActivo()))) &&
            ((this.siglaUnidadOrganica==null && other.getSiglaUnidadOrganica()==null) || 
             (this.siglaUnidadOrganica!=null &&
              this.siglaUnidadOrganica.equals(other.getSiglaUnidadOrganica()))) &&
            ((this.siglaArea==null && other.getSiglaArea()==null) || 
             (this.siglaArea!=null &&
              this.siglaArea.equals(other.getSiglaArea()))) &&
            ((this.siglaCargo==null && other.getSiglaCargo()==null) || 
             (this.siglaCargo!=null &&
              this.siglaCargo.equals(other.getSiglaCargo()))) &&
            ((this.unidadOrganicaDescripcionCorta==null && other.getUnidadOrganicaDescripcionCorta()==null) || 
             (this.unidadOrganicaDescripcionCorta!=null &&
              this.unidadOrganicaDescripcionCorta.equals(other.getUnidadOrganicaDescripcionCorta()))) &&
            ((this.idAplicacion==null && other.getIdAplicacion()==null) || 
             (this.idAplicacion!=null &&
              this.idAplicacion.equals(other.getIdAplicacion()))) &&
            ((this.contrasena==null && other.getContrasena()==null) || 
             (this.contrasena!=null &&
              this.contrasena.equals(other.getContrasena())));
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
        if (getIdUsuario() != null) {
            _hashCode += getIdUsuario().hashCode();
        }
        if (getCodigoEmp() != null) {
            _hashCode += getCodigoEmp().hashCode();
        }
        if (getEmailCoorporativo() != null) {
            _hashCode += getEmailCoorporativo().hashCode();
        }
        if (getNombreApellido() != null) {
            _hashCode += getNombreApellido().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getUsuarioTipo() != null) {
            _hashCode += getUsuarioTipo().hashCode();
        }
        if (getListaRol() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaRol());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaRol(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContentStyle() != null) {
            _hashCode += getContentStyle().hashCode();
        }
        if (getSexo() != null) {
            _hashCode += getSexo().hashCode();
        }
        if (getCorreo() != null) {
            _hashCode += getCorreo().hashCode();
        }
        if (getCorreoBoleta() != null) {
            _hashCode += getCorreoBoleta().hashCode();
        }
        if (getDireccion() != null) {
            _hashCode += getDireccion().hashCode();
        }
        if (getFechaNacimiento() != null) {
            _hashCode += getFechaNacimiento().hashCode();
        }
        if (getEmpresa() != null) {
            _hashCode += getEmpresa().hashCode();
        }
        if (getDNI() != null) {
            _hashCode += getDNI().hashCode();
        }
        if (getIdSociedad() != null) {
            _hashCode += getIdSociedad().hashCode();
        }
        if (getSociedadDescripcionCorta() != null) {
            _hashCode += getSociedadDescripcionCorta().hashCode();
        }
        if (getIdAreaBU() != null) {
            _hashCode += getIdAreaBU().hashCode();
        }
        if (getAreaBUDescripcionCorta() != null) {
            _hashCode += getAreaBUDescripcionCorta().hashCode();
        }
        if (getIdCargo() != null) {
            _hashCode += getIdCargo().hashCode();
        }
        if (getCargoDescripcionCorta() != null) {
            _hashCode += getCargoDescripcionCorta().hashCode();
        }
        if (getIdComite() != null) {
            _hashCode += getIdComite().hashCode();
        }
        if (getActivo() != null) {
            _hashCode += getActivo().hashCode();
        }
        if (getSiglaUnidadOrganica() != null) {
            _hashCode += getSiglaUnidadOrganica().hashCode();
        }
        if (getSiglaArea() != null) {
            _hashCode += getSiglaArea().hashCode();
        }
        if (getSiglaCargo() != null) {
            _hashCode += getSiglaCargo().hashCode();
        }
        if (getUnidadOrganicaDescripcionCorta() != null) {
            _hashCode += getUnidadOrganicaDescripcionCorta().hashCode();
        }
        if (getIdAplicacion() != null) {
            _hashCode += getIdAplicacion().hashCode();
        }
        if (getContrasena() != null) {
            _hashCode += getContrasena().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Usuario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Usuario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEmp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "CodigoEmp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailCoorporativo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "EmailCoorporativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreApellido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "NombreApellido"));
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
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "UsuarioTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "UsuarioTipo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaRol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "ListaRol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Rol"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Rol"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "ContentStyle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sexo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Sexo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Correo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correoBoleta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "CorreoBoleta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Direccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "FechaNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empresa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Empresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Empresa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DNI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "DNI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSociedad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdSociedad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sociedadDescripcionCorta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "SociedadDescripcionCorta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idAreaBU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdAreaBU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areaBUDescripcionCorta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "AreaBUDescripcionCorta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCargo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdCargo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargoDescripcionCorta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "CargoDescripcionCorta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idComite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdComite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Activo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaUnidadOrganica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "SiglaUnidadOrganica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "SiglaArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaCargo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "SiglaCargo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadOrganicaDescripcionCorta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "UnidadOrganicaDescripcionCorta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idAplicacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "IdAplicacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contrasena");
        elemField.setXmlName(new javax.xml.namespace.QName("http://komatsu.core.seguridad.model/2013/dckomatsuseguridad", "Contrasena"));
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
