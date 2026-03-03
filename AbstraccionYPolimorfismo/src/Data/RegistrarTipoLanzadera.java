package Data;

import Naves.VehiculoEspacial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RegistrarTipoLanzadera implements IRegistrarTipoNave {
    @Override
    public void RegistrarNave(VehiculoEspacial vehiculo) throws IOException {
        //Registraremos los datos en un archivo de texto para ser solamente de ejemplo.
        Path ruta = Path.of("DatosNaveLanzadora.txt");

        StringBuilder textoFormateado = new StringBuilder();
        textoFormateado.append(" --- Nombre Nave: ");
        textoFormateado.append(vehiculo.getNombre());
        textoFormateado.append(" --- Velocidad: ");
        textoFormateado.append(vehiculo.getVelocidad());
        textoFormateado.append(" --- Peso : ");
        textoFormateado.append(vehiculo.getPeso());

        Files.writeString(ruta, textoFormateado);
    }
}
