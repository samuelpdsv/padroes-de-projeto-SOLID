package SOLID_PrincipioDeResponsabilidadeUnica;

import java.util.Random;

public abstract class Autenticar implements IAutenticar{

    public Autenticar() {
    }
    public Autenticar(String senha) {
    }

    @Override
    public Boolean autenticar(Usuario usuario, String senhaDigitada) {
        Random random = new Random();
        double chanceSucesso = 0.9;

        if(usuario.getSenha().equals(senhaDigitada) && random.nextDouble() < chanceSucesso){
            return true;
        }
        return false;
    }

    @Override
    public void autenticar() {

    }
}
