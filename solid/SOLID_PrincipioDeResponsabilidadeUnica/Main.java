package SOLID_PrincipioDeResponsabilidadeUnica;

public class Main {
    public static void main(String[] args) {


        Usuario usuario = new Usuario("lUIS","lUIS@GMAIL","123");

        Autenticar autenticar = new Autenticar() {
            @Override
            public Boolean autenticar(String senhaDigitada) {
                return null;
            }
        }


    }
}
