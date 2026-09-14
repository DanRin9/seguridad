package co.edu.uniandes.labociencia.seguridad;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor //Construir objeto de una vez con todos sus datos desde el gist
public class AccionesCorrectivasDTO {
    private int id;
    private String descripcion;
    private String responsable;
    private String fechaLimite;
    private String estado;
}


