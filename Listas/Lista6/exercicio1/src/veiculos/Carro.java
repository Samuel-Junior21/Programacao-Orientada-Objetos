package veiculos;

public class Carro implements Veiculo {
    private String marca;
    private String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void acelerar() {
       System.out.println("Vruumm! O carro está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("Skkkrr! O carro está freando.");
    }


}
