package Problemas.EjerciciosTema5;

import java.io.File;
import java.io.FileFilter;

public class FiltroA implements FileFilter {
    private String extension;
    public FiltroA(String extension) {
        this.extension= extension;    
    }

    @Override
    public boolean accept(File f) {
        return f.getName().endsWith(this.extension);
    }

}
