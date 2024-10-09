import java.util.*;
public class Enum 
{
  public static void main(String[] args) {
    Inventory inventory = new Inventory(); 
    inventory.addGuitar()
  }
}


class Guitar
{
  private String serialNumber;
  private double price;
  private Builder builder;
  private String model;
  private Type type;
  private Wood backWood;
  private Wood topWood;

  public Guitar(String serialNumber,double price,Builder builder,
    String model,Type type,Wood backWood,Wood topWood)
  {
    this.serialNumber = serialNumber;
    setPrice(price);
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
  }
  public String getSerialNumber() 
  {
    return serialNumber;
  }
  public double getPrice() 
  {
     return price; 
  }
  public void setPrice(double price) 
  {
    this.price = price;
  }
  public String getBuilder() 
  {
    return this.builder.toString();
  }
  public String getModel() 
  {
    return this.model;
  }
  public String getType() 
  {
    return this.type.toString();
  }
  public String getBackWood()
  {
    return this.backWood.toString(); 
  }
  public String getTopWood() 
  {
    return this.topWood.toString();
  }
}

class Inventory
{
  private List<Guitar> guitars;

  public Inventory() 
  {
    guitars = new LinkedList<Guitar>();
  }
  public void addGuitar(String serialNumber,double price,Builder builder,
    String model,Type type,Wood backWood,Wood topWood) 
  {
    Guitar guitar = new Guitar(serialNumber,price,builder,model,type,backWood,topWood);
    guitars.add(guitar); 
  }
  public Guitar getGuitar(String serialNumber) 
  {
    for (Iterator i = guitars.iterator(); i.hasNext();)
    {
      Guitar guitar = (Guitar)i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) 
      {
        return guitar;
      }
    }

      return null;
  }
  public Guitar search(Guitar guitar) 
  {
    return null; // FIXME: fix this
  }
}

enum Type
{
  ACOUSTIC, ELECTRIC;

  @Override
  public String toString() 
  {
    switch (this) 
    {
      case ACOUSTIC:
        {
          return "acousic";
        }
      case ELECTRIC:
      {
        return "electric";
      }
      default:
      {
        System.out.println("Error: Something bad happend!");
        return "any";
      }
    }
  }
}

enum Builder
{
  FENDER,MARTIN,GIBSON,COLLINGS,OLSON,RYAN,PRS,ANY;

  public String toString() 
  {
    switch (this) 
    {
      case FENDER:
      {
        return "fender";
      }
      case MARTIN:
      {
        return "martin";
      } 
      case GIBSON:
      {
        return "gibson";
      }
      case COLLINGS:
      {
        return "collings";
      }
      case OLSON:
      {
        return "olson";
      }
      case RYAN:
      {
        return "ryan";
      }
      case PRS:
      {
        return "prs";
      }
      case ANY:
      {
        return "any";
      }
      default:
      {
        System.out.println("Error: Something bad happend!");
        return "any";
      }
    }
  }
}

enum Wood
{
  INDIAN_ROSEWOOD,BRAZILIAN_ROSEWOOD,MAHOGANY,MAPLE,COCOBOLO,CEDAR,ADIRONDACK,ALDER,SITKA;

  public String toString() 
  {
    switch (this) 
    {
      case INDIAN_ROSEWOOD:
      {
        return "indian rosewood";
      }
      case BRAZILIAN_ROSEWOOD:
      {
        return "brazilian rozewood";
      }
      case MAHOGANY:
      {
        return "mahohany";
      }
      case MAPLE:
      {
        return "maple";
      }
      case COCOBOLO:
      {
        return "cocobolo";
      }
      case CEDAR:
      {
        return "cedar";
      }
      case ADIRONDACK:
      {
        return "adirondack";
      }
      case ALDER:
      {
        return "alder";
      }
      case SITKA:
      {
        return "sitka";
      }
      default:
      {
        System.out.println("Error: Something bad happend!");
        return "any";
      }
    } 
  }
}
