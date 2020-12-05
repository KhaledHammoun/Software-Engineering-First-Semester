public class Brain
{
  private String activeMemoryItem;
  private String passiveMemoryItemOne;
  private String passiveMemoryItemTwo;

  public Brain()
  {
    activeMemoryItem = "";
    passiveMemoryItemOne = "";
    passiveMemoryItemTwo = "";
  }
  public int getIQ()
  {
    int aMemory = -1;
    int pasMemory1 = -1;
    int pasMemory2 = -1;
    if (activeMemoryItem != null)
    {
      aMemory = activeMemoryItem.length();
    }
    if (passiveMemoryItemOne != null)
    {
      pasMemory1 = passiveMemoryItemOne.length();
    }
    if (passiveMemoryItemTwo != null)
    {
      pasMemory2 = passiveMemoryItemTwo.length();
    }
    int IQ = 0;
    if (aMemory < 10 || pasMemory1 < 10 || pasMemory2 < 10)
    {
      IQ = 70;
    }
    if (aMemory >= 10 && pasMemory1 >= 10 && pasMemory2 >= 10)
    {
      IQ = 100;
    }
    if (aMemory > 20 || pasMemory1 > 20 || pasMemory2 > 20)
    {
      if (aMemory > 10 && pasMemory1 > 10 && pasMemory2 > 10)
      {
        IQ = 130;
      }
    }
    return IQ;
  }
  public boolean isBrainDamaged()
  {
    if (activeMemoryItem == null
        || passiveMemoryItemOne == null
        || passiveMemoryItemTwo == null)
      return true;
    else
      return false;
  }
  public void remember(String info)
  {
    passiveMemoryItemTwo = passiveMemoryItemOne;
    passiveMemoryItemOne = activeMemoryItem;
    activeMemoryItem = info;
  }
  public void refreshMemory(String info)
  {
    if (passiveMemoryItemOne.equals(info))
    {
      passiveMemoryItemOne = activeMemoryItem;
      activeMemoryItem = info;
    }
    else if (passiveMemoryItemTwo.equals(info))
    {
      passiveMemoryItemTwo = activeMemoryItem;
      activeMemoryItem = info;
    }
  }
  public boolean recall(String info)
  {
    if (activeMemoryItem.equals(info)
        || passiveMemoryItemOne.equals(info)
        || passiveMemoryItemTwo.equals(info))
    {
      return true;
    }
    else
      return false;
  }
  public String recall()
  {
    return activeMemoryItem;
  }
  public String toString()
  {
    return "Your active memory has: " + activeMemoryItem +
            " your passive memory has: " + passiveMemoryItemOne + ", " + passiveMemoryItemTwo;
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Brain))
    {
      return false;
    }
    Brain otherBrain = (Brain)obj;

    return activeMemoryItem.equals(otherBrain.activeMemoryItem)
           && passiveMemoryItemOne.equals(otherBrain.passiveMemoryItemOne)
           && passiveMemoryItemTwo.equals(otherBrain.passiveMemoryItemTwo);

  }

}

