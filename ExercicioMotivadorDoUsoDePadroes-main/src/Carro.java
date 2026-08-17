public class Carro {

    private String modelo;
    private Motor motor;
    private TanqueCombustivel tanque;

    public Carro(String modelo, TipoCombustivel tipoCombustivel, int consumoMotor, int capacidadeTanque) {
        this.modelo = modelo;
        motor = new Motor(tipoCombustivel, consumoMotor);
        tanque = new TanqueCombustivel(tipoCombustivel, capacidadeTanque);
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor(){
        return motor;
    }

    public TanqueCombustivel getTanque(){
        return tanque;
    }

    public int getCombustivelDisponivel() {
        return tanque.getCombustivelDisponivel();
    }

    // Retorna a quantidade efetivamente abastecida
    public int abastece(TipoCombustivel tipoCombustivel, int quantidade) {
        int capacidadeLivre = tanque.getCapacidade() - tanque.getCombustivelDisponivel();
        int qtdEfetiva = Math.min(capacidadeLivre, quantidade);
        tanque.abastece(tipoCombustivel, qtdEfetiva);
        if (motor.getTipoMotor() == TipoCombustivel.FLEX) {
            if(tipoCombustivel == TipoCombustivel.GASOLINA){
                motor.setConsumo(8);
                tanque.settipoCombustivel(TipoCombustivel.GASOLINA);
            }else if(tipoCombustivel == TipoCombustivel.ALCOOL){
                motor.setConsumo(6);
                tanque.settipoCombustivel(TipoCombustivel.ALCOOL);
            }
        }
        return qtdEfetiva;
    }

    // Retorna a distancia que consegue viajar com o combustivel remanescente
    public int verificaSePodeViajar(int distancia) {
        int combustivelNecessario = motor.combustivelNecessario(distancia);
        if (tanque.getCombustivelDisponivel() >= combustivelNecessario) {
            return distancia;
        } else {
            return tanque.getCombustivelDisponivel() * motor.getConsumo();
        }
    }

    // Retorna true se conseguiu viajar
    public boolean viaja(int distancia) {
        if (verificaSePodeViajar(distancia) >= distancia) {
            motor.percorre(distancia);
            tanque.gasta(motor.combustivelNecessario(distancia));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Carro:\n  Modelo=" + modelo + "\n  Motor=" + motor + "\n  Tanque=" + tanque;
    }
}
