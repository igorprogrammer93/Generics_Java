abstract class Carro {
    protected String marca;
    protected String modelo;
    protected int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract void acelerar();

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }
}

class Sedan extends Carro {
    public Sedan(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println(modelo + " acelerando suavemente...");
    }
}

class SUV extends Carro {
    public SUV(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println(modelo + " acelerando com força!");
    }
}

class Esportivo extends Carro {
    public Esportivo(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println(modelo + " acelerando rapidamente!");
    }
}

public class Main {
    public static void main(String[] args) {
        Carro[] carros = {
            new Sedan("Toyota", "Corolla", 2022),
            new SUV("Jeep", "Compass", 2023),
            new Esportivo("Ferrari", "F8 Tributo", 2024)
        };

        for (Carro carro : carros) {
            carro.exibirDetalhes();
            carro.acelerar();
            System.out.println();
        }
    }
}
