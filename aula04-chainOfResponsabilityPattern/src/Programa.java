public class Programa {

    public static void main(String[] args) {
        CheckMail verificaMail = new CheckMail();

        verificaMail.verificar(new Mail("email@email.com", "tecnica@dh.com.br", "Reclamação"));
        verificaMail.verificar(new Mail("email@email.com", "sds@colmeia.com", "Gerência"));
        verificaMail.verificar(new Mail("email@email.com", "cris@colmeia.com", "Comercial"));
        verificaMail.verificar(new Mail("email@email.com", "tecnica@colmeia.com", "Quero meu iate!"));

    }
}
