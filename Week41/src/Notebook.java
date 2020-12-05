import java.util.ArrayList;
import java.util.List;

public class Notebook
{
  private Note[] notes;
  private int numberOfNotes;

  public Notebook(int maxNumberOfNotes)
  {
    notes = new Note[maxNumberOfNotes];
  }
  public Note getNote(int index)
  {
    if (!(notes[index] != null))
    {
      return null;
    }
    return notes[index].copy();
  }
  public String getMessage(int index)
  {
    if (!(notes[index] != null))
    {
      return null;
    }
    return notes[index].copy().getMessage();
  }
  public void addNote(Note note)
  {
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i] == null)
      {
        notes[i] = note;
        break;
      }
    }
  }
  public void addNote(String message)
  {
    Note temp = new Note(message);
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i] == null)
      {
        notes[i] = temp;
        break;
      }
    }
  }
  public void addHighPriorityNote(String message)
  {
    Note temp = new Note(message);
    temp.setToHighPriority();
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i] == null)
      {
        notes[i] = temp;
        break;
      }
    }
  }
  public void removeNote(int index)
  {
    if (index < notes.length && index >= 0)
    {
      notes[index] = null;
    }
  }
  public Note[] getAllNotes()
  {
    List<Note> temp = new ArrayList<>();
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i] != null)
      {
        temp.add(notes[i]);
      }
    }
    return (Note[])temp.toArray();
  }
  public int getNumberOfHighPriorityNotes()
  {
    int highPriorityCounter = 0;
    if (notes.length > 0)
    {
      for (int i = 0; i < notes.length; i++)
      {
        if (notes[i] != null && notes[i].isHighPriority())
        {
          highPriorityCounter++;
        }
      }
    }
    return highPriorityCounter;
  }
  public Note[] getAllHighPriorityNotes()
  {
    Note[] temp = new Note[getNumberOfHighPriorityNotes()];
    if (notes.length > 0)
    {
      for (int i = 0; i < notes.length; i++)
      {
        if (notes[i] != null && notes[i].isHighPriority())
        {
          for (int j = 0; j < temp.length; j++)
          {
            if (temp[j] == null)
            {
              temp[j] = notes[i].copy();
              break;
            }
          }
        }
      }
    }
    return temp;
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
