
import java.awt.Taskbar;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;



class HelloWorld{
    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println("Fonte de estudos:");
        System.out.println("https://docs.oracle.com/javase/tutorial/");

        String name = "Iuri";
        System.out.println("Bem vindo aos estudos " + name);

        boolean fimDeSemana = true;
        String sairFimSemana = fimDeSemana ? "sair para algum lugar." : "ficar em casa.";
        System.err.println("Neste final de semana eu vou " + sairFimSemana);

        LocalDate nowDate = LocalDate.now();
        System.out.println("Data atual: " + nowDate);
        Locale brasil = new  Locale("pt","BR");
        System.out.println("Localização: " + nowDate.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));

    }
}
