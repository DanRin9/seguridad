package co.edu.uniandes.labociencia.seguridad;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IncidentesDTO extends IncidentesBasicModel{

  private List<AccionesCorrectivasDTO> accionesCorrectivas;


    
}

