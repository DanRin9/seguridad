package co.edu.uniandes.labociencia.seguridad;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IncidentesBasicModel {

  private Long id;
  private String fecha;
  private String hora;
  private String laboratorio;
  private String tipo;
  private String descripcion;
  private boolean heridos;
  private String estado;
  private String prioridad;
    
}
