package Schnellicher;

public class Productos {
    // Variables generales de productos que debemos usar
    protected String nombre;
    protected String marca;
    protected String precio;
    protected int cantidad;

    // Variables de mi clase Productos_Harina.java
    protected String ingredientes;
    protected double precioHarina;

    // Variables de la clase de otro ProductoD.java
    protected String nombreProducto;
    protected int cantidadProductoD;  // Separar cantidad de ProductoD para evitar confusión

    // constructor unificado
    public Productos() {
        // productos.java
        this.nombre = "SIN NOMBRE";
        this.marca = "SIN MARCA";
        this.precio = "0";
        this.cantidad = 0;

        // Productos_Harina.java
        this.ingredientes = "-Sin datos-";
        this.precioHarina = 0.0;

        // ProductoD.java
        this.nombreProducto = "sin nombre";
        this.cantidadProductoD = 0;
    }

    // Constructor para productos.java
    public Productos(String nombre, String marca, String precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidad = 0;  // opcional, si no se pasa cantidad
        this.nombreProducto = "sin nombre";
        this.cantidadProductoD = 0;
    }

    // Constructor para Productos_Harina.java
    public Productos(String marca, String nombre, String ingredientes, double precioHarina) {
        this.marca = marca;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precioHarina = precioHarina;
        this.cantidad = 0;
        this.nombreProducto = "sin nombre";
        this.cantidadProductoD = 0;
    }





    // Getters y Setters (productos.java)
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getPrecio() { return precio; }
    public void setPrecio(String precio) { this.precio = precio; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    // Getters y Setters (Productos_Harina.java)
    public String getIngredientes() { return ingredientes; }
    public void setIngredientes(String ingredientes) { this.ingredientes = ingredientes; }

    public double getPrecioHarina() { return precioHarina; }
    public void setPrecioHarina(double precioHarina) { this.precioHarina = precioHarina; }

    // Getters y Setters (ProductoD.java)
    public String getNombreProducto() { return nombreProducto; }
    public void setNombreProducto(String nombreProducto) { this.nombreProducto = nombreProducto; }

    public int getCantidadProductoD() { return cantidadProductoD; }
    public void setCantidadProductoD(int cantidadProductoD) { this.cantidadProductoD = cantidadProductoD; }

    // Métodos originales
    public void Imprimir_Pro() {
        System.out.println("///////MOSTRAR PRODUCTO///////");
        
        // Mostrar datos de Productos generales
        if (!nombre.equals("SIN NOMBRE")) {
            System.out.println("Nombre: " + nombre);
        }
        if (!marca.equals("SIN MARCA")) {
            System.out.println("Marca: " + marca);
        }
        if (!precio.equals("0")) {
            System.out.println("Precio: " + precio);
        }
        if (cantidad != 0) {
            System.out.println("Cantidad: " + cantidad);
        }

        // Mostrar datos de Productos_Harina
        if (!ingredientes.equals("-Sin datos-")) {
            System.out.println("Ingredientes: " + ingredientes);
        }
        if (precioHarina != 0.0) {
            System.out.println("Precio Harina: " + precioHarina);
        }

        // Mostrar datos de ProductoD
        if (!nombreProducto.equals("sin nombre")) {
            System.out.println("Nombre ProductoD: " + nombreProducto);
        }
        if (cantidadProductoD != 0) {
            System.out.println("Cantidad ProductoD: " + cantidadProductoD);
        }
    }

    protected void DatosPan() {
        if (!marca.equals("-Sin marca-")) {
            System.out.println("Marca: " + marca);
        } else {
            System.out.println("-No hay datos de la marca-");
        }

        if (!nombre.equals("-Sin nombre-")) {
            System.out.println("Nombre: " + nombre);
        } else {
            System.out.println("-No hay datos del nombre-");
        }

        if (!ingredientes.equals("-Sin datos-")) {
            System.out.println("Ingredientes: " + ingredientes);
        } else {
            System.out.println("-No hay datos de los ingredientes-");
        }

        if (precioHarina != 0.0) {
            System.out.println("Precio: " + precioHarina);
        } else {
            System.out.println("-No hay precio-");
        }
    }
}
