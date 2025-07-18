public class Retangulo extends FormaGeometrica {
    protected double largura;
    protected double altura;

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setLargura(double largura) {
        if (largura < 0){
            throw  new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }
        this.largura = largura;
    }

    public void setAltura(double altura) {
        if (altura < 0){
            throw  new IllegalArgumentException("Altura deve ser maior ou igual a 0");
        }
        this.altura = altura;
    }

    @Override
    public double area(){
        double area = largura * altura;
        return area;
    }

    @Override
    public String toString() {
        String resultado = String.format("[Retangulo] %.2f / %.2f", largura, altura);
        return resultado;
    }
}
