public class Main {
    public static void main(String[] args) {
        ServicoNotificacao servicoEmail = new ServicoNotificacao(new NotificacaoEmail());
        servicoEmail.notificar("Servidor caiu!");

        ServicoNotificacao servicoSms = new ServicoNotificacao(new NotificacaoSMS());
        servicoSms.notificar("Alerta crítico!");
    }
}
