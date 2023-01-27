package br.com.projetoloja.model;

public class NivelUsuarios {
    
    private int idNivelUsuario;
    private String nivel;

    public NivelUsuarios(int idNivelUsuario, String nivel){
        this.setIdNivelUsuario(idNivelUsuario);
		this.setNivel(nivel);   
    }

    public String toString() {
		
		String outStr = 
				this.getIdNivelUsuario() + " | " +
				this.getNivel() + " | " ;
        return outStr;

    }


    public int getIdNivelUsuario() {
        return idNivelUsuario;
    }
    public void setIdNivelUsuario(int idNivelUsuario) {
        this.idNivelUsuario = idNivelUsuario;
    }
    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
