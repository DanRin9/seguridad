package co.edu.uniandes.labociencia.seguridad;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProtocoloBasicModel {

  private Long id;
  private String nombre;
  private String imagen;
  private String nivelRiesgo;
  private String descripcion;
  private String eppRequeridos;
    
}