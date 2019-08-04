/*
 * package designpatterns.basics;
 * 
 * import java.util.HashMap; import java.util.Map;
 * 
 * public class StrategyFactory {
 * 
 * public static void main(String[] args) { Building building =
 * BuildingFactory.getBuilding("house"); System.out.println(building.getType());
 * }
 * 
 * 
 * public interface Building{
 * 
 * public String getType();
 * 
 * }
 * 
 * public class House implements Building { public String getType(){ return
 * "house"; } }
 * 
 * public class Edifice implements Building { public String getType(){ return
 * "edifice"; } }
 * 
 * public class BuildingFactory { private static Map<String, Building>
 * instances;
 * 
 * static { instances = new HashMap<>();
 * 
 * instances.put("house", new House()); instances.put("edifice", new Edifice());
 * }
 * 
 * public static <T extends Building> T getBuilding(String type){ return (T)
 * instances.get(type); } }
 * 
 * }
 * 
 * 
 */