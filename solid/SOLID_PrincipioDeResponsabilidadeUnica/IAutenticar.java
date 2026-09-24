package SOLID_PrincipioDeResponsabilidadeUnica;

public interface IAutenticar {

    public Boolean autenticar(String senhaDigitada);

    Boolean autenticar(Usuario usuario, String senhaDigitada);

    void autenticar();
}
