public class NotificacaoSMS implements CanalNotificacao{


    @Override
    public void enviar(String mensagem) {
        if (mensagem == null || mensagem.isBlank()) {
            throw new IllegalArgumentException("Mensagem não pode ser vazia");
        }
        System.out.println("Enviando SMS: " + mensagem);
    }
}
