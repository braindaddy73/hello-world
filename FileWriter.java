import java.io.FileWriter;
import java.io.IOException;

public class Persistence {

FileWriter fw = null;

    public Persistence () {
        // Der Konstruktor bleibt leer. Hier passiert noch nix.
    }

    public void write (String zeile) {
        try {
            fw = new FileWriter("daten.csv", true);
            fw.append(zeile + "\n");
        }
        catch (IOException e) {
            System.err.println("Konnte Datei nicht erstellen / öffnen.");
        }
        finally{
            if (fw != null)
                try { fw.close(); } catch (IOException e) {e.printStackTrace(); }
        }
    }
}
