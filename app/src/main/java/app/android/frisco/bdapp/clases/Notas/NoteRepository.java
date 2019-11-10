package app.android.frisco.bdapp.clases.Notas;

import com.orm.SugarRecord;

import java.util.List;

public class NoteRepository {
    public static List<Note> list(){
        List<Note> notes= SugarRecord.listAll(Note.class);
        return notes;
    }

    public static void create(String titulo, String contenido, long id_user){
        Note user=new Note(titulo, contenido, id_user);
        SugarRecord.save(user);
    }
}
