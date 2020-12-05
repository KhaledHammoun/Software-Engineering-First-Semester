import java.util.ArrayList;

public class JavaProject
{
  private String name;
  private ArrayList<JavaFile> files;

  public JavaProject(String name)
  {
    this.name = name;
    files = new ArrayList<JavaFile>();
  }
  public void addJavaFile(JavaFile file)
  {
    files.add(file);
  }
  public FileName getFileName(int index)
  {
    return files.get(index).getFileName();
  }
  public JavaFile getFirstJavaFileWithAMainMethod()
  {
    for (JavaFile el : files)
    {
      if (el.HasAMainMethod())
      {
        return el;
      }
    }
    return null;
  }
  public String getProjectName()
  {
    return name;
  }


}
