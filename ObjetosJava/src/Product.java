import java.util.Date;

/**
 * Esta clase Product se puede usar mucho para complementar con funcionalidades de su sistema, si
 * se trata para la gestion de inventario.
 * @author Dennis Ponce
 * @version 1.0
 * */
public class Product {

    /**
     * name: Puedes setear el nombre de tu producto.
     * */
    public String name;

    /**
     * price: Define el precio unitario de a cuanto vendes este producto.
     * */
    public double price;

    /**
     * discount: Este verifica si tu producto tiene descuento o no.
     * Usa sus setter y getter para poder setear el valor y obtenerlo.
     * */
    private boolean discount;

    /**
     * percentageDiscount: Aqui definimos el porcentaje que se aplicara como descuento.
     * */
    private double percentageDiscount;

    /**
     * stock: El numero total de cuanto tienes en bodega sobre este producto
     * */
    public int stock;

    /**
     * Este verifica si tienes stock en bodega. Cuando llegue a verificar que esta en 0 el stock, lanzara un valor false.
     * @return boolean
     * */
    public boolean ExistStock() {
        if(this.stock == 0)
            return false;

        return true;
    }

    /**
     * Este metodo no retorna nada, solo setea el estado del descuento del producto a TRUE.
     * @param discount Ingresa true si quieres especificar que el producto tendra descuento.
     * */
    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    /**
     * Este metodo no retorna nada, solo setea el estado del descuento del producto a TRUE.
     * @param percentageDiscount Ingresa tu porcentaje de descuento que se aplicara al precio unitario del producto. Debes tener en cuenta
     *                           que esto solo funcionara si has definido setDiscount() en true.
     *
     *
     *                           Por ejemplo:
     *                              Product producto = new Product();
     *                              producto.name = "Galletas";
     *                              producto.price = 11;
     *                              producto.stock = 10;
     *                              producto.setDiscount(true); <- primero definir a true. Si esta false y aun asi define el valor del descuento, no se aplicara.
     *                              producto.setPercentageDiscount(10);
     * */
    public void setPercentageDiscount(double percentageDiscount)
    {
        this.percentageDiscount = percentageDiscount;
    }
}
