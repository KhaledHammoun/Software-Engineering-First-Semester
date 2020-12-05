public class NotebookTest
{
  public static void main(String[] args)
  {
    Notebook firstNotebook = new Notebook(3);
    Note firstNote = new Note("proba");
    Note secondNote = new Note("greshka");
    Note thirdNote = new Note("ProbaGreshka");

    firstNotebook.addNote(firstNote);
    firstNotebook.addNote(secondNote);
    firstNotebook.addNote(thirdNote);

    thirdNote.setToHighPriority();
    secondNote.setToHighPriority();

    Note testNote = secondNote.copy();

    System.out.println("Test note: " + testNote);

    Note[] highPriorityArray = firstNotebook.getAllHighPriorityNotes();

    System.out.println(firstNotebook.getNumberOfHighPriorityNotes());
    System.out.println(firstNotebook);

    for (int i = 0; i < highPriorityArray.length; i++)
    {
      System.out.println("High Array: " + highPriorityArray[i]);
    }
  }
}
