
package Modelo;


public class Cuenta {
    String user;
    String usuario;
    String password;
    
    
    public Cuenta() {   
    }
    public Cuenta(String user, String usuario, String password) {
        this.user = user;
        this.usuario = usuario;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
