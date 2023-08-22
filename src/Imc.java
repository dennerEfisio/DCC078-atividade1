public class Imc {

    public float peso;
    public float altura;
    public char genero;

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public char getGenero() {
        return genero;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setGenero(char genero) {
        try{
            if (genero == 'M' || genero == 'm')
                this.genero = genero;
            else if (genero == 'F' || genero == 'f')
                this.genero = genero;
        }catch (Exception err){
            System.out.println(err.getMessage());
        }

    }

    public String calcularIMC(){
        float peso = getPeso();
        float altura = getAltura();
        char genero = getGenero();
        String result;

        float imc = peso/(altura*altura);

        if(genero == 'M' || genero == 'm'){
            if(imc < 20.7) result = "abaixo do peso";
            else if(imc < 26.4) result = "peso normal";
            else if(imc < 27.8) result = "marginalmente acima do peso";
            else if(imc < 31.1) result = "acima do peso ideal";
            else result = "obeso";
        }
        else{
            if(imc < 19.1) result = "abaixo do peso";
            else if(imc < 25.8) result = "peso normal";
            else if(imc < 27.3) result = "marginalmente acima do peso";
            else if(imc < 32.3) result = "acima do peso ideal";
            else result = "obeso";
        }
        return result;
    }
}
