package BaseDatos;

import Modelo.Cliente;
import Modelo.Trabajador;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class bdTrabajador {
    //Conexion
        private Conexion mysql=new Conexion();
        private Connection cn=mysql.conectar();
        private String sSQL="";
        private String sSQL2="";
        public Integer totalregistros;
        //Tabla 
        public DefaultTableModel mostrar(String Buscar){
            DefaultTableModel modelo;
            
            String [] titulos = {"ID", "Nombre","APaterno","AMaterno","Doc","n°Documento","Direccion","Telefono","Email","Sueldo","Acceso","Login","Clave","Estado"};
            
            String [] registro = new String [14];
            
            totalregistros=0;
            modelo = new DefaultTableModel(null,titulos);
            sSQL = "select p.idPersona,p.nombre,p.aPaterno,p.aMaterno,p.tipo_documento,num_documento,"+
                    "p.direccion,p.telefono,p.email,t.sueldo,t.acceso,t.login,t.password,t.estado from persona p inner join Trabajador t "+
                    "on p.idpersona=t.idpersona where num_documento like '%"+
                    Buscar + "%' order by idpersona desc";
            
            try {
                Statement st = (Statement) cn.createStatement();
                ResultSet rs = st.executeQuery(sSQL);
                
                while(rs.next()){
                    registro [0] = rs.getString("idpersona");    
                    registro [1] = rs.getString("nombre");    
                    registro [2] = rs.getString("aPaterno");
                    registro [3] = rs.getString("aMaterno");
                    registro [4] = rs.getString("tipo_documento");
                    registro [5] = rs.getString("num_documento");
                    registro [6] = rs.getString("direccion");
                    registro [7] = rs.getString("telefono");
                    registro [8] = rs.getString("email");
                    registro [9] = rs.getString("sueldo");
                    registro [10] = rs.getString("acceso");
                    registro [11] = rs.getString("login");
                    registro [12] = rs.getString("password");
                    registro [13] = rs.getString("estado");
                    totalregistros = totalregistros + 1;
                    modelo.addRow(registro);
                    
                }
                    return modelo;
                
            } catch (Exception e){
                    JOptionPane.showConfirmDialog(null, e);
                    return null;
                }
        }
        
        public boolean insertar (Trabajador dts){
            sSQL="insert into persona (nombre,aPaterno,aMaterno,tipo_documento,num_documento,direccion,telefono,email)" + 
                    "values (?,?,?,?,?,?,?,?)";
            sSQL2="insert into trabajador (idpersona,sueldo,acceso,login,password,estado)" + 
                    "values ((select idpersona from persona order by idpersona desc limit 1),?,?,?,?,?)"; 
            
            try{ 
                    PreparedStatement pst=(PreparedStatement) cn.prepareStatement (sSQL);
                    PreparedStatement pst2=(PreparedStatement) cn.prepareStatement (sSQL2);
                    
                    pst.setString(1, dts.getNombre());
                    pst.setString(2, dts.getaPaterno());
                    pst.setString(3, dts.getaMaterno());
                    pst.setString(4, dts.getTipo_documento());
                    pst.setString(5, dts.getNum_documento());
                    pst.setString(6, dts.getDireccion());
                    pst.setString(7, dts.getTelefono());
                    pst.setString(8, dts.getEmail());
                    
                    
                    pst2.setDouble(1, dts.getSueldo());
                    pst2.setString(2, dts.getAcceso());
                    pst2.setString(3, dts.getLogin());
                    pst2.setString(4, dts.getPassword());
                    pst2.setString(5, dts.getEstado());
                    
                    int n = pst.executeUpdate();
                    
                    if (n!=0){ 
                        
                        int n2 = pst2.executeUpdate();
                        
                        if (n2!=0) {
                            return true;
                        }else {return false;}
                        
                             }
                    else{
                        return false;
                        }
                    
                    
            } catch(Exception e){
                JOptionPane.showConfirmDialog(null, e);
                return false;
            }
        }
        
        public boolean editar (Trabajador dts){
            sSQL = "update persona set nombre=?,aPaterno=?,aMaterno=?,tipo_documento=?,num_documento=?,"
                    + " direccion=?,telefono=?,email=? where idpersona=?";
            sSQL2 = "update trabajador set sueldo=?,acceso=?,login=?,password=?,estado=?"+
                        " where idpersona=?";
            
            
             try{ 
                    PreparedStatement pst=(PreparedStatement) cn.prepareStatement (sSQL);
                    PreparedStatement pst2=(PreparedStatement) cn.prepareStatement (sSQL2);
                    
                    pst.setString(1, dts.getNombre());
                    pst.setString(2, dts.getaPaterno());
                    pst.setString(3, dts.getaMaterno());
                    pst.setString(4, dts.getTipo_documento());
                    pst.setString(5, dts.getNum_documento());
                    pst.setString(6, dts.getDireccion());
                    pst.setString(7, dts.getTelefono());
                    pst.setString(8, dts.getEmail());
                    pst.setInt(9, dts.getIdPersona());
                    
                    pst2.setDouble(1, dts.getSueldo());
                    pst2.setString(2, dts.getAcceso());
                    pst2.setString(3, dts.getLogin());
                    pst2.setString(4, dts.getPassword());
                    pst2.setString(5, dts.getEstado());
                    pst2.setInt(6, dts.getIdPersona());
                    
                    int n = pst.executeUpdate();
                    
                    if (n!=0){ 
                        
                        int n2 = pst2.executeUpdate();
                        
                        if (n2!=0) {
                            return true;
                        }else {return false;}
                        
                             }
                    else{
                        return false;
                        }
                    
                    
            } catch(Exception e){
                JOptionPane.showConfirmDialog(null, e);
                return false;
            }
        
        }
        public boolean eliminar (Trabajador dts){
            sSQL="delete from trabajador where idpersona=?";
            sSQL2="delete from persona where idpersona=?";
            
            try{
                PreparedStatement pst=(PreparedStatement) cn.prepareStatement (sSQL);
                PreparedStatement pst2=(PreparedStatement) cn.prepareStatement (sSQL2);
                
                    pst.setInt(1, dts.getIdPersona());
                    
                   
                    pst2.setInt(1, dts.getIdPersona());
                    
                    int n = pst.executeUpdate();
                    
                    if (n!=0){ 
                        int n2 = pst2.executeUpdate();
                        
                        if (n2 != 0 ) {
                            return true;
                        }else{return false;}
                             }
                    else{
                        return false;
                        }
                
            } catch(Exception e){
                JOptionPane.showConfirmDialog(null, e);
                return false;
            }
        }
            public DefaultTableModel login(String login,String password){
            DefaultTableModel modelo;
            
            String [] titulos = {"ID", "Nombre","APaterno","AMaterno","Acceso","Login","Clave","Estado"};
            
            String [] registro = new String [8];
            
            totalregistros=0;
            modelo = new DefaultTableModel(null,titulos);
            sSQL = "select p.idPersona,p.nombre,p.aPaterno,p.aMaterno,"
                    + "t.acceso,t.login,t.password,t.estado from persona p inner join Trabajador t "
                    + "on p.idpersona=t.idpersona where t.login='"
                    + login + "' and t.password='" + password + "' and t.estado ='A'";
            
            try {
                Statement st = (Statement) cn.createStatement();
                ResultSet rs = st.executeQuery(sSQL);
                
                while(rs.next()){
                    registro [0] = rs.getString("idpersona");    
                    registro [1] = rs.getString("nombre");    
                    registro [2] = rs.getString("aPaterno");
                    registro [3] = rs.getString("aMaterno");
                    registro [4] = rs.getString("acceso");
                    registro [5] = rs.getString("login");
                    registro [6] = rs.getString("password");
                    registro [7] = rs.getString("estado");
                    totalregistros = totalregistros + 1;
                    modelo.addRow(registro);
                    
                }
                    return modelo;
                
            } catch (Exception e){
                    JOptionPane.showConfirmDialog(null, e);
                    return null;
                }
        }
            
        }
        
        
        

