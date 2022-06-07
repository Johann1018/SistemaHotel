package BaseDatos;

//importaciones
import Modelo.Pago;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class bdPago {
        //Conexion
        private Conexion mysql=new Conexion();
        private Connection cn=mysql.conectar();
        private String sSQL="";
        public Integer totalregistros;
        //Tabla 
        public DefaultTableModel mostrar(String Buscar){
            DefaultTableModel modelo;
            
            String [] titulos = {"ID", "Idreserva","Comprobante","Numero","Igv","Total","Fecha Emision","Fecha Pago"};
            
            String [] registro = new String [8];
            
            totalregistros=0;
            modelo = new DefaultTableModel(null,titulos);
            sSQL = "select * from pago where idreserva ="+ Buscar + " order by idpago desc";
            
            try {
                Statement st = (Statement) cn.createStatement();
                ResultSet rs = st.executeQuery(sSQL);
                
                while(rs.next()){
                    registro [0] = rs.getString("idpago");
                    registro [1] = rs.getString("idreserva");
                    registro [2] = rs.getString("tipo_comprobante");
                    registro [3] = rs.getString("num_comprobante");
                    registro [4] = rs.getString("igv");
                    registro [5] = rs.getString("total_pago");
                    registro [6] = rs.getString("fecha_emision");
                    registro [7] = rs.getString("fecha_pago");    
       
                    totalregistros = totalregistros + 1;
                    modelo.addRow(registro);
                    
                }
                    return modelo;
                
            } catch (Exception e){
                    JOptionPane.showConfirmDialog(null, e);
                    return null;
                }
        }
        
        public boolean insertar (Pago dts){
            sSQL="insert into pago (idreserva,tipo_comprobante,num_comprobante,igv,total_pago,fecha_emision,fecha_pago)" + 
                    "values (?,?,?,?,?,?,?)";
            
            try{
            
                    PreparedStatement pst=(PreparedStatement) cn.prepareStatement (sSQL);
                    pst.setInt(1, dts.getIdreserva());
                    pst.setString(2, dts.getTipo_comprobante());
                    pst.setString(3, dts.getNum_comprobante());
                    pst.setDouble(4, dts.getIgv());
                    pst.setDouble(5, dts.getTotal_pago());
                    pst.setDate(6, dts.getFecha_emision());
                    pst.setDate(7, dts.getFecha_pago());
                    
                    int n = pst.executeUpdate();
                    
                    if (n!=0){ 
                        return true;
                             }
                    else{
                        return false;
                        }
                    
                    
            } catch(Exception e){
                JOptionPane.showConfirmDialog(null, e);
                return false;
            }
        }
        
        public boolean editar (Pago dts){
            sSQL = "update pago set idreserva=?,tipo_comprobante=?,num_comprobante=?,igv=?,total_pago=?,fecha_emision=?,fecha_pago=?"+
                        " where idpago=?";
            
            
            try{
                PreparedStatement pst=(PreparedStatement) cn.prepareStatement (sSQL);
                    pst.setInt(1, dts.getIdreserva());
                    pst.setString(2, dts.getTipo_comprobante());
                    pst.setString(3, dts.getNum_comprobante());
                    pst.setDouble(4, dts.getIgv());
                    pst.setDouble(5, dts.getTotal_pago());
                    pst.setDate(6, dts.getFecha_emision());
                    pst.setDate(7, dts.getFecha_pago());
                    
                    pst.setInt(8, dts.getIdpago());
                    
                    int n = pst.executeUpdate();
                    
                    if (n!=0){ 
                        return true;
                             }
                    else{
                        return false;
                        }
                
            } catch(Exception e){
                JOptionPane.showConfirmDialog(null, e);
                return false;
            }
            
        }
        
        public boolean eliminar (Pago dts){
            sSQL="delete from pago where idpago=?";
            
            try{
                PreparedStatement pst=(PreparedStatement) cn.prepareStatement (sSQL);
                
                    pst.setInt(1, dts.getIdpago());
                    
                    int n = pst.executeUpdate();
                    
                    if (n!=0){ 
                        return true;
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
