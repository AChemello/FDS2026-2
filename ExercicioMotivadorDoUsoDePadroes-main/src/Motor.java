public class Motor {

    private TipoCombustivel tipoMotor;
    private int consumo; // em quilometros por unidade. Ex: Km/Lt
    private int quilometragem;
    private int consumoInicial;

    public Motor(TipoCombustivel tipoMotor, int consumo) {
        this.tipoMotor = tipoMotor;
        this.consumo = consumo;
        this.consumoInicial = consumo;
    }

    public int getConsumo() {
        if (consumoInicial == 20) {
            int reducao = quilometragem / 5000;
            int consumoAtual = 20 - reducao;
            setConsumo(consumoAtual);
            this.consumo = Math.max(consumoAtual, 10);
        }
        return this.consumo;
    }

    public TipoCombustivel getTipoMotor(){
        return this.tipoMotor;
    }

    public int getQuilometragem(){
        return this.quilometragem;
    }

    public void setTipoMotor(TipoCombustivel tipoMotor){
        this.tipoMotor = tipoMotor;
    }

    public void setConsumo(int consumo){
        this.consumo = consumo;
    }

    public int combustivelNecessario(int distancia) {
        return distancia / getConsumo();
    }

    public void percorre(int distancia) {
        quilometragem += distancia;
    }

    @Override
    public String toString() {
        return "Motor [consumo=" + getConsumo() + ", quilometragem=" + quilometragem + ", tipoMotor=" + tipoMotor + "]";
    }
}
