package com.xiutech.simix.modelo;

public class ComentarioId  implements java.io.Serializable {
    
     private int idMarcador;
     private String correoComentarista;

    public ComentarioId() {
    }

    public ComentarioId(int idMarcador, String correoComentarista) {
       this.idMarcador = idMarcador;
       this.correoComentarista = correoComentarista;
    }
   
    public int getIdMarcador() {
        return this.idMarcador;
    }
    
    public void setIdMarcador(int idMarcador) {
        this.idMarcador = idMarcador;
    }
    public String getCorreoComentarista() {
        return this.correoComentarista;
    }
    
    public void setCorreoComentarista(String correoComentarista) {
        this.correoComentarista = correoComentarista;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ComentarioId) ) return false;
		 ComentarioId castOther = ( ComentarioId ) other; 
         
		 return (this.getIdMarcador()==castOther.getIdMarcador())
 && ( (this.getCorreoComentarista()==castOther.getCorreoComentarista()) || ( this.getCorreoComentarista()!=null && castOther.getCorreoComentarista()!=null && this.getCorreoComentarista().equals(castOther.getCorreoComentarista()) ) );
   }
   
   public int hashCode() {
         int result = 17; 
         result = 37 * result + this.getIdMarcador();
         result = 37 * result + ( getCorreoComentarista() == null ? 0 : this.getCorreoComentarista().hashCode() );
         return result;
   }   


}


