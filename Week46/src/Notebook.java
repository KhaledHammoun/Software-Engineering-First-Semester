import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Notebook
{
  private int numberOfNotes;
  private ArrayList<Note> notes;
  private int maxNumberOfNotes;

  public Notebook(int maxNumberOfNotes)
  {
    numberOfNotes = 0;
    notes = new ArrayList<Note>();
    this.maxNumberOfNotes = maxNumberOfNotes;

  }

  public void addNote(Note note)
  {
    if (notes.size() < maxNumberOfNotes)
      notes.add(note);
  }

  public void setNote(Note note, int index)
  {
    if (index > notes.size() || index < 0)
    {
      throw new ArrayIndexOutOfBoundsException("Non valid index.");
    }
    notes.add(index, note);
  }

  public void removeNote(int index)
  {
    if (index < 0 || index >= notes.size())
    {
      throw new ArrayIndexOutOfBoundsException("Non valid index.");
    }
    notes.remove(index);
  }

  public Note getNote(int index)
  {
    if (index < 0 || index >= notes.size())
    {
      throw new ArrayIndexOutOfBoundsException("Non valid index.");
    }

    return notes.get(index).copy();
  }

  public int getNumberOfPriorityNotes()
  {
    int counter = 0;
    for (Note el : notes)
    {
      if (el != null)
        counter++;
    }
    return counter;
  }

  public PriorityNote[] getPriorityNotes()
  {
    ArrayList<PriorityNote> temp = new ArrayList<PriorityNote>();
    for (Note el : notes)
    {
      if (el != null)
        if (((PriorityNote)el).getPriority() == 1)
          temp.add(0, (PriorityNote) el);
        else if (((PriorityNote)el).getPriority() == 2)
          temp.add((PriorityNote) el);
      for (Note el3 : notes)
      {
        if (el3 != null && ((PriorityNote)el3).getPriority() == 3)
          temp.add((PriorityNote) el3);
      }
    }
    return temp.toArray(new PriorityNote[0]);
  }

  public String toString()
  {
    return "String";
  }
}
