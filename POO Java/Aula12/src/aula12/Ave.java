package aula12;
public class Ave extends Animal {
    // Atributos
    private String corPena;
    
    // Métodos
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Aves");
    }
    
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }
    
    // Métodos Especiais

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}
