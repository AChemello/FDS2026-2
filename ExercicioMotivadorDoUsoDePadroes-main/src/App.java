public class App {
    public static void main(String[] args) throws Exception {

        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA, 6, 45);
        Carro utilitario = new Carro("Utilitario", TipoCombustivel.DIESEL, 5, 70);
        Carro suv = new Carro("SUV", TipoCombustivel.GASOLINA, 8, 55);
        Carro suvFlex = new Carro("SUVFlex", TipoCombustivel.GASOLINA, 8, 65);
        Carro econo = new Carro("Econo", TipoCombustivel.GASOLINA, 20, 55);

        econo.abastece(TipoCombustivel.GASOLINA, 55);

        System.out.println("Consumo Inicial: " + econo.getMotor().getConsumo());
        for (int i = 0; i < 50; i++) {
            econo.abastece(TipoCombustivel.GASOLINA, 55);
            System.out.println("Combustível no tanque: " + econo.getTanque().getCombustivelDisponivel() + " litros");
            econo.viaja(200);
        }

        System.out.println("\nConsumo após viagens: " + econo.getMotor().getConsumo());
        System.out.println(econo);

        // suv.getMotor().setTipoMotor(TipoCombustivel.FLEX);
        // suvFlex.getMotor().setTipoMotor(TipoCombustivel.FLEX);

        // //System.out.println("certo" + suv);

        // System.out.println("inicial\n" + suvFlex);

        // suvFlex.abastece(TipoCombustivel.ALCOOL, 65);

        // System.out.println("depois\n" + suvFlex);
    }
}
