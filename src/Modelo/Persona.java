package Modelo;

public class Persona {
    public  int idPersona;
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String tipo_documento;
    private String num_documento;
    private String direccion;
    private String telefono;
    private String email;
    
    //constructor
    public Persona(int idPersona, String nombre, String aPaterno, String aMaterno, String tipo_documento, String num_documento, String direccion, String telefono, String email) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.tipo_documento = tipo_documento;
        this.num_documento = num_documento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
    public Persona() {}
    //getter and setter
    public int getIdPersona() {return idPersona;}

    public void setIdPersona(int idPersona) {this.idPersona = idPersona;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getaPaterno() {return aPaterno;}

    public void setaPaterno(String aPaterno) {this.aPaterno = aPaterno;}

    public String getaMaterno() {return aMaterno;}

    public void setaMaterno(String aMaterno) {this.aMaterno = aMaterno;}

    public String getTipo_documento() {return tipo_documento;}

    public void setTipo_documento(String tipo_documento) {this.tipo_documento = tipo_documento;}

    public String getNum_documento() {return num_documento;}

    public void setNum_documento(String num_documento) {this.num_documento = num_documento;}

    public String getDireccion() {return direccion;}

    public void setDireccion(String direccion) {this.direccion = direccion;}

    public String getTelefono() {return telefono;}

    public void setTelefono(String telefono) {this.telefono = telefono;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}
}
