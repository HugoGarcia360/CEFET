import javax.swing.*;
import java.io.*;

public class App2 {
    public static void main(String args[]) {
        String nomeDoArquivo = "text.txt";

        try {
            imprimirArquivoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "Revise o nome do arquivo que você deseja imprimir! " + e.getCause());
            e.printStackTrace();
        } catch (IOException e) {
            // e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado! Entre em contato com o suporte! " + e.getCause());
        } finally {
            System.out.println("Chegou no finally!");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");

    }

    public static void imprimirArquivoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo); // cria um objeto file

        BufferedReader br = new BufferedReader(new FileReader(file.getName())); // cria um objeto buffer para ler o
                                                                                // arquivo
        String line = br.readLine(); // le todas as linhas do arquivo

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // cria um objeto buffer para
                                                                                    // escrever na console

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (line != null);
        bw.flush();
        br.close();
    }

}
