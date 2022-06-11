package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



@ManagedBean (name="Login")
public class Login {
    private String usuario;
    private String contrasenia;
    private final HttpServletRequest httpServletRequest;

    public Login() {
        httpServletRequest = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContrasenia() {
        return contrasenia;
    }
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    publid void iniciarSesion(){
        String contrasenia = getStringMessageDigest((String) this.contrasenia, SHA512);
        int contador = 0;
        int contadorEstado = 0;
        Date fechaActual;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        try {
            Connection cn = Postgres.Connection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("Select count(*) AS contador, U.id,U.fecha_activacion,"+"U.fecha_inactivacion,U.estado,P.id_perfil As perfil FROM usuario " +
                    "AS  U INNER JOIN perfil AS P"+ ON U.id_perfil = p.id_perfil = P.id_perfil WHERE U.login = '"+this.usuario+'" AND " +
                    "U.contrasenia='"+contrasenia+"' AND "+ U.estado ='A' GROUP BY U.id,U.fecha_activacion,U.fecha_inactivacion,U.estado,P.id_perfil);


        }catch (Exception e){

        }

    }
}
