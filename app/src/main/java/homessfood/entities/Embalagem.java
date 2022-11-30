package homessfood.entities;

public class Embalagem {

        private static Embalagem uniqueInstance;
    
        private Embalagem() {
        }
        public static synchronized Embalagem getInstance() {
            if (uniqueInstance == null)
                uniqueInstance = new Embalagem();

            return uniqueInstance;
        }
        public void tipoEmbalagem(){
            
        }
}
