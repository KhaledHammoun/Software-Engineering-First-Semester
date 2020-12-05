public class JavaFile
{
  private boolean hasAMainMethod;
  private FileName fileName;

  public JavaFile(String fileName)
  {
    this.fileName = new FileName(fileName, "java");
  }
  public FileName getFileName()
  {
    return fileName.copy();
  }
  public boolean HasAMainMethod()
  {
    return hasAMainMethod;
  }
  public void addAMainMethod()
  {
    hasAMainMethod = true;
  }
  public String toString()
  {
    return "File name: " + fileName + " has a main method: " + hasAMainMethod;
  }
}