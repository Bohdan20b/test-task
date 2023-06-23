import java.util.HashSet;
import java.util.Set;

public class CodeManager {
   private static CodeManager instance;
   private Set<String> usedCodes;

   private CodeManager() {
       usedCodes = new HashSet<>();
   }

   public static synchronized CodeManager getInstance() {
       if (instance == null) {
           instance = new CodeManager();
       }
       return instance;
   }

   public void useCode(String code) {
       usedCodes.add(code);
   }

   public boolean isCodeUsed(String code) {
       return usedCodes.contains(code);
   }
}
