import java.util.ArrayList;
import java.util.List;

public class Notebook
{
  private ArrayList<Note> notes;
  private int numberOfNotes;

  public Notebook(int maxNumberOfNotes)
  {
    notes = new ArrayList<Note>(maxNumberOfNotes);
  }
  public Note getNote(int index)
  {
    if (index >= notes.size())
    {
      return null;
    }
    return notes.get(index).copy();
  }
  public String getMessage(int index)
  {
    if (index >= notes.size())
    {
      return null;
    }
    return notes.get(index).copy().getMessage();
  }
  public void addNote(Note note)
  {
    notes.add(note.copy());
  }
  public void addNote(String message)
  {
    notes.add(new Note(message).copy());
  }
  public void addHighPriorityNote(String message)
  {
    Note temp = new Note(message);
    temp.setToHighPriority();
    notes.add(temp);

  }
  public void removeNote(int index)
  {
    if (index < notes.size() && index >= 0)
    {
      notes.remove(index);
    }
  }
  public Note[] getAllNotes()
  {
    return notes.toArray(new Note[notes.size()]);
  }
  public int getNumberOfHighPriorityNotes()
  {
    int highPriorityCounter = 0;
    if (notes.size() > 0)
    {
      for (Note el : notes)
      {
        if (el.isHighPriority())
          highPriorityCounter++;
      }
    }
    return highPriorityCounter;
  }
  public Note[] getAllHighPriorityNotes()
  {
    ArrayList<Note> temp = new ArrayList<Note>();
      for (Note el : notes)
      {
        if (el.isHighPriority())
        {
          temp.add(el);
        }
      }
    return temp.toArray(new Note[temp.size()]);
  }
  public String toString()
  {
    String temp = "";
    for (Note el : notes)
    {
      if (el == null)
      {
        temp += "Empty";
      }
      else
      {
        temp += el + "\n";
      }
    }
    return temp;
  }
}
