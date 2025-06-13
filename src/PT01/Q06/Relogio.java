package PT01.Q06;
public class Relogio {
    private int hora;

    public Relogio(int horaInicial) {
        this.hora = horaInicial;
    }

    public void ajustarHora(int novaHora) {
        if (novaHora >= 0 && novaHora <= 23) {
            this.hora = novaHora;
            System.out.println("Hora ajustada para: " + hora + "h");
        } else {
            System.out.println("Hora inválida. Informe um valor entre 0 e 23.");
        }
    }

    public static void main(String[] args) {
        Relogio relogio = new Relogio(10); 
        relogio.ajustarHora(15);           
        relogio.ajustarHora(25);
    }
}
