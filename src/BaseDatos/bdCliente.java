package BaseDatos;

import Modelo.Cliente;
import Modelo.Producto;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class bdCliente {
    //Conexion
        private Conexion mysql=new Conexion();
        private Connection cn=mysql.conectar();
        private String sSQL="";
        private String sSQL2="";
        public Integer totalregistros;
        //Tabla 
        public DefaultTableModel mostrar(String Buscar){
            DefaultTableModel modelo;
            
            String [] titulos = {"ID", "Nombre","APaterno","AMaterno","Doc","n°Documento","Direccion","Telefono","Email","Codigo"};
            
            String [] registro = new String [10];
            
            totalregistros=0;
            modelo = new DefaultTableModel(null,titulos);
            sSQL = "select p.idPersona,p.nombre,p.aPaterno,p.aMaterno,p.tipo_documento,num_documento,"+
                    "p.direccion,p.telefono,p.email,c.codigo_cliente from persona p inner join cliente c "+
                    "on p.idpersona=c.idpersona where num_documento like '%"+
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
                    registro [9] = rs.getString("codigo_cliente");
       
                    totalregistros = totalregistros + 1;
                    modelo.addRow(registro);
                    
                }
                    return modelo;
                
            } catch (Exception e){
                    JOptionPane.showConfirmDialog(null, e);
                    return null;
                }
        }
        
        public boolean insertar (Cliente dts){
            sSQL="insert into persona (nombre,aPaterno,aMaterno,tipo_documento,num_documento,direccion,telefono,email)" + 
                    "values (?,?,?,?,?,?,?,?)";
            sSQL2="insert into cliente (idpersona,codigo_cliente)" + 
                    "values ((select idpersona from persona order by idpersona desc limit 1),?)"; 
            
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
                    
                    
                    pst2.setString(1, dts.getCodigo_cliente());
                    
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
        
        public boolean editar (Cliente dts){
            sSQL = "update persona set nombre=?,aPaterno=?,aMaterno=?,tipo_documento=?,num_documento=?,"
                    + " direccion=?,telefono=?,email=? where idpersona=?";
            sSQL2 = "update cliente set codigo_cliente=?"+
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
                    
                    pst2.setString(1, dts.getCodigo_cliente());
                    pst2.setInt(2, dts.getIdPersona());
                    
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
        public boolean eliminar (Cliente dts){
            sSQL="delete from cliente where idpersona=?";
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
}
