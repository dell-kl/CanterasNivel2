package Data;

import Naves.VehiculoEspacial;

public class RegistrarNave {
    private IRegistrarTipoNave registrarNave;

    public RegistrarNave(IRegistrarTipoNave registrarNave){
        this.registrarNave = registrarNave;
    }

    public void GenerarGuardado(VehiculoEspacial vehiculo) {
        this.registrarNave.RegistrarNave(vehiculo);
    }
}
